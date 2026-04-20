package DesafiosAluraObj.Desafio1.Spotify;

public class Audio {

    private String titulo;
    private double duracao;
    private double totalDeReproducoes;
    private int curtidas;
    private double classificacao;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getDuracao() {
        return duracao;
    }

    public double getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }

    public void curte(){
        this.curtidas++;
    }
    public void reproduz(){
        this.totalDeReproducoes++;
    }
}
