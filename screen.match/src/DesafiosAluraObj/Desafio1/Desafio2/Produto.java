package DesafiosAluraObj.Desafio1.Desafio2;

public class Produto {
    //Desenvolva uma classe Produto com os atributos privados nome e preco.
    // Utilize métodos getters e setters para acessar e modificar esses atributos.
    // Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.

    private String nomeProduto;
    private double precoProduto;

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    public void aplicarDesconto(double percentual) {
        if (percentual > 0 && percentual <= 100) {
            precoProduto -= precoProduto * (percentual / 100);
        }
    }

    public void exibirProduto() {
        System.out.println("Produto: " + this.nomeProduto);
        System.out.println("Preço: " + this.precoProduto);

    }
}
