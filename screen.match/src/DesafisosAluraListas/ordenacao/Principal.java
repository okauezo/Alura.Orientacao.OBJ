package DesafisosAluraListas.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Principal {
    static void main() {
        //Primeiro exercicio.

        NumInteiros num1 = new NumInteiros(1);
        NumInteiros num3 = new NumInteiros(15);
        NumInteiros num2 = new NumInteiros(2);
        NumInteiros num4 = new NumInteiros(10);
        NumInteiros num5 = new NumInteiros(70);

        List<NumInteiros> lista = new ArrayList<>();
        lista.add(num1);
        lista.add(num2);
        lista.add(num3);
        lista.add(num4);
        lista.add(num5);

        Collections.sort(lista);
        System.out.println(lista);
        System.out.println();
        // Segundo exercicio.

        Titulo titulo1 = new Titulo("Marvel");
        Titulo titulo2 = new Titulo("DC");
        Titulo titulo3 = new Titulo("Dark");
        Titulo titulo4 = new Titulo("Fallout");

        List<Titulo> listaTitulo = new ArrayList<>();
        listaTitulo.add(titulo1);
        listaTitulo.add(titulo2);
        listaTitulo.add(titulo3);
        listaTitulo.add(titulo4);

        System.out.println(listaTitulo);
        Collections.sort(listaTitulo);
        System.out.println("Depois da ordenacao");
        System.out.println(listaTitulo);
        System.out.println();
        // Quarto exercicio.

        List<String> listaObj = new LinkedList<>();
        listaObj.add("Mouse");
        listaObj.add("Caneta");
        listaObj.add("Notebook");
        listaObj.add("Lapis");

        Collections.sort(listaObj);
        System.out.println("Com ordenação");
        System.out.println(listaObj);
    }
}
