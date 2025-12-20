package imposto;

public class Produto implements Tributavel {

    private String nome;
    private double valor;


    @Override
    public double getValorImposto() {
        return this.valor * 0.1;
    }
}
