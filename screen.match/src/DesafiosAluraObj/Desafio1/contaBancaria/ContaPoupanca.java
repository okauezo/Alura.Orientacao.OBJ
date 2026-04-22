package DesafiosAluraObj.Desafio1.contaBancaria;

public class ContaPoupanca extends ContaBanco{

    private double taxaDeJuros;

    public void calcularJuros(){
        double juros = this.getSaldo() * taxaDeJuros;
        System.out.println("juros atual: " + juros);
    }

    public void sacar(double valor){
        double taxaSaque = 0.1;
        super.sacar(valor + taxaSaque);
    }

    public double getTaxaDeJuros() {
        return taxaDeJuros;
    }

    public void setTaxaDeJuros(double taxaDeJuros) {
        this.taxaDeJuros = taxaDeJuros;
    }
}
