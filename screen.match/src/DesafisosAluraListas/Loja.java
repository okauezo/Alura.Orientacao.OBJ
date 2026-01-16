package DesafisosAluraListas;

import java.util.ArrayList;

public class Loja {
    static void main() {

        ArrayList<Produto>listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(new Produto("Garrafa", 45.8,5));
        listaDeProdutos.add(new Produto("Fone de ouvido", 499.8,3));
        listaDeProdutos.add(new Produto("Caderno", 9.9,14));
        listaDeProdutos.add(new Produto("Lapis", 4,22));

        System.out.println("Tamanho da Lista de Produtos: " + listaDeProdutos.size());
        System.out.println("Produto escolhido:" + listaDeProdutos.get(1));
        System.out.println("Lista completa: " + listaDeProdutos);
    }
}
