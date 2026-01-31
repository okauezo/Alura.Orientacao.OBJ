package DesafisosAluraListas;

import java.util.ArrayList;

public class ContaCliente {
    static void main() {

    ArrayList<ContaBancaria> contas = new ArrayList<>();
    contas.add(new  ContaBancaria("Sarah", 478819944, 17000));
    contas.add(new ContaBancaria("Tania", 223640881, 1200000));
    contas.add(new ContaBancaria("Kaue", 745654789, 20000));

    ContaBancaria maiorConta = contas.get(0);
    for (int i = 1; i < contas.size(); i++) {
        if (contas.get(i).getSaldo() > maiorConta.getSaldo()) {
            maiorConta = contas.get(i);
        }
    }

    ContaBancaria menorConta = contas.get(0);
    for (int i = 1; i < contas.size(); i++) {
        if (contas.get(i).getSaldo() < menorConta.getSaldo()){
            menorConta = contas.get(i);
        }
    }

        System.out.println("Conta com maior saldo:");
        System.out.println("Cliente: " + maiorConta.getCliente());
        System.out.println("Número da conta: " + maiorConta.getNumeroDaConta());
        System.out.println("Saldo: R$ " + maiorConta.getSaldo());
        System.out.println();
        System.out.println("Conta com menor saldo:");
        System.out.println("Cliente: " + menorConta.getCliente());
        System.out.println("Número da conta: " + menorConta.getNumeroDaConta());
        System.out.println("Saldo: R$ " + menorConta.getSaldo());

    }
}
