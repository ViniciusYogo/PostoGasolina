package Classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import javax.swing.JTextArea;
import view.TelaPrincipalAtendente;
import view.TelaprincialGerente;
public class Funcoes {
    
public static boolean VerificarUsuario(String Usuario, String senha) {
    Connection conectar = Conexao.conectBD();
    
    if(conectar != null){
        try{
            String sql = "SELECT USUARIO, SENHA, CARGO_FUNC FROM FUNCIONARIO WHERE USUARIO = ? AND SENHA = ?";         
            PreparedStatement vei = conectar.prepareStatement(sql);
      
            vei.setString(1, Usuario);
            vei.setString(2, senha);
         
            
            ResultSet rs = vei.executeQuery(); 
          
            // Verifique se há algum resultado retornado pela consulta
            if (rs.next()) {
                String cargos = rs.getString("CARGO_FUNC");
                JOptionPane.showMessageDialog(null, "Usuário autenticado com sucesso.");   
                if("Gerente".equals(cargos)){
                     java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                        new TelaprincialGerente().setVisible(true);
                        }
                        });                     
                     return true;
                }
                else if ("Atendente".equals(cargos)){
                    java.awt.EventQueue.invokeLater(new Runnable() {
                    public void run() {
                    new TelaPrincipalAtendente().setVisible(true);
                        }
                     });
                    return true;
                }
                
            } else {
                JOptionPane.showMessageDialog(null, "Usuário ou senha incorretos.");   
            }
        } catch (SQLException e) {
            System.out.println("Erro ao verificar o usuário: " + e.getMessage());
        } finally {
            try {
                conectar.close(); // Fechar a conexão com o banco de dados
            } catch (SQLException e) {
                System.out.println("Erro ao fechar a conexão com o banco de dados: " + e.getMessage());
            }
        }
    }
    return false;
}
 
    
    public static boolean inserirVeiculos(Atributos as) {
        Connection conectar = Conexao.conectBD();
        
        if(conectar != null){
            try{
                String sql = "INSERT INTO VEICULO (PLACA, MODELO, id_combustivel_Fk, LITROSABASTECIDOS) VALUES ( ?, ?, ?, ?)";
                
                PreparedStatement vei = conectar.prepareStatement(sql);
                vei.setString(1, as.getPlaca());
                vei.setString(2,as.getModelo());
                vei.setInt(3,as.getIdGasolina());
                vei.setDouble(4,as.getLitros());
                
                int linhasAfetadas = vei.executeUpdate();
            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Veículo inserido com SuCelso.");   
                    return true;
                }
            } catch (SQLException e) {
                System.out.println("Erro ao inserir o produto: " + e.getMessage());
            } finally {
                Conexao.desconectar();
            }
        }
        return false;
        }
    
    

    public static boolean Abastecer(Atributos as) {
    Connection conectar = Conexao.conectBD();
    
    if(conectar != null){
        try{
            // Consulta para obter o valor do litro da gasolina
            String gaso = "SELECT VALOR_LITRO_GASOLINA FROM COMBUSTIVEL WHERE id_combustivel = ?";
            PreparedStatement gasosa = conectar.prepareStatement(gaso);
            gasosa.setInt(1, as.getIdGasolina());
            ResultSet rsGasolina = gasosa.executeQuery(); 
            float valorLitroGasolina = 0;
            if (rsGasolina.next()) {
                valorLitroGasolina = rsGasolina.getFloat("VALOR_LITRO_GASOLINA");
            } else {
                JOptionPane.showMessageDialog(null, "Tipo de combustível não encontrado.");
                return false;
            }
            
            // Atualização dos dados do veículo
            String sql = "UPDATE VEICULO SET LITROSABASTECIDOS = LITROSABASTECIDOS + ?, TOTAL_VENDA = TOTAL_VENDA + ? WHERE PLACA = ? AND MODELO = ?";
            PreparedStatement vei = conectar.prepareStatement(sql);
            vei.setDouble(1, as.getLitros());
            vei.setFloat(2, (float) (as.getLitros() * valorLitroGasolina));
            vei.setString(3, as.getPlaca());
            vei.setString(4, as.getModelo());
            int rowsAffected = vei.executeUpdate(); 
            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Abastecido com sucesso.");
                return true;
            } else {
                JOptionPane.showMessageDialog(null, "Veículo não encontrado.");
                return false;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao abastecer: " + e.getMessage());
        } finally {
            Conexao.desconectar();
        }
    }
    return false;
}

     public static boolean inserirProduto(Atributos as) {
    Connection conectar = Conexao.conectBD();
    
    if(conectar != null){
        try{
            String sql = "INSERT INTO PRODUTO (NOME_PRODUTO, PRECO_PRODUTO, QUANTIDADE_EM_ESTOQUE) VALUES (?, ?, ?)";
            PreparedStatement vei = conectar.prepareStatement(sql);
            vei.setString(1, as.getNomeProd());
            vei.setDouble(2, as.getPrecoProd());
            vei.setInt(3, as.getQuantProd());
            
            int linhasAfetadas = vei.executeUpdate();
            if (linhasAfetadas > 0) {
            JOptionPane.showMessageDialog(null, "Produto inserido com Sucelso.");    
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao inserir o produto: " + e.getMessage());
        } finally {
            Conexao.desconectar();
        }
    }
    return false;
}

    
public static boolean Estocar(Atributos as) {
        Connection conectar = Conexao.conectBD();
        
        if(conectar != null){ 
            try{
                String sql = "UPDATE PRODUTO SET QUANTIDADE_EM_ESTOQUE  = (? + QUANTIDADE_EM_ESTOQUE) WHERE NOME_PRODUTO = ? AND ID_Produto = ? ";

                PreparedStatement vei = conectar.prepareStatement(sql);
                vei.setDouble(1,as.getQuantProd());
                vei.setString(2, as.getNomeProd());
                vei.setDouble(3,as.getIdProd());
                
                
                
                int linhasAfetadas = vei.executeUpdate();
            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Estocado com Sucelso.");
                    return true;
                }
            } catch (SQLException e) {
                System.out.println("Erro ao inserir o produto: " + e.getMessage());
            } finally {
                Conexao.desconectar();
            }
        }
        return false;
        }
     
      
