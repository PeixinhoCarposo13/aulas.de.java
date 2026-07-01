import java.util.Scanner;

public class estrutura_repetitiva {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int x = 1;
        int soma = 0;

        while ( soma < 10 ) {
            System.out.println("Digite um numero:");
            x = sc.nextInt();
            soma += x;
            System.out.println("Você digitou: " + x);
            System.out.println("Soma atual: " + soma);

        }

        int y = 0;
        int resultado = 0;

        for( int i = 0; i < 5; i++ ) {
            System.out.println("Digite um numero:");
            y = sc.nextInt();
            resultado += y;
            System.out.println("Você digitou: " + y);
            System.out.println("Soma atual: " + resultado);
        }

        int z = 0;
        int w = 0;
        int continuar = 0;
        int subtracao = 0;
        do{
            System.out.println("Digite um numero a:");
            z = sc.nextInt();
            System.out.println("Digite um numero b:");
            w = sc.nextInt();
            
            if( z > w ){
                subtracao = z - w;
                System.out.println("Subtração: " + subtracao);
            }
            else{
                subtracao = w - z;
                System.out.println("Subtração: " + subtracao);
            }
            System.out.println("Vai querer fazer outra conta (1 para sim, 0 para não):");
            continuar = sc.nextInt();
        }while( continuar == 1 );

        sc.close();
    }
}
