package com.example;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;
import org.junit.gen5.api.BeforeEach;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    Funcionario func1, func2;
    Afiliado afi1, afi2, afi3;
    Estagiario est1, est2;

    @Before
    public void doBefore() {
        func1 = new Funcionario("Pedro", 2);
        func1.vender(2);

        func2 = new Funcionario("Maria",1);
        func2.vender(1);

        afi1 = new Afiliado("Ramon");
        afi1.vender(4);

        afi2 = new Afiliado("Paulo");
        afi2.vender(1);

        afi3 = new Afiliado("José");

        func1.addAfiliado(afi1);

        est1 = new Estagiario("Enzo", 3);
    }

    @Test
    public void mostrarVendedores() {
        System.out.println(func1.mostrarCategoria());
        System.out.println(func2.mostrarCategoria());
        System.out.println(afi1.mostrarCategoria());
        System.out.println(afi2.mostrarCategoria());
        System.out.println(afi3.mostrarCategoria());
        System.out.println("----");
        System.out.println(est1.mostrarCategoria());
    }
}
