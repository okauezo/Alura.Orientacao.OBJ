package Desafio1;

public class Musica {
    // 3. Crie uma classe Musica com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes,
    // e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.

    String titulo;
    String artista;
    int anoLancamento;
    double somaDasNotas;
    double numAvaliacoes;

    public void exibirFixaTecnica() {
        System.out.println("Título: " + this.titulo);
        System.out.println("Artista: " + this.artista);
        System.out.println("Ano de Lançamento: " + this.anoLancamento);
        System.out.println("Média de Avaliação: " + calcularMedia());
        System.out.println("Número de Avaliações: " + this.numAvaliacoes);
    }

    public void avaliar(double nota) {
        somaDasNotas += nota;
        numAvaliacoes++;
    }

    public double calcularMedia() {
        if (numAvaliacoes == 0) {
            return 0;
        }
        return somaDasNotas / numAvaliacoes;
    }
}
