package DesafisosAluraListas.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Principal {
    static void main() {

        NumInteiros num1 = new NumInteiros(1);
        NumInteiros num3 = new NumInteiros(15);
        NumInteiros num2 = new NumInteiros(2);
        NumInteiros num4 = new NumInteiros(10);
        NumInteiros num5 = new NumInteiros(70);

        List<NumInteiros> lista = new ArrayList<>();
        lista.add(num1);
        lista.add(num2);
        lista.add(num3);
        lista.add(num4);
        lista.add(num5);

        Collections.sort(lista);
        System.out.println(lista);
    }
}
