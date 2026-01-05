package Desafio4;

public class Produto implements Vendavel {

    private String nome;
    private double precoUnitario;

    public Produto(String nome, double precoUnitario) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoUnitario * quantidade;
    }

    @Override
    public double aplicarDesconto(double percentualDesconto) {
        return precoUnitario - (precoUnitario * percentualDesconto / 100);
    }
}

