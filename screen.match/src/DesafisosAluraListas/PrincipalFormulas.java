package DesafisosAluraListas;

import java.util.ArrayList;

public class PrincipalFormulas {
    static void main() {
        ArrayList<Formula> formas = new ArrayList<>();
        formas.add(new Circulo(1.2));
        formas.add(new Quadrado(4));
        formas.add(new Circulo(1.5));
        formas.add(new Quadrado(8));

        for(Formula f: formas) {
            System.out.println(f.calcularArea());
        }
    }
}
