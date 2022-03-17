import java.io.FileInputStream;

public class Parte2 {
    public static void main(String[] args) {
    try {
        FileInputStream input = new FileInputStream("import.txt");

        int i = input.read();
        while(i != -1) {
            System.out.print((char)i);
            i = input.read();
        }
        input.close();
    }

        catch(Exception e) {
        e.getStackTrace();
    }
}
}
