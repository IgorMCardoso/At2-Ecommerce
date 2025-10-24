package ucb.poo.ecommerce.dao;

import ucb.poo.ecommerce.conexao.conexaoMySQL;
import ucb.poo.ecommerce.models.produto;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class conexaoProdutos {
    private conexaoMySQL conexao = new conexaoMySQL();

    public List<produto> listarProdutos() {
        List<produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM produtos LIMIT 5";

        try (Connection conn = conexao.conectar();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                produto p = new produto(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("descricao"),
                    rs.getDouble("preco"),
                    rs.getInt("quantidade_estoque")
                );
                produtos.add(p);
            }
        } catch (SQLException e) {
            System.err.println("Erro na lista de produtos: " + e.getMessage());
        }

        return produtos;
    }
}
