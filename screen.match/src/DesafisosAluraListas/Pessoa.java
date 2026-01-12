package DesafisosAluraListas;

public class Pessoa {

    private String nome;
    private int idade;
    private double altura;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Pessoa{");
        sb.append("nome='").append(nome).append('\'');
        sb.append(", Idade=").append(idade);
        sb.append(", altura=").append(altura);
        sb.append('}');
        return sb.toString();
    }
}
