import java.io.BufferedWriter;
import java.io.FileWriter;

public class escrevendoArquivos {
    public static void main(String[] args) throws Exception {
        String[] Lines = new String[] {"Good morning", "Good afternoon", "Good night"};

        String path = "C:\\Users\\Henry\\OneDrive\\Desktop\\aulas.de.java\\output.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
            for (String line : Lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
    }
}
}
