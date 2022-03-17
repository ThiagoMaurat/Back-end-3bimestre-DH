import model.Contatos;

import java.io.*;
import java.util.*;

public class main {
    public static void main(String[] args) {
        List<Contatos> list = new ArrayList<Contatos>(Arrays.asList(
                new Contatos("José", "jose@hotmail.com", "99999-9999"),
                new Contatos("Maria", "maria@hotmail.com", "128937-1234"),
                new Contatos("João", "joão@hotmail.com", "128937-1234")
        ));
        FileOutputStream fo = null;

        try {
            fo = new FileOutputStream("OutputFile.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fo);
            oos.writeObject(list);
        }
        catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }

        // Recuperar o conteúdo da List
        List<Contatos> list2 = null;
        FileInputStream fi = null;
        try {
            fi = new FileInputStream("OutputFile.txt");
            ObjectInputStream ois = new ObjectInputStream(fi);
            list2 = (List<Contatos>) ois.readObject();
        } catch (FileNotFoundException e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("ERROR: " + e.getMessage());
        }
        for (Contatos c : list2) {
            System.out.println(c.getNome() + " - " + c.getEmail() + " - " + c.getTelefone());
        }
    }
}
