package model;

import org.apache.log4j.Logger;

import java.util.List;

public class Lista {
    private List<Integer> lista;
    private static final Logger logger = Logger.getLogger(Lista.class);

    public Lista(List<Integer> lista) {
        this.lista = lista;
    }
    public void ListaMaiorQue5Itens() {
        if ( lista.size() > 5 ) {
            logger.info( "Lista maior que 5 itens" );
        } else {
            logger.info( "Lista menor que 5 itens" );
        }
    }

    public void ListaMaiorQue10Itens( List<Integer> lista ) {
        if ( lista.size() > 10 ) {
            logger.info( "Lista maior que 10 itens" );
        } else {
            logger.info( "Lista menor que 10 itens" );
        }
    }

    public void MediaDaLista( List<Integer> lista ) {
        int soma = 0;
        int media = 0;
        for ( int i = 0; i < lista.size(); i++ ) {
            soma += lista.get( i );
            media = soma / lista.size();
        }
        logger.info( "Media da lista: " + media );
    }

    public void ErroSeNaoEstiverElementos( List<Integer> lista ) throws Exception {
        if ( lista.size() <= 0 ) {            
            throw new Exception();
        }
    }
}
