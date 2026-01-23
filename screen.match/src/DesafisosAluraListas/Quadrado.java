package DesafisosAluraListas;

import java.util.ArrayList;

public class Quadrado implements Formula {

    private double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }
}
