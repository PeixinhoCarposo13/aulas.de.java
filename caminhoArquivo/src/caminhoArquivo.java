import java.util.Scanner;
import java.io.File;

public class caminhoArquivo {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a file path:");
        String path = sc.nextLine();

        File file = new File(path);

        System.out.println("File name: " + file.getName());
        System.out.println("getParent(): " + file.getParent());
        System.out.println("getPath(): " + file.getPath());

        sc.close();
    }
}
