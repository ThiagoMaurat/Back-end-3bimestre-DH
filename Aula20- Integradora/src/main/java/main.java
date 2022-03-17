import model.Empresa;
import model.Funcionarios;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {

        Funcionarios funcionarios = new Funcionarios("Thiago", "Maurat", "12235434", 1200.00);
        Funcionarios funcionarios2 = new Funcionarios("Thiago", "Maurat", "12235434", 1200.00);
        Funcionarios funcionarios3 = new Funcionarios("Thiago", "Maurat", "12235434", 1200.00);
        Funcionarios funcionarios4 = new Funcionarios("Thiago", "Maurat", "12235434", 1200.00);
        List<Funcionarios> funcionariosArray = new ArrayList<>();
        funcionariosArray.add(funcionarios);
        funcionariosArray.add(funcionarios2);
        funcionariosArray.add(funcionarios3);
        funcionariosArray.add(funcionarios4);
        Empresa empresa = new Empresa("7382742389",
                "Empresa S.A.", funcionariosArray);

        FileOutputStream fo = null;
        try {
            fo = new FileOutputStream("empresa.txt");
            ObjectOutputStream oo = new ObjectOutputStream(fo);
            oo.writeObject(empresa);
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }

        // recuperar do arquivo, a empresa, que também deverá ter seus 4 funcionários.
        FileInputStream fi = null;
        Empresa empresa2 = null;
        try {
            fi = new FileInputStream("empresa.txt");
            ObjectInputStream oi = new ObjectInputStream(fi);
            empresa2 = (Empresa) oi.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(empresa2.toString() + empresa2.getFuncionarios());
    }
}
