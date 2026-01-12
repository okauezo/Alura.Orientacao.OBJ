package DesafiosAluraObj.Desafio1;

public class Caneta {

    String modelo;
    String cor;
    double ponta;
    double precoCaneta;

    public void StatusCaneta(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Cor: " + this.cor);
        System.out.println("Ponta: " + this.ponta);
        System.out.println("Preço: " + this.precoCaneta);
    }
}
