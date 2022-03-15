import java.sql.SQLException;

import dao.ConfigJDBC;
import dao.implementation.MedicamentoDao;
import dao.service.MedicamentoService;
import model.Medicamento;

public class Main {
    public static void main(String[] args) {
        MedicamentoService medicamentoService = new MedicamentoService(
                new MedicamentoDao(new ConfigJDBC()));
        Medicamento medicamento = new Medicamento(
                1,"Ibuprofeno", "Aché", 395, 35.7);
        try {
            medicamentoService.inserir(medicamento);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
