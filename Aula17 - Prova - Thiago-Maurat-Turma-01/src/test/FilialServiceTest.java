package test;

import dao.config.ConfigJDBC;
import dao.impl.FilialDaoH2;
import model.Filial;
import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import service.FilialService;

public class FilialServiceTest {
    private static final Logger LOGGER = Logger.getLogger(FilialServiceTest.class);

    private FilialService filialService = new FilialService(
            new FilialDaoH2(new ConfigJDBC()));

    @BeforeAll
    static void ConfigLog() {
        BasicConfigurator.configure();
    }

    @Test
    public void CadastrarFilialNoH2() {
        LOGGER.info("Cadastrando filial no H2");
        Filial filial1 = new Filial("Filial Teste1", "Rua Teste1", "12345-6", "Cidade1", "SP",true);
        Filial filial2 = new Filial("Filial Teste2", "Rua Teste2", "12345-67", "Cidade2", "SP",false);
        Filial filial3 = new Filial("Filial Teste3", "Rua Teste3", "12345-678", "Cidade3", "SP",true);
        Filial filial4 = new Filial("Filial Teste4", "Rua Teste4", "12345-6789", "Cidade4", "SP",false);
        Filial filial5 = new Filial("Filial Teste5", "Rua Teste5", "12345-678910", "Cidade5", "SP",true);
        Filial FilialCriada1 = filialService.create(filial1);
        Filial FilialCriada2 = filialService.create(filial2);
        Filial FilialCriada3 = filialService.create(filial3);
        Filial FilialCriada4 = filialService.create(filial4);
        Filial FilialCriada5 = filialService.create(filial5);
        LOGGER.info("Filial criada: " + FilialCriada1.toString());
        LOGGER.info("Filial criada: " + FilialCriada2.toString());
        LOGGER.info("Filial criada: " + FilialCriada3.toString());
        LOGGER.info("Filial criada: " + FilialCriada4.toString());
        LOGGER.info("Filial criada: " + FilialCriada5.toString());

    }
}
