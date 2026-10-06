import java.io.File;
import java.util.Scanner;

public class lendoArquivos {
    public static void main(String[] args) throws Exception {
        File file = new File("C:\\Users\\Henry\\OneDrive\\Desktop\\aulas.de.java\\teste.txt");
        Scanner sc = null;

        try {
            sc = new Scanner (file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
        }catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            if (sc != null) {
                sc.close();
            }
        }
    }
}
