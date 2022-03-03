package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void calculos()
    {
        Funcionario funcionario = new Efetivo("João", "Silva", "12345", 3000, 1000, 500);
        funcionario.pagamentoSalario();
        Funcionario funcionario2 = new Contratado("João", "Silva", "12345", 100, 10);
        funcionario2.pagamentoSalario();
    }
}
