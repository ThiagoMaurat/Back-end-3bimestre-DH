package test;

import model.Quadrado;
import model.Triangulo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import service.FlyweightFactory;
import static org.junit.jupiter.api.Assertions.*;

public class FlyweightFactoryTest {

    @Test
    void getTrianguloComTamanho2() {

        Triangulo triangulo = FlyweightFactory.obterTriangulo("vermelho");
        triangulo.setTamanho(2);

        Triangulo triangulo1 = FlyweightFactory.obterTriangulo("vermelho");
        triangulo1.setTamanho(4);

        Triangulo triangulo2 = FlyweightFactory.obterTriangulo("azul");
        triangulo2.setTamanho(6);


        Quadrado quadrado = FlyweightFactory.obterQuadrado(4);
        quadrado.setCor("vermelho");

        Quadrado quadrado1 = FlyweightFactory.obterQuadrado(4);
        quadrado1.setCor("azul");

        Quadrado quadrado2= FlyweightFactory.obterQuadrado(6);
        quadrado2.setCor("vermelho");



        assertEquals(triangulo.getCor(), "vermelho");

        assertEquals(triangulo1.getTamanho(), 4);

        assertEquals(FlyweightFactory.trianguloMap.size() == 2, true);


        assertEquals(quadrado.getTamanho(), 4);

        assertEquals(quadrado1.getCor(), "azul");

        assertEquals(FlyweightFactory.quadradoMap.size() == 2, true);

        
    }

}
