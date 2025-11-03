public class Filme {
    String nome;
    int anoLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    public double getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    void exibirFichaTecnica() {
        System.out.println("Nome do Filme: " + this.nome);
        System.out.println("Ano de Lancamento: " + this.anoLancamento);
        System.out.println("Avaliação: " + this.somaDasAvaliacoes);
    }

    void avalia(double nota) {
        this.somaDasAvaliacoes += nota;
        ++this.totalDeAvaliacoes;
    }

    double pegaMedia() {
        return this.somaDasAvaliacoes / (double)this.totalDeAvaliacoes;
    }
}
