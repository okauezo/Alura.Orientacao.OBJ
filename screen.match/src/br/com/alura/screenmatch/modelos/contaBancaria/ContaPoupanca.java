package br.com.alura.screenmatch.modelos.contaBancaria;

public class ContaPoupanca extends ContaBanco{

    private double taxaDeJuros;

    public void calcularJuros(){
        double juros = this.getSaldo() * taxaDeJuros;
        System.out.println("juros atual: " + juros);
    }

}
