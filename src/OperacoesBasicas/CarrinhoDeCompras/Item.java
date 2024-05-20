package OperacoesBasicas.CarrinhoDeCompras;

public class Item {

    private String nome;
    private Double preco;
    private Integer quantidade;

    public Item(String nome, Double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }
    public Integer getQuantidade() {
        return quantidade;
    }

}
