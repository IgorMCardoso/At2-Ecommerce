package ucb.poo.ecommerce;

import ucb.poo.ecommerce.dao.conexaoProdutos;
import ucb.poo.ecommerce.models.produto;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        conexaoProdutos conexaoProdutos = new conexaoProdutos();
        List<produto> produtos = conexaoProdutos.listarProdutos();

        System.out.println("Lista de produtos");
        for (produto p : produtos) {
            System.out.println(p);
        }
    }
}
