package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void calcularPerimetroQuadrado() {
        Quadrado quadrado = new Quadrado(5);
        assertTrue(quadrado.calcularPerimetro() == 20);
    }

    @Test
    public void calcularPerimetroCírculo() {
        Circulo circulo = new Circulo(5);
        assertTrue(circulo.calcularPerimetro() == 31.41592653589793);
    }
}


// Pedro Menezes, Leticia Carmo, Wesley Bueno e Nayla Honorato