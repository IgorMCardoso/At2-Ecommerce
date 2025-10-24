package ucb.poo.ecommerce.interfaces;

import java.sql.Connection;

public interface interfaceConexao {
    Connection conectar();
    void desconectar(Connection conn);
}
