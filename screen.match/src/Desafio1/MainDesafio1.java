package Desafio1;

public class MainDesafio1 {
    public static void main() {

        PessoaDesafio1 pessoa = new PessoaDesafio1();
        pessoa.exibirMensagem();
        System.out.println();

        Calculadora calcular = new Calculadora();
        double resultado = calcular.numero(8);
        System.out.println(" O dobro entre os Numeros é: " + resultado );
        System.out.println();

        Musica musica = new Musica();
        musica.titulo = "COFFEE BEAN";
        musica.artista = "Travis Scoot";
        musica.anoLancamento = 2018;

        musica.avaliar(9);
        musica.avaliar(8);
        musica.avaliar(10);

        musica.exibirFixaTecnica();
        System.out.println();

        Carro carro = new Carro();
        carro.modelo = "Polo";
        carro.ano = 2019;
        carro.cor = "Chumbo";
        carro.calcularIdade();
        carro.fichaTecnica();
    }
}
