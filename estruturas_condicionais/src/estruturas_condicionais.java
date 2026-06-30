import java.util.Scanner;

public class estruturas_condicionais {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int y = sc.nextInt();
        double preco = sc.nextDouble();

        // Estrutura condicional if-else
        if ( x == 1 ) {
            System.out.println("Bom dia!");
        }
        else if ( x == 2 ) {
            System.out.println("Boa Tarde!");
        }
        else {
            System.out.println( "Boa Noite!");
        }

        sc.close();

        // Estrutura condicional switch-case
        switch (y) {
            case 1:
                System.out.println("Bom dia!");
                break;
            case 2:
                System.out.println("Boa Tarde!");
                break;
            default:
                System.out.println("Boa Noite!");
                break;
        }

        // Estrutura condicional ternária
        double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;
        System.out.printf("Desconto aplicado: %.2f%n", desconto);

    }
}
