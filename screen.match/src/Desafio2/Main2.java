package Desafio2;

public class Main2 {
    public static void main(String[] args) {
        IdadePessoa idadePessoa = new IdadePessoa();
        idadePessoa.setNome("Kauê Pires Moreira");
        idadePessoa.setIdade(21);
        System.out.println("Nome: " + idadePessoa.getNome());
        System.out.println(idadePessoa.getIdade() + " Anos");
        idadePessoa.verificarIdade();


        Produto produto = new Produto();
        produto.setNomeProduto("Martelo");
        produto.setPrecoProduto(30);
        produto.exibirProduto();

        produto.aplicarDesconto(300);
    }
}
