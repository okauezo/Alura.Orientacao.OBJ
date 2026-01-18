package DesafisosAluraListas;

public class Produto {

        private String  nome;
        private double preco;
        private int quantidade;

        public Produto(String nome, double preco, int quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Produto{");
        sb.append("nome= '").append(nome).append('\'');
        sb.append(", preco= ").append(preco);
        sb.append(", quantidade= ").append(quantidade);
        sb.append('}');
        return sb.toString();
    }
}