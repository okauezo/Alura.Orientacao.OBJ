package Desafio2;

public class Main2 {
    public static void main(String[] args) {
        IdadePessoa idadePessoa = new IdadePessoa();
        idadePessoa.setNome("Kauê Pires Moreira");
        idadePessoa.setIdade(21);
        System.out.println("Nome: " + idadePessoa.getNome());
        System.out.println(idadePessoa.getIdade() + " Anos");
        idadePessoa.verificarIdade();

        System.out.println();

        Produto produto = new Produto();
        produto.setNomeProduto("Martelo");
        produto.setPrecoProduto(99.8);

        System.out.println("antes do desconto");
        produto.exibirProduto();


        produto.aplicarDesconto(20.0);
        System.out.println("depois do desconto");
        produto.exibirProduto();

        System.out.println();

        Aluno aluno = new Aluno();
        aluno.setNome("Kauê Pires Moreira");
        aluno.setNota1(8);
        aluno.setNota2(6);
        aluno.setNota3(7);
        double media = aluno.calcularMedia();
        System.out.println("nome do aluno: " + aluno.getNome());
        System.out.println("A média do " + aluno.getNome() + " é: " + media);

        System.out.println();

        Livro livro = new Livro();
        livro.setTitulo("Diario De Um Banana");
        livro.setAutor("Jeff Kinney");
        livro.exibirDetalhes();
    }
}
