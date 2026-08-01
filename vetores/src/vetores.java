import java.util.Scanner;
import entities.products;

public class vetores {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        Products[] vetorProdutos = new Products[n];

        double[] vetor = new double[n];
        double soma = 0.0;

        for(int i = 0; i < n; i++){
            System.out.printf("Digite o %dº valor: ", i + 1);
            vetor[i] = sc.nextDouble();
            soma += vetor[i];
        }
        double media = soma/n;

        System.out.printf("Média dos elementos: %.2f", media);

        sc.close();
    }
}
