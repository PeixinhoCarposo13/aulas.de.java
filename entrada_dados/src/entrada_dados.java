import java.util.Locale;
import java.util.Scanner;

public class entrada_dados {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        String x, texto;
        int y;
        double z;
        char c;

        x = sc.next();
        y = sc.nextInt();
        z = sc.nextDouble();
        c = sc.next().charAt(0);
        texto = sc.nextLine(); // Lê o restante da linha após o caractere

        System.out.println("Você digitou: " + x);
        System.out.println("Você digitou o número: " + y);
        System.out.println("Você digitou o número: " + z);
        System.out.println("Você digitou o caractere: " + c);
        System.out.println("Você digitou o texto: " + texto);

        sc.close();
    }
}
