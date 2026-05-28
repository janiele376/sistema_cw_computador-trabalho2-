package sistema_cw;

import conexaoBD.conexaoBD; // Importa a classe do pacote correto
import java.sql.Connection;
import javax.swing.JOptionPane;
import telas.Login; 

public class Sistema_cw {

    public static void main(String[] args) {
        try {
            Connection con = conexaoBD.getConexao();

            if (con != null) {
                con.close();
                
                java.awt.EventQueue.invokeLater(() -> {
                    new Login().setVisible(true);
                });
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, 
                "Erro ao conectar ao banco sistema_cw!\n" + e.getMessage(),
                "Erro Crítico", 
                JOptionPane.ERROR_MESSAGE);
            
            System.exit(0);
        }
    }
}