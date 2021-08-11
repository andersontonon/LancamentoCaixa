package Banco;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**||
 *
 * @author Anderson Tonon
 */

public class ConexaoMySQL {
    
    public static String status = "Não conectou...";
    
    public ConexaoMySQL() {
        
    }
    
    public static java.sql.Connection getConexaoMySQL() {
        Connection connection = null;

        try {
            String driverName = "com.mysql.jdbc.Driver";

            Class.forName(driverName);

            String serverName = "localhost";
            String mydatabase = "lancamentocaixa";
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;
            String username = "root";
            String password = "";

            connection = DriverManager.getConnection(url, username, password);

            if (connection != null) {
                status = ("STATUS--->Conectado com sucesso!");
            } else {
                status = ("STATUS--->Não foi possivel realizar conexão");
            }
            return connection;

        } catch (ClassNotFoundException e) {
            
            System.out.println("O driver expecificado nao foi encontrado.");
            return null;
            
        } catch (SQLException e) {

            System.out.println("Nao foi possivel conectar ao Banco de Dados.");

            return null;
        }
    }

    public static String statusConection() {
        return status;
    }

    public static boolean FecharConexao() {

        try {
            ConexaoMySQL.getConexaoMySQL().close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    public static java.sql.Connection ReiniciarConexao() {

        FecharConexao();
        return ConexaoMySQL.getConexaoMySQL();
    }
    
    public static boolean LoginSql(String consulta, String login, String senha) throws SQLException {

        Connection conexao = getConexaoMySQL();
        PreparedStatement stmt1 = conexao.prepareStatement(consulta);
        ResultSet rs = stmt1.executeQuery();

        rs.last();
        int rowcount = rs.getRow();
        rs.beforeFirst();

        while (rowcount > 0) {
            rs.next();
            String col1 = rs.getString(2);
            String col2 = rs.getString(4);


            if (login.equals(col1) && senha.equals(col2)) {

                return true;
            }
            rowcount--;
        }
        conexao.close();
        return false;
    }
    public static String[] buscarUsuario(String consulta, String login) throws SQLException {

        Connection conexao = getConexaoMySQL();
        PreparedStatement stmt1 = conexao.prepareStatement(consulta);
        ResultSet rs = stmt1.executeQuery();

        rs.last();
        int rowcount = rs.getRow();
        rs.beforeFirst();
        
        String[] user = new String[4];
        
        while (rowcount > 0) {
            rs.next();
            String col1 = rs.getString(2);

            if (login.equals(col1) ) {
                
                user[0] = rs.getString(1);
                user[1] = rs.getString(2);
                user[2] = rs.getString(3);
                user[3] = rs.getString(4);
                
                return user;
            }
            rowcount--;
        }
        conexao.close();
        return null;

    }
    public static boolean removerUser(String sql, int id) throws SQLException {

        Connection conexao = getConexaoMySQL();

        PreparedStatement stmt1 = conexao.prepareStatement(sql + id);
        boolean status = stmt1.execute();
        
        stmt1.close();
        
        return status;
    }
    
    public static boolean cadastrarUser(String sql, String user, String nome, String senha) throws SQLException {
        
        Connection conexao = getConexaoMySQL();
        PreparedStatement stmt1 = conexao.prepareStatement(sql);
        stmt1.setString(1, user);
        stmt1.setString(2, nome);
        stmt1.setString(3, senha);
                   
        boolean status = stmt1.execute();
        stmt1.close();
        return status;
    }
    
    public static boolean editarUser(String sql, String user, String nome, String senha, String id) throws SQLException {
        
        Connection conexao = getConexaoMySQL();
        PreparedStatement stmt1 = conexao.prepareStatement(sql);
        stmt1.setString(1, user);
        stmt1.setString(2, nome);
        stmt1.setString(3, senha);
        stmt1.setString(4, id);
               
        boolean status = stmt1.execute();
        stmt1.close();
        return status;
    }
        
    
    public static boolean CadastrarLancamento(String sql, String dados[]) throws SQLException {
        
        boolean status; 
        Connection conexao = getConexaoMySQL();
        PreparedStatement statement = conexao.prepareStatement(sql);

        for (int i = 1; i <= dados.length; i++) {
            statement.setString(i, dados[i - 1]);

        }
        statement.execute();
        statement.close();
        status = true;
        return status;
    }
    public static String[][] BuscarLancamento(String sql, String nome) throws SQLException{

        Connection conexao = getConexaoMySQL();
        PreparedStatement stmt1 = conexao.prepareStatement(sql);
        stmt1.setString(1, nome);
        ResultSet rs = stmt1.executeQuery();

        rs.last();
        int rowcount = rs.getRow();
        rs.beforeFirst();
        
        int x = 0;
        int pos = 0;
        String[][] busca = new String[rowcount][];
        
        System.out.println(rowcount);
        while (rowcount > x) {

            rs.next();

            String col1 = rs.getString(2);
            
            if (nome.equals(col1)) {

                busca[pos] = new String[12];

                for (int i = 0; i < 12; i++) {
                    
                    busca[pos][i] = rs.getString(i + 1);
                    System.out.println(busca[pos][i]);
                }
                pos++;

            }
            x++;
        }
        conexao.close();
        return busca;
    }
        
    public static String[] BuscarLancamentoData(String sql) throws SQLException{

        Connection conexao = getConexaoMySQL();
        PreparedStatement stmt1 = conexao.prepareStatement(sql);
        ResultSet rs = stmt1.executeQuery();

        
        rs.last();
        int rowcount = rs.getRow();
        rs.beforeFirst();

        String[] busca = new String[rowcount];
        int i = 0;
        
        while (i < rowcount) {
            rs.next();
            busca[i] = rs.getString(1);
            i++;
        }
        
        conexao.close();
        return busca;

    }
        public static String[][] BuscarLancamentoData(String sql, String nome) throws SQLException{

        Connection conexao = getConexaoMySQL();
        PreparedStatement stmt1 = conexao.prepareStatement(sql);
        stmt1.setString(1, nome);
        ResultSet rs = stmt1.executeQuery();

        rs.last();
        int rowcount = rs.getRow();
        rs.beforeFirst();
        
        int x = 0;
        int pos = 0;
        String[][] busca = new String[rowcount][];
        
        System.out.println(rowcount);
        while (rowcount > x) {

            rs.next();

            String col1 = rs.getString(12);
            
            if (nome.equals(col1)) {

                busca[pos] = new String[12];

                for (int i = 0; i < 12; i++) {
                    
                    busca[pos][i] = rs.getString(i + 1);
                    System.out.println(busca[pos][i]);
                }
                pos++;

            }
            x++;
        }
        conexao.close();
        return busca;
    }
}
