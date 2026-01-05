package Desafio4;

public class Main {
    static void main() {

        ConversaoFinanceira c = new ConversorMoeda();

        double valorDolar = 100;
        double valorEmReal = c.converterDolarParaReal(valorDolar);

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
        System.out.println();

        ConversorTemperaturaPadrao con =
                new ConversorTemperaturaPadrao(30);

        System.out.println("C para F: " + con.celsiusParaFahrenheit());

        ConversorTemperaturaPadrao conversor2 =
                new ConversorTemperaturaPadrao(86);

        System.out.println("F para C: " + conversor2.fahrenheitParaCelsius());
        System.out.println();


        Calculavel livro = new Livro(100);
        Calculavel produto = new ProdutoFisico(100);

        System.out.println("Preço final do livro: " + livro.calcularPrecoFinal());
        System.out.println("Preço final do produto físico: " + produto.calcularPrecoFinal());
    }
}
