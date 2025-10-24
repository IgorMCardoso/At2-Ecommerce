package ucb.poo.ecommerce.models;

public class produto {
    private int id;
    private String nome;
    private String descricao;
    private double preco;
    private int quantidade;

    public produto(int id, String nome, String descricao, double preco, int quantidade) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return String.format(
            "ID: %d | Nome: %s | Preço: R$%.2f | Estoque: %d | Descrição: %s",
            id, nome, preco, quantidade, descricao
        );
    }
}
