package DesafisosAluraListas.ordenacao;

import org.jetbrains.annotations.NotNull;

public class NumInteiros implements Comparable<NumInteiros> {

    private int numeros;

    public NumInteiros(int numeros) {
        this.numeros = numeros;
    }

    public int getNumeros() {
        return numeros;
    }

    @Override
    public int compareTo(NumInteiros outroNumInteiros) {
        return this.getNumeros() - outroNumInteiros.getNumeros();
    }

    @Override
    public String toString() {
        return "Numeros =(" +  numeros + ")";
    }
}
