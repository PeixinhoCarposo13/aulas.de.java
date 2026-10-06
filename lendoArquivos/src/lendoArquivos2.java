import java.io.FileReader;
import java.io.BufferedReader;


public class lendoArquivos2 {
    public static void main(String[] args) throws Exception {
       String path = "C:\\Users\\Henry\\OneDrive\\Desktop\\aulas.de.java\\teste.txt";
      

       try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
