package com.example;

public class SerieNaoHabilitadaExcepcion extends Exception {
    private static SerieNaoHabilitadaExcepcion instance = null;
    private SerieNaoHabilitadaExcepcion() {
    }
    public static SerieNaoHabilitadaExcepcion getInstance() {
        if (instance == null) {
            instance = new SerieNaoHabilitadaExcepcion();
        }
        return instance;
    }
}

