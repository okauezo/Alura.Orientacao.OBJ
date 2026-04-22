package DesafiosAluraObj.Desafio1.Desafio4;

public class ProdutoFisico implements Calculavel {

    private double preco;

    public ProdutoFisico(double preco){
        this.preco = preco;
    }

    public double calcularPrecoFinal() {
        return preco * 1.05;
    }

}
