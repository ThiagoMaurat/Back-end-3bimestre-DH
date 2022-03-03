import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class PessoaTest {
    Pessoa p1,p2,p3,p4,p5,p6,p7,p8,p9,p10;
    List<String> colecao = new ArrayList<String>();

    @BeforeEach
    void doBefore() {
        p1 = new Pessoa("Ivo", "Ganda");
        p1.setIdade(LocalDate.of(2016,3,23));
        p2 = new Pessoa("Ivo", "Ganda");
        p2.setIdade(LocalDate.of(2019,3,23));
        p3 = new Pessoa("Ivo", "Ganda");
        p3.setIdade(LocalDate.of(2012,3,23));
        p4 = new Pessoa("Ivo", "Ganda");
        p4.setIdade(LocalDate.of(2015,3,23));
        p5 = new Pessoa("Ivo", "Ganda");
        p5.setIdade(LocalDate.of(2007,3,23));
        p6 = new Pessoa("Ivo", "Ganda");
        p6.setIdade(LocalDate.of(2001,3,23));
        p7 = new Pessoa("Ivo", "Ganda");
        p7.setIdade(LocalDate.of(2018,3,23));
        p8 = new Pessoa("Ivo", "Ganda");
        p8.setIdade(LocalDate.of(2002,3,23));
        p9 = new Pessoa("Ivo", "Ganda");
        p9.setIdade(LocalDate.of(2001,3,23));
        p10 = new Pessoa("Ivo", "Ganda");
        p10.setIdade(LocalDate.of(1945,3,23));
    }

    @Test
    void imprimirObjetos(){
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
        System.out.println(p5.toString());
        System.out.println(p6.toString());
        System.out.println(p7.toString());
        System.out.println(p8.toString());
        System.out.println(p9.toString());
        System.out.println(p10.toString());
    }

    @Test
    void adicionarColecao() {
        p1.adicionarNome(p1);
        p2.adicionarNome(p2);
        p3.adicionarNome(p3);
        p4.adicionarNome(p4);
        p5.adicionarNome(p5);
        p6.adicionarNome(p6);
        p7.adicionarNome(p7);
        p8.adicionarNome(p8);
        p9.adicionarNome(p9);
        p10.adicionarNome(p10);
    }
}