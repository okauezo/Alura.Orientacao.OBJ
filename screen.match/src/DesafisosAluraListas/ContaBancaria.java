package DesafisosAluraListas;

public class ContaBancaria {

    private String cliente;
    private double numeroDaConta;
    private double saldo;

    public ContaBancaria(String cliente, double numeroDaConta, double saldo) {
        this.cliente = cliente;
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
    }

    public String getCliente() {
        return cliente;
    }

    public double getNumeroDaConta() {
        return numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
