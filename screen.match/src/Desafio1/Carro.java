package Desafio1;

import java.time.Year;

public class Carro {
    //Crie uma classe Carro com atributos
    // modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.

    String modelo;
    int ano;
    String cor;

    public void fichaTecnica(){
        System.out.println("modelo: " + this.modelo);
        System.out.println("ano: " + this.ano);
        System.out.println("cor: " + this.cor);
        System.out.println("idade do " + this.modelo + " é " + calcularIdade() + " Anos");
    }

    public int calcularIdade(){
        int anoAtual = Year.now().getValue();
        return  anoAtual - ano;
    }
}
