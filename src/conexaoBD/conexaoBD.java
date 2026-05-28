package conexaoBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexaoBD {
    
    private static final String URL = "jdbc:mysql://localhost:3306/sistema_cw";
    private static final String USER = "root"; // Usuário padrão
    private static final String PASS = "admin";     

    public static Connection getConexao() {
        try {
            return DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            throw new RuntimeException("Erro na conexão: " + e.getMessage());
        }
    }
}