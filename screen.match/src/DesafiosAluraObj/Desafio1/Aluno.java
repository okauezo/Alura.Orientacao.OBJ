package DesafiosAluraObj.Desafio1;

public class Aluno {
    //Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações.
    // Crie uma instância da classe Aluno,atribua valores aos seus atributos
    // e utilize o método para exibir as informações.

    String  nome;
    int idade;
    int matricula;

    public void exibirInformacoes(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        System.out.println("Matricula: " + "RM" + this.matricula);
    }

}
