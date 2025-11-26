package br.com.alura.screenmatch.calculadora;

import br.com.alura.screenmatch.modelos.Filme;

public class CalculadoraDeTempo {

    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }
    public void inclui(Filme f){
        tempoTotal += f.getDuracaoEmMinutos();
    }
}
