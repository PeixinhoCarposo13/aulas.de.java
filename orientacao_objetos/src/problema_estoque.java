/* 
Fazer um programa para ler os dados de um produto em estoque (nome, preço e quantidade no estoque). Em seguida:

Mostrar os dados do produto (nome, preço, quantidade no estoque, valor total no estoque).
Realizar uma entrada no estoque e mostrar novamente os dados do produto.
Realizar uma saída no estoque e mostrar novamente os dados do produto.
*/
import java.util.Scanner;
import entities.Produtos;

public class problema_estoque {
    public static void main(String[] args) throws Exception{

        Scanner sc = new Scanner(System.in);

        Produtos p;
        p = new Produtos();

        int interacao = 0, quantidadeVendida = 0, quantidadeAdicionada = 0;

        do{
            System.out.print("Digite 1 para cadastrar o produto, 2 para saida/venda do produto, 3 para entrada no estoque e 0 para sair: ");
            interacao = sc.nextInt();
            if(interacao == 1){
                System.out.print("Digite o nome do produto: ");
                p.nome = sc.next();
                System.out.print("Digite o preço do produto: ");
                p.preco = sc.nextDouble();
                System.out.print("Digite a quantidade do produto: ");
                p.quantidade = sc.nextInt();
                System.out.println(p.toString());
            }
            else if(interacao == 2){
                System.out.printf("Digite a quantidade de %s que deseja vender: ", p.nome);
                quantidadeVendida = sc.nextInt();

                if(quantidadeVendida > p.quantidade){
                    System.out.println("Quantidade indisponível em estoque.");
                }
                else{
                    p.removerProdutos(quantidadeVendida);
                    System.out.println(p.toString());
                }
            }
            else if(interacao == 3){
                System.out.printf("Digite a quantidade de %s que deseja adicionar ao estoque: ", p.nome);
                quantidadeAdicionada = sc.nextInt();
                p.adicionarProdutos(quantidadeAdicionada);
                System.out.println(p.toString());
            }
            else{
                System.out.println("Opção inválida. Tente novamente.");
            }

        } while(interacao != 0);

        sc.close();
    }
}
