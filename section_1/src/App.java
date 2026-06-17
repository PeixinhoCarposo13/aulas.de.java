import java.util.Locale;

public class App {
    public static void main(String[] args) throws Exception {
        int y = 2;
        double x = 1.12345;
        
        Locale.setDefault(Locale.US);

        System.out.print("Sem quebra de linha,");
        System.out.println(" com quebra de linha");
        System.out.println(y);
        System.out.printf("%.2f\n", x);
        System.out.println("ELEMENTO1 " + "ELEMENTO2");
        System.out.printf("O resultado é %d em metros\n", y);

        String nome = "Henry";
        int idade = 19;
        double nota = 7.632;
        System.out.printf("A nota do %s é %.2f e ele tem %d anos\n", nome, nota, idade);

        int z = 5;
        int k = 2;
        double resultado = (double) z / k;
        System.out.printf("O resultado da divisão é %.2f\n", resultado);

        double f = 2.636;
        int g = (int) f;
        System.out.printf("O valor arredondado é %d\n", g);
    }
}
