import model.Lista;
import java.util.ArrayList;
import java.util.List;
import org.apache.log4j.*;

public class Main {
    public static void main(String[] args) throws Exception {

        BasicConfigurator.configure();
        final Logger logger = Logger.getLogger(Lista.class);
        List<Integer> list = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5));

        // Maior que cinco itens
        Lista lista2 = new Lista(list2);
        lista2.ListaMaiorQue5Itens();

        // Lista Vazia
        try{
        Lista lista = new Lista(list);
        lista.ErroSeNaoEstiverElementos(list);
        } catch (Exception e) {
            logger.error("Lista vazia");
        }
        // Media da lista
        Lista lista3 = new Lista(list2);
        lista3.MediaDaLista(list2);

        // Maior que 10 itens
        Lista lista4 = new Lista(list2);
        lista4.ListaMaiorQue10Itens(list2);

    }

}
