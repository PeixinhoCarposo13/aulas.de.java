/*
Fazer um programa para ler as medidas dos lados de dois triângulos X e Y (suponha medidas válidas). 
Em seguida, mostrar o valor das áreas dos dois triângulos e dizer qual dos dois triângulos possui 
a maior área.
*/
import java.util.Scanner;

public class problema_triangulo {
    
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner( System.in);

        // Declaração de arrays para armazenar os lados dos triângulos
        double[] a = new double[2];
        double[] b = new double[2];
        double[] c = new double[2];
        double[] area = new double[2];

        // Loop para ler as medidas dos lados dos triângulos
        for(int i = 0; i<2; i++)
        {
            System.out.print("Insira a medida do lado a do " + (i + 1) + "° triângulo: ");
            a[i] = sc.nextDouble();

            System.out.print("Insira a medida do lado b do " + (i + 1) + "° triângulo: ");
            b[i] = sc.nextDouble();

            System.out.print("Insira a medida do lado c do " + (i + 1) + "° triângulo: ");
            c[i] = sc.nextDouble();

            System.out.println();
        }

        // Loop para calcular a área dos triângulos usando a fórmula de Herão
        for(int i = 0; i<2; i++)
        {
            Double p = (a[i] + b[i] + c[i]) / 2;
            area[i] = Math.sqrt(p * (p - a[i]) * (p - b[i]) * (p - c[i]));
            System.out.println(" Área do " + (i + 1) + "° triângulo: " + area[i]);
            System.out.println();
        }

        // Comparação das áreas dos triângulos e exibição do resultado
        if(area[0] > area[1])
        {
            System.out.println("O 1° triângulo possui a maior área.");
        }
        else if(area[0] < area[1])
        {
            System.out.println("O 2° triângulo possui a maior área.");
        }
        else
        {
            System.out.println("Os dois triângulos possuem a mesma área.");
        }
        

        sc.close();
    }
}
