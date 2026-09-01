import java.util.InputMismatchException;
import java.util.Scanner;

public class stackTrace {
    public static void main(String[] args) throws Exception {
        method2();

    }

    public static void method() {
        System.out.println("Start of program 1");
        Scanner sc = new Scanner(System.in);

        try {
            String[] vect = sc.nextLine().split(" ");
            int position = sc.nextInt();
            System.out.println(vect[position]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid position!");
            e.printStackTrace();
        } catch (InputMismatchException e) {
            System.out.println("Input error!");
            e.printStackTrace();
        }

        sc.close();
        System.out.println("end of program 1");
    }

    public static void method2() {
        System.out.println("Start of program 2");
        method();
        System.out.println("end of program 2");
    }
}
