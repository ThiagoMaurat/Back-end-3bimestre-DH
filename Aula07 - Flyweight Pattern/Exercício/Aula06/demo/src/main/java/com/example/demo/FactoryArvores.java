package com.example.demo;

import java.util.HashMap;
import java.util.Map;

public class FactoryArvores {
    
    public static Map<String, Arvores> arvores = new HashMap<>();

    public static Arvores getArvore(String tipo, int altura, int largura, String cor) {
        String key = tipo + " " + altura + "" + largura + "" + cor;
        if (!arvores.containsKey(key)) {
            arvores.put(key, new Arvores(altura, largura, cor, tipo));
            System.out.println("Arvore criada: " + key);
            return arvores.get(key);
        } 
        System.out.println("Arvore reutilizada " + key);
        return arvores.get(key);
    }

}
