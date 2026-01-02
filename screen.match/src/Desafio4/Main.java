package Desafio4;

public class Main {
    static void main() {

        ConversaoFinanceira conversor = new ConversorMoeda();

        double valorDolar = 100;
        double valorEmReal = conversor.converterDolarParaReal(valorDolar);

        System.out.println("Valor dolar: " + valorDolar + "$");
        System.out.println("Valor Em Real: " + valorEmReal + "R$");
    }
}
