package DesafisosAluraListas;

import java.util.ArrayList;

public class ContaCliente {
    static void main() {

    ArrayList<ContaBancaria> contas = new ArrayList<>();
    contas.add(new ContaBancaria("Sarah", 4879936,10000));
    contas.add(new ContaBancaria("Tania", 7567854, 2000000));
    contas.add(new ContaBancaria("Zac", 4123936,100));

    ContaBancaria maiorConta = contas.get(0);
    for(int i = 1; i < contas.size(); i++) {
        if(contas.get(i).getSaldo() > maiorConta.getSaldo()) {
            maiorConta = contas.get(i);
        }
    }
        System.out.println("Conta com maior saldo:");
        System.out.println("Cliente: " + maiorConta.getCliente());
        System.out.println("Número da conta: " + maiorConta.getNumeroDaConta());
        System.out.println("Saldo: R$ " + maiorConta.getSaldo());

    }
}
