package DesafiosAluraObj.Desafio1.Desafio4;

public class ConversorMoeda implements ConversaoFinanceira {

    private static final double TAXA_DOLAR = 5.5;

    @Override
    public double  converterDolarParaReal(double valorDolar){
        return valorDolar * TAXA_DOLAR;
    }
}
