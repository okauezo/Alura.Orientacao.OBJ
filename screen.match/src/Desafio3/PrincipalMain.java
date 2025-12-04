package Desafio3;

public class PrincipalMain {
    public static void main(String[] args) {
        ModeloCarro polo = new ModeloCarro("volkswagen - polo");

        polo.setPreco(75.000, 82.000, 97.000);
        polo.exibirInformacoes();
    }
}
