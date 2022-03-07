//importar log4j da pasta lib
import lib.log4j.Log4j;

import model.Leao;

public class App {

    private static final Logger logger = Logger.getLogger(App.class);
    public static void main(String[] args) throws Exception {
        BasicConfigurator.configure();
        Leao leao = new Leao();
        leao.setNome("Leao");
        leao.setIdade(10);
        leao.seteAlfa(true);
        leao.correr();
        leao.eMaiorQue10();

        try {
          leao.eMaiorQue10();  
        } catch (Exception e) {
          logger.error("A idade do leão " + leao.getNome() + " não está incorreta!");
        }
    }
}
