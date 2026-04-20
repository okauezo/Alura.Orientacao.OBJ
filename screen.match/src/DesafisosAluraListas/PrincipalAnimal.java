package DesafisosAluraListas;

public class PrincipalAnimal {
    public static void main(String[] args) {

        Animal animal = new Cachorro();

        if(animal instanceof Cachorro){
            Cachorro dog = (Cachorro) animal;
            System.out.println("É Cachorro");
        } else  {
            System.out.println("Não é Cachorro");
        }

    }
}
