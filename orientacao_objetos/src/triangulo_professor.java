import java.util.Scanner;
import entities.Triangle;

public class triangulo_professor {
    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner( System.in);

         double areaX, areaY;

         Triangle x, y;
         x = new Triangle();
         y = new Triangle();

        lerTriangulo(sc, x, 1);
        lerTriangulo(sc, y, 2);


        areaX = x.area();
        areaY = y.area();

        System.out.printf("Área do 1° triângulo: %.2f%n", areaX);
        System.out.printf("Área do 2° triângulo: %.2f%n", areaY);

        // Comparação das áreas dos triângulos e exibição do resultado
        if(areaX > areaY)
        {
            System.out.println("O 1° triângulo possui a maior área.");
        }
        else if(areaX < areaY)
        {
            System.out.println("O 2° triângulo possui a maior área.");
        }
        else
        {
            System.out.println("Os dois triângulos possuem a mesma área.");
        }
        
        sc.close();
    }

    public static void lerTriangulo(Scanner sc, Triangle t, int numero) {
    System.out.print("Insira a medida do lado a do " + numero + "° triângulo: ");
    t.a = sc.nextDouble();

    System.out.print("Insira a medida do lado b do " + numero + "° triângulo: ");
    t.b = sc.nextDouble();

    System.out.print("Insira a medida do lado c do " + numero + "° triângulo: ");
    t.c = sc.nextDouble();
    }
}
