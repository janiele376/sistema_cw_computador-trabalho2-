package ui;

import javax.swing.*;
import java.awt.*;

public class ImagePanel extends JPanel {
    private Image imagem;

    public ImagePanel(String caminho) {
        this.imagem = new ImageIcon(caminho).getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        if (imagem != null) {
            g.drawImage(imagem, 0, 0, getWidth(), getHeight(), this);
        }
    }
}