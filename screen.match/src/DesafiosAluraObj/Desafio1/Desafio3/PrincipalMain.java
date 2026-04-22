package DesafiosAluraObj.Desafio1.Desafio3;

public class PrincipalMain {
    public static void main(String[] args) {
        ModeloCarro polo = new ModeloCarro("volkswagen - polo");

        polo.setPreco(75.000, 82.000, 97.000);
        polo.exibirInformacoes();

        System.out.println();

        Cachorro cachorro = new Cachorro();
        cachorro.nome();
        cachorro.emitirSom();
        cachorro.abanarRabo();

        Gato gato = new Gato();
        gato.nome();
        gato.emitirSom();
        gato.arranharMoveis();

        System.out.println();

        ContaBancaria conta = new ContaBancaria();
        conta.setSaldo(5000);
        System.out.println("Saldo inicial: R$ " + conta.getSaldo());
        conta.depositar(900);
        conta.sacar(690);
        System.out.println("Saldo Atualizado: R$ " + conta.getSaldo());

        System.out.println();

        VerificadorPrimo verificador = new VerificadorPrimo();
        verificador.verificarSeEhPrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);
    }
}
