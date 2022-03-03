package com.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SerieNaoHabilitadaExcepcion
    {
        Serie serie = new Serie("Game of Thrones");
        SerieProxy serieProxy = new SerieProxy(serie, 5);       
        
    }
}
