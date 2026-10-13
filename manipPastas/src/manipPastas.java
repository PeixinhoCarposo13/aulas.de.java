import java.io.File;
import java.util.Scanner;

public class manipPastas {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a folder path:");
        String path = sc.nextLine();

        File folder = new File(path);

        File[] files = folder.listFiles(File::isDirectory);

        System.out.println("Folders in the specified path:");
        for (File file : files) {
            System.out.println(file.getName());
        }

        File[] files2 = folder.listFiles(File::isFile);
        System.out.println("Files in the specified path:");
        for (File file : files2) {
            System.out.println(file.getName());
        }

        boolean success = new File(folder + "/newFolder").mkdir();
        if (success) {
            System.out.println("Folder created successfully.");
        } else {
            System.out.println("Failed to create folder.");
        }

        sc.close();
    }
}
