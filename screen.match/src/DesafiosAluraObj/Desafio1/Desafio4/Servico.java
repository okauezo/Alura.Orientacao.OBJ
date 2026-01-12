package DesafiosAluraObj.Desafio1.Desafio4;

public class Servico implements Vendavel {

    private String descricao;
    private double precoHora;

    public Servico(String descricao, double precoHora) {
        this.descricao = descricao;
        this.precoHora = precoHora;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoHora * quantidade;
    }

    @Override
    public double aplicarDesconto(double percentualDesconto) {
        return precoHora - (precoHora * percentualDesconto / 100);
    }
}
