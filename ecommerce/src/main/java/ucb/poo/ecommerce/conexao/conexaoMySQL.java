package ucb.poo.ecommerce.conexao;

import ucb.poo.ecommerce.interfaces.interfaceConexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexaoMySQL implements interfaceConexao {
    private static final String URL = "jdbc:mysql://localhost:3306/ecommerce";
    private static final String USUARIO = "root";
    private static final String SENHA = "1805Igor";
    
    @Override
    public Connection conectar() {
    try {
        Class.forName("com.mysql.cj.jdbc.Driver"); // <-- força o carregamento do driver
        Connection conn = DriverManager.getConnection(URL, USUARIO, SENHA);
        System.out.println("Conectado com sucesso!");
        return conn;
    } catch (SQLException e) {
        System.err.println("Erro na conexão: " + e.getMessage());
        return null;
    } catch (ClassNotFoundException e) {
        System.err.println("Driver JDBC não encontrado: " + e.getMessage());
        return null;
    }
    }

    @Override
    public void desconectar(Connection conn) {
        try {
            if (conn != null && !conn.isClosed()) {
                conn.close();
                System.out.println("Fim da conexão.");
            }
        } catch (SQLException e) {
            System.err.println("Erro ao se desconectar: " + e.getMessage());
        }
    }
}
