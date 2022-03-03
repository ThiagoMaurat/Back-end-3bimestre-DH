package com.example;

public class SerieProxy {
    

    public SerieProxy(Serie serie, int qntViews) throws SerieNaoHabilitadaExcepcion {
        
        if (qntViews <= 5) {
            System.out.println("Acessando o proxy e o link é: " + serie.getSerie(serie.getNome()));
        } 
        else if (qntViews > 5) {
            throw SerieNaoHabilitadaExcepcion.getInstance();
        }
    }
}
