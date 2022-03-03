package com.example;

import com.example.demo.Arvores;
import com.example.demo.FactoryArvores;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        FactoryArvores arvores = new FactoryArvores();

        for (int i = 0; i < 500000; i++) {
            Arvores arvore = FactoryArvores.getArvore("ornamentais", 200, 400, "verde");
        }

        for (int i = 0; i < 500000; i++) {
            Arvores arvore = FactoryArvores.getArvore("frutíferas", 500, 300, "vermelha");
        }

        Runtime runtime = Runtime.getRuntime();
        System.out.println("Memória utilizada: " + (runtime.totalMemory() - runtime.freeMemory()) / (1024 * 1024));

    }
}
