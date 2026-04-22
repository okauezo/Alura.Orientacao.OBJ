package DesafisosAluraListas;

public class Cachorro extends Animal {

    public void latir(){
        System.out.println("au au");
    }

    public Cachorro() {
        super("correndo", "bebendo água", "comendo");
    }

    public Cachorro(String correr, String beberAgua, String comer) {
        super(correr, beberAgua, comer);
    }
}
