import java.util.Scanner;
import entities.products;

public class vetoresPt2 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos elementos vai ter o vetor? ");
        int n = sc.nextInt();

        products[] vetorProdutos = new products[n];
        double soma = 0.0;

        for(int i = 0; i < n; i++){
            System.out.printf("Digite o nome do %dº produto: ", i + 1);
            sc.nextLine(); // Limpar o buffer
            String nome = sc.nextLine();

            System.out.printf("Digite o preço do %dº produto: ", i + 1);
            int preco = sc.nextInt();

            soma += preco;

            vetorProdutos[i] = new products(nome, preco);
        }

        double media = soma/n;
        System.out.printf("Média dos preços: %.2f%n", media);


        sc.close();
    }
}
