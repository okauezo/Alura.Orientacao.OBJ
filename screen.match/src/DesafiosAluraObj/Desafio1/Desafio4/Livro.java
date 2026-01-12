package DesafiosAluraObj.Desafio1.Desafio4;

public class Livro implements Calculavel {

    private double preco;

    public Livro(double preco) {
        this.preco = preco;
    }

    @Override
    public double calcularPrecoFinal() {
        return preco * 0.90;
    }
}
