package com.example;

public class Circulo {
    private double radio;
    
    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }
}
