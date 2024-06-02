package Classes;

import java.sql.Connection;
import javax.swing.JOptionPane; 
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    static Connection conn = null;
    
    public static Connection conectBD(){
        try {
            String url= "jdbc:mysql://localhost:3306/postosucelso?user=root&password=12345678";
            conn = DriverManager.getConnection(url);
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Conexão " + erro.getMessage());
        }
        return conn;
    } 
        
    public static void desconectar() {
        if (conn != null) {
            try {
                conn.close();
                System.out.println("Conexão fechada com sucesso.");
            } catch (SQLException e) {
                System.out.println("Erro ao fechar a conexão com o banco de dados: " + e.getMessage());
            }
        }
    }
}
