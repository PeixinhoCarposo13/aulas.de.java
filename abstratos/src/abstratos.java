import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

import entities.Color;
import entities.Shape;
import entities.Rectangle;
import entities.Circle;

public class abstratos {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of shapes: ");
        int n = sc.nextInt();

        List<Shape> shapes = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data:");

            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            String colorStr = sc.next();
            Color color = Color.valueOf(colorStr.toUpperCase());

            if (ch == 'r') {
                System.out.print("Width: ");
                double width = sc.nextDouble();

                System.out.print("Height: ");
                double height = sc.nextDouble();

                Rectangle rectangle = new Rectangle(color, width, height);
                System.out.println("Area: " + rectangle.area());

                shapes.add(new Rectangle(color, width, height));
            } else if (ch == 'c') {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();

                Circle circle = new Circle(color, radius);
                System.out.println("Area: " + circle.area());

                shapes.add(new Circle(color, radius));
            } else {
                System.out.println("Invalid shape type.");
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS:");
        for (Shape shape : shapes) {
            System.out.println(shape.area());
        }
        sc.close();
    }
}
