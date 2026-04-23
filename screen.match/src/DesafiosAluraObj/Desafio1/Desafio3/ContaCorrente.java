package DesafiosAluraObj.Desafio1.Desafio3;

public class ContaCorrente extends ContaBancaria {

    public void Cobrartarifa(){
        double tarifa = 15.0;
        sacar(tarifa);
        System.out.println("Tarifa mensal cobrada: R$\" + tarifa");
    }

}
