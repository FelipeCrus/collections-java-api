package OperacoesBasicas.CarrinhoDeCompras;

import OperacoesBasicas.ListaDeTarefas.ListaTarefa;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, Double preco, Integer quantidade ) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nomeItem) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item i : itemList) {
            if (i.getNome().equalsIgnoreCase(nomeItem)) {
                itensParaRemover.add(i);
            }
        }
        itemList.removeAll(itensParaRemover);
    }

        public void calcularValorTotal() {
            double valorTotal = 0.0; // Inicializa o valor total como 0
            for (Item i : itemList) { // Itera sobre a lista de itens
                valorTotal += i.getPreco() * i.getQuantidade(); // Adiciona o preço do item ao valor total
            }
            System.out.println("Valor total: " + valorTotal); // Exibe o valor total
        }

        public int exibirItens() {
            return itemList.size();

        }
    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Item 1", 2.0, 2);
        carrinhoDeCompras.adicionarItem("Item 2", 2.0, 2);
        carrinhoDeCompras.adicionarItem("Item 3", 8.0, 1);
        carrinhoDeCompras.adicionarItem("Item 4", 1.0, 3);

        System.out.println("O numero total de itens no carrinho é: " + carrinhoDeCompras.exibirItens());

        carrinhoDeCompras.removerItem("Item 2");
        System.out.println("O numero total de itens no carrinho é: " + carrinhoDeCompras.exibirItens());

        carrinhoDeCompras.calcularValorTotal();

    }


}