public static boolean Vender(Atributos as) {
        Connection conectar = Conexao.conectBD();
        
        if(conectar != null){ 
            try{
                String sql = "UPDATE PRODUTO SET QUANTIDADE_EM_ESTOQUE  = (QUANTIDADE_EM_ESTOQUE - ?) WHERE NOME_PRODUTO = ? AND ID_Produto = ?  and QUANTIDADE_EM_ESTOQUE >= ?";

                                
                PreparedStatement vei = conectar.prepareStatement(sql);
                vei.setDouble(1,as.getQuantProd());
                vei.setString(2, as.getNomeProd());
                vei.setDouble(3,as.getIdProd());
                vei.setDouble(4,as.getQuantProd());

                
                
                int linhasAfetadas = vei.executeUpdate();
            if (linhasAfetadas > 0) {
                JOptionPane.showMessageDialog(null, "Vendido com Sucelso.");
                    return true;
                }
            } catch (SQLException e) {
                System.out.println("Erro ao inserir o produto: " + e.getMessage());
            } finally {
                Conexao.desconectar();
            }
        }
        return false;
        }
         
public static boolean CadastrarFunc(Atributos as) {
    Connection conectar = Conexao.conectBD();
    
    if(conectar != null){
        try{
                String sql = "INSERT INTO FUNCIONARIO (NOME_FUNC, CARGO_FUNC,USUARIO,SENHA ) VALUES (?, ?, ?, ?)";
            PreparedStatement vei = conectar.prepareStatement(sql);
            vei.setString(1, as.getNomeFunc());
            vei.setString(2, as.getCargoFunc());
            vei.setString(3, as.getUsuario());
            vei.setString(4, as.getSenha());           
            
            int linhasAfetadas = vei.executeUpdate();
            if (linhasAfetadas > 0) {
            JOptionPane.showMessageDialog(null, "Funcionário cadastrado com Sucelso");    
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao inserir o produto: " + e.getMessage());
        } finally {
            Conexao.desconectar();
        }
    }
    return false;
}
     



  public static boolean VerificarQuant(Atributos as) {
    Connection conectar = Conexao.conectBD();
    
    if(conectar != null){
        try{
            String sql = "SELECT QUANTIDADE_EM_ESTOQUE FROM PRODUTO WHERE ID_PRODUTO = ? AND NOME_PRODUTO = ?";
            PreparedStatement vei = conectar.prepareStatement(sql);
            vei.setString(2, as.getNomeProd());
            vei.setInt(1,as.getIdProd());
            
            ResultSet rs = vei.executeQuery();     
            if (rs.next()){
            int quant = rs.getInt("QUANTIDADE_EM_ESTOQUE");
            JOptionPane.showMessageDialog(null, quant );       
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Erro ao ver produto " + e.getMessage());
        } finally {
            Conexao.desconectar();
        }
    }
    return false;
}
  
   public static void exibirRelatorio(JTextArea textArea) {
        Connection conectar = Conexao.conectBD();

        if (conectar != null) {
            try {
                String sql = "SELECT NOME_PRODUTO, QUANTIDADE_EM_ESTOQUE, PRECO_PRODUTO FROM PRODUTO";
                PreparedStatement vei = conectar.prepareStatement(sql);

                ResultSet rs = vei.executeQuery();

                StringBuilder relatorio = new StringBuilder();
                while (rs.next()) {
                    String nomeProduto = rs.getString("NOME_PRODUTO");
                    int quantidade = rs.getInt("QUANTIDADE_EM_ESTOQUE");
                    double preco = rs.getDouble("PRECO_PRODUTO");

                    relatorio.append("Nome do Produto: ").append(nomeProduto).append(", Quantidade em Estoque: ").append(quantidade).append(", Preço do Produto: ").append(preco).append("\n").append("___________________________________________________________________________").append("\n");
                }

                textArea.setText(relatorio.toString());
            } catch (SQLException e) {
                System.out.println("Erro ao ver relatório " + e.getMessage());
            } finally {
                Conexao.desconectar();
            }
        }
    }


   
    
public static void RelatoriaAbastecimento(JTextArea textArea) {
    Connection conectar = Conexao.conectBD();

    if (conectar != null) {
        try {
            String sql = "SELECT PLACA, MODELO, LITROSABASTECIDOS, TOTAL_VENDA FROM VEICULO";
            PreparedStatement vei = conectar.prepareStatement(sql);

            ResultSet rs = vei.executeQuery();

            StringBuilder relatorio = new StringBuilder();
            while (rs.next()) {
                String placa = rs.getString("PLACA");
                String modelo = rs.getString("MODELO");
                double litrosAbastecidos = rs.getDouble("LITROSABASTECIDOS");
                double totalVenda = rs.getDouble("TOTAL_VENDA");

                relatorio.append("Placa: ").append(placa).append(", Modelo: ").append(modelo)
                          .append(", Litros Abastecidos: ").append(litrosAbastecidos)
                          .append(", Total Venda: ").append(totalVenda).append("\n")
                          .append("___________________________________________________________________________\n");
            }

            textArea.setText(relatorio.toString());
        } catch (SQLException e) {
            System.out.println("Erro ao ver relatório: " + e.getMessage());
        } finally {
            Conexao.desconectar();
        }
    }
}
    }

