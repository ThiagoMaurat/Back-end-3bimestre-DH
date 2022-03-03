package com.example;

public class Quadrado {
    public double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    public double calcularPerimetro() {
        return 4 * lado;
    }
}
