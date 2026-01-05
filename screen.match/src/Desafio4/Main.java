package Desafio4;

public class Main {
    static void main() {

        ConversaoFinanceira conversor = new ConversorMoeda();

        double valorDolar = 100;
        double valorEmReal = conversor.converterDolarParaReal(valorDolar);

        System.out.println("Valor dolar: " + valorDolar + "$");
        System.out.println("Valor Em Real: " + valorEmReal + "R$");
        System.out.println();

        CalculadoraSalaRetangular sala =
                new CalculadoraSalaRetangular(4, 6);

        System.out.println("Área da sala: " + sala.calcularArea());
        System.out.println("Perímetro da sala: " + sala.calcularPerimetro());
        System.out.println();

        TabuadaMultiplicacao tabuada =
                new TabuadaMultiplicacao(5);

        tabuada.mostrarTabuada();
    }
}
