/*
Em um banco, para se cadastrar uma conta bancária, é necessário informar o número da conta, 
o nome do titular da conta, e o valor de depósito inicial que o titular depositou ao abrir 
a conta. Este valor de depósito inicial, entretanto, é opcional, ou seja: se o titular não 
tiver dinheiro a depositar no momento de abrir sua conta, o depósito inicial não será feito 
e o saldo inicial da conta será, naturalmente, zero.

Importante: uma vez que uma conta bancária foi aberta, o número da conta nunca poderá ser alterado. 
Já o nome do titular pode ser alterado (pois uma pessoa pode mudar de nome por ocasião de casamento, 
por exemplo).

Por fim, o saldo da conta não pode ser alterado livremente. É preciso haver um mecanismo para proteger isso. 
O saldo só aumenta por meio de depósitos, e só diminui por meio de saques. Para cada saque realizado, 
o banco cobra uma taxa de $ 5.00. Nota: a conta pode ficar com saldo negativo se o saldo não for suficiente 
para realizar o saque e/ou pagar a taxa.

Você deve fazer um programa que realize o cadastro de uma conta, 
dando opção para que seja ou não informado o valor de depósito inicial. 
Em seguida, realizar um depósito e depois um saque, sempre mostrando os dados da conta após cada operação.
*/
import java.util.Scanner;
import entities.registroBancario;


public class ProjetoSimplesBanco {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        registroBancario rb = null;

        System.out.println("Entre com o nome do titular da conta: ");
        String nomeTitular = sc.nextLine();

        System.out.println("Entre com o número da conta: ");
        int numeroConta = sc.nextInt();

        System.out.println("Entre com o valor do depósito inicial (ou 0 se não houver): ");
        double saldo = sc.nextDouble();

        if (saldo > 0) {
            rb = new registroBancario(numeroConta, nomeTitular, saldo);
        } else {
            rb = new registroBancario(numeroConta, nomeTitular);
        }

        int interacao = 0;
        do{
            System.out.println("Escolha uma operação: ");
            System.out.println("1 - Depósito");
            System.out.println("2 - Saque");
            System.out.println("3 - Sair");
            interacao = sc.nextInt();

            if (interacao == 1) {
                System.out.println("Entre com o valor do depósito: ");
                double valor = sc.nextDouble();
                rb.depositar(valor);
                System.out.println("Depósito realizado com sucesso!");
            } else if (interacao == 2) {
                System.out.println("Entre com o valor do saque: ");
                double valor = sc.nextDouble();
                rb.sacar(valor);
                System.out.println("Saque realizado com sucesso!");
            } else if (interacao == 3) {
                System.out.println("Saindo...");
                
            } else {
                System.out.println("Opção inválida. Tente novamente.");
            }

        }while (interacao != 3);


        System.out.println("Dados da conta: ");
        System.out.println("Número da conta: " + rb.getNumeroConta());
        System.out.println("Nome do titular: " + rb.getNomeTitular());
        System.out.println("Saldo: " + rb.getSaldo());


        sc.close();
    }
}
