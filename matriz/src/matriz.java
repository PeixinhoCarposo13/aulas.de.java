import java.util.Scanner;

public class matriz {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int tamanho;

        System.out.print("Informe o tamanho da matriz quadrada: ");
        tamanho = sc.nextInt();

        int [][] matriz = new int [tamanho][tamanho];

        for (int i = 0; i < tamanho; i ++){
            for (int j = 0; j < tamanho; j++){
                System.out.print("Informe o valor da posição [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        System.out.println("A diagonal principal da matriz é: ");
        for (int i = 0; i < tamanho; i ++){
            System.out.print(matriz[i][i] + " ");
        }


        sc.close();
    }
}
