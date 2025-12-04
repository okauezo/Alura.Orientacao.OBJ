package Desafio3;

public class Carro {

//    Crie uma classe Carro com métodos para representar um modelo específico ao longo de três anos.
//    Implemente métodos para definir o nome do modelo, os preços médios para cada ano, e calcular e exibir o menor e o maior preço.
//    Adicione uma subclasse ModeloCarro para criar instâncias específicas, utilizando-a na classe principal
//    para definir preços e mostrar informações.

    private String nomeModelo;
    private double precoAno1;
    private double precoAno2;
    private double precoAno3;

    public void setNomeModelo(String nomeModelo) {
        this.nomeModelo = nomeModelo;
    }

    public void setPreco(double ano1, double ano2, double ano3) {
        this.precoAno1 = ano1;
        this.precoAno2 = ano2;
        this.precoAno3 = ano3;
    }

    public double getMenorPreco() {
        return Math.min(this.precoAno1, Math.min (this.precoAno2, precoAno3));
    }

    public double getMaiorPreco(){
        return Math.max(this.precoAno1, Math.max (this.precoAno2, precoAno3));
    }

    public void exibirInformacoes(){
        System.out.println("Modelo: " + nomeModelo);
        System.out.println("Modelo: " + nomeModelo);
        System.out.println("Preços:");
        System.out.println("Ano 1: " + precoAno1);
        System.out.println("Ano 2: " + precoAno2);
        System.out.println("Ano 3: " + precoAno3);
        System.out.println("Menor preço: " + getMenorPreco());
        System.out.println("Maior preço: " + getMaiorPreco());
    }
}
