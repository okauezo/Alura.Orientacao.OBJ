package DesafiosAluraObj.Desafio1.Desafio4;

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
        System.out.println();

        Vendavel produto1 = new Produto("Teclado", 100);
        Vendavel servico = new Servico("Instalação", 80);

        System.out.println("Produto (3 unidades): " + produto1.calcularPrecoTotal(3));
        System.out.println("Produto com 10% desconto: " + produto1.aplicarDesconto(10));

        System.out.println("Serviço (2 horas): " + servico.calcularPrecoTotal(2));
        System.out.println("Serviço com 5% desconto: " + servico.aplicarDesconto(5));
    }
}
