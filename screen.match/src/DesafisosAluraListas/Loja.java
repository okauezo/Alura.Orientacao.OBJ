package DesafisosAluraListas;

import java.time.LocalDate;
import java.util.ArrayList;

public class Loja {
    static void main() {

        ArrayList<Produto>listaDeProdutos = new ArrayList<>();
        listaDeProdutos.add(new Produto("Garrafa", 45.8,5));
        listaDeProdutos.add(new Produto("Fone de ouvido", 499.8,3));
        listaDeProdutos.add(new Produto("Caderno", 9.9,14));
        listaDeProdutos.add(new Produto("Lapis", 4,22));

        Produto p1 = new Produto("Coberto", 26,2);
        Produto p2 = new Produto("Travesseiro",14,2);
        Produto p3 = new Produto("Papel", 0.5,100);

        LocalDate validade = LocalDate.of(2026,12,22);
        ProdutoPerecivel perecivel = new ProdutoPerecivel("Chocolate",14.98,2, validade);

        System.out.println("Tamanho da Lista de Produtos: " + listaDeProdutos.size());
        System.out.println("Produto escolhido:" + listaDeProdutos.get(1));
        System.out.println("Lista completa: " + listaDeProdutos);
        System.out.println();

        System.out.println("Lista de Produto P1: " + p1);
        System.out.println("Lista de Produto P2: " + p2);
        System.out.println("Lista de Produto P3: " + p3);
        System.out.println();

        System.out.println("Lista de Produto Perecivel: " + perecivel + "Validade de Produto: " + validade);
    }
}
