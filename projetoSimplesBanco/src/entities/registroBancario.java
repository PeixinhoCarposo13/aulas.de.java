package entities;

public class registroBancario {
    private int numeroConta;
    private String nomeTitular;
    private double saldo;

// Construtor da classe registroBancario caso seja informado o valor do depósito inicial
public registroBancario(int numeroConta, String nomeTitular, double saldo) {
    this.numeroConta = numeroConta;
    this.nomeTitular = nomeTitular;
    this.saldo = saldo;
}
// Construtor da classe registroBancario caso não seja informado o valor do depósito inicial
public registroBancario(int numeroConta, String nomeTitular) {
    this.numeroConta = numeroConta;
    this.nomeTitular = nomeTitular;
    this.saldo = 0.0;
}

// Getters para acessar os atributos da classe registroBancario
public int getNumeroConta() {
    return numeroConta;
}

public String getNomeTitular() {
    return nomeTitular;
}

public double getSaldo() {
    return saldo;
}

// Utiliza-se um Setter para alterar o nome do titular da conta, caso seja necessário
public void setNomeTitular(String nomeTitular) {
    this.nomeTitular = nomeTitular;

}

public void depositar(double valor) {
    saldo += valor;
}

public void sacar(double valor) {
    saldo -= valor + 5.0; // Taxa de saque de R$5.00
}
}


