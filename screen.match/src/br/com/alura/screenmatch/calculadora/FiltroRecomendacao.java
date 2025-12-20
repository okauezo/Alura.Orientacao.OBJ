package br.com.alura.screenmatch.calculadora;

import br.com.alura.screenmatch.modelos.Classificavel;

public class FiltroRecomendacao {

    public void Filtra(Classificavel classificavel){
        if (classificavel.getClassificavel() >= 4){
            System.out.println("Em alta no momento");
        } else if(classificavel.getClassificavel() >= 2){
            System.out.println("Com uma media avaliação");
        } else {
            System.out.println("Coloque na sua lista para assistir depois!");
        }
    }
}
