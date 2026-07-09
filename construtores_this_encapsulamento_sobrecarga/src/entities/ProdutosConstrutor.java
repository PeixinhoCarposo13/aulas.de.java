package entities;

public class ProdutosConstrutor {
    // Atributos da classe Produtos
    public String nome;
    public double preco;
    public int quantidade;

    // Construtorda classe Produtos
    public ProdutosConstrutor(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    // Método para calcular o valor total em estoque dentro da classe Produtos
    public double valorTotalEmEstoque() {
        return preco * quantidade;
        
    }

    // Método para adicionar produtos ao estoque
    public void adicionarProdutos(int quantidade) {
        this.quantidade += quantidade;
    }

    // Método para remover produtos do estoque
    public void removerProdutos(int quantidade) {
        this.quantidade -= quantidade;
    }

    // Método toString() para exibir os dados do produto de forma formatada
    // String.format() é usado para formatar o preço e o valor total em estoque com duas casas decimais
    public String toString() {
        return "Produto: " + nome + "\n"
                + "Preço: $" + String.format("%.2f", preco) + "\n" // Formata o preço com duas casas decimais
                + "Quantidade em estoque: " + quantidade + "\n"
                + "Valor total em estoque: $" + String.format("%.2f", valorTotalEmEstoque()); // Formata o valor total em estoque com duas casas decimais
    }
}
