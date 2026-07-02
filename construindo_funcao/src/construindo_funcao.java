import java.util.Scanner;

public class construindo_funcao {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in); 

        interacaoNumero();
        int a = sc.nextInt();

        interacaoNumero();
        int b = sc.nextInt();

        soma(a, b);
        divisao(a, b);

        sc.close();
    }

    static void interacaoNumero() {
        System.out.print("Insira um número inteiro: ");
    }

    static void soma(int a, int b) {
        int resultado = a + b;
        System.out.println("Resultado: " + resultado);
    }

    static void divisao(int a, int b) {
        if(b == 0 ) {
            System.out.println( "Não é possível dividir por zero.");
        } else {
            double resultado = (double) a / b;
            System.out.printf("Resultado: %.2f%n", resultado);
        }
    }



}
