package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    static void main() {

        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(7);
        Filme outroFilme = new Filme("Vingadores", 2014);
        outroFilme.avalia(6);
        var filmeDoKaue = new Filme("Interistelar", 2016);
        filmeDoKaue.avalia(10);
        Serie strangthings = new Serie("Strang Things", 2016);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(filmeDoKaue);
        lista.add(strangthings);

        for(Titulo item: lista) {
            System.out.println(item.getNome());
            if(item instanceof Filme filme && filme.getClassificavel() > 2) {
            System.out.println("Classificação: " + filme.getClassificavel());
            }
        }

        ArrayList<String>buscaPorArtista = new ArrayList<>();
        buscaPorArtista.add("Travis Scoot");
        buscaPorArtista.add("Vintage Culture");
        buscaPorArtista.add("The Weeknd");

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);
        System.out.println();

        System.out.println("Lista de titulos ordenadas");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println();

        lista.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println("Ordenando por ano");
        System.out.println(lista);

    }
}
