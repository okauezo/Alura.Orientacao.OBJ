package imposto;

public class CalculadoraImposto {

    private double totalImposto = 0;

    public void CalcularImposto(Tributavel item){
        this.totalImposto += item.getValorImposto();
    }

    public double getTotalImposto() {
        return this.totalImposto;
    }
}
