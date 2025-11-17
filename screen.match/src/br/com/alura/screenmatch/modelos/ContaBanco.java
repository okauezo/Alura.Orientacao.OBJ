package br.com.alura.screenmatch.modelos;

public class ContaBanco {

    private String titula;
    private double saldo;

    public void sacar(double valor){
        if (valor <= 0){
            System.out.println("Valor tem que ser maior que zero!");
        } else if (saldo >= valor) {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso! Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
    public void depositar(double valor){
        if (valor >= 0){
            saldo += valor;
            System.out.println("Depositado com sucesso! Saldo atual: " + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }
}
