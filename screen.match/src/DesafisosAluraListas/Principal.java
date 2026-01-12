package DesafisosAluraListas;

import java.util.ArrayList;

public class Principal {
    static void main() {

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();
        listaDePessoas.add(new Pessoa("Kauê", 21, 1.74));
        listaDePessoas.add(new Pessoa("Sarah", 20, 1.66));
        listaDePessoas.add(new Pessoa("Tania", 45, 1.70));

        System.out.println("Tamanho da lista: " + listaDePessoas.size());
        System.out.println("Primeira Pessoa Da Lista: " + listaDePessoas.get(0));
        System.out.println(listaDePessoas);
    }
}
