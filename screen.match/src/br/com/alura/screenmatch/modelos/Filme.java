package br.com.alura.screenmatch.modelos;

public class Filme {
    private String nome;
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public double getTotalDeAvaliacoes() {
        return totalDeAvaliacoes;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public void exibirFichaTecnica() {
        System.out.println("Nome do Filme: " + this.nome);
        System.out.println("Ano de Lancamento: " + this.anoLancamento);
        System.out.println("Avaliação: " + this.somaDasAvaliacoes);
    }

    public void avalia(double nota) {
        this.somaDasAvaliacoes += nota;
        ++this.totalDeAvaliacoes;
    }

    public double pegaMedia() {
        return this.somaDasAvaliacoes / (double) this.totalDeAvaliacoes;
    }
}
