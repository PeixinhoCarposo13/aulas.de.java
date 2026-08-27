import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import entities.Employee;

public class projetoEmpresa {
  public static void main(String[] args) throws Exception {

    Scanner sc = new Scanner(System.in);

    System.out.println("Qual a quantidade de funcionários?");
    int n = sc.nextInt();

    List<Employee> list = new ArrayList<>();

    for (int i = 1; i <= n; i++) {
      System.out.println("Funcionário #" + i + " dados:");
      System.out.print("Terceirizado (y/n)? ");
      char ch = sc.next().charAt(0);

      System.out.print("Nome: ");
      sc.nextLine();
      String name = sc.nextLine();

      System.out.print("Horas: ");
      int hours = sc.nextInt();

      System.out.print("Valor por hora: ");
      double valuePerHour = sc.nextDouble();

      if (ch == 'y') {
        System.out.print("Cobrança adicional: ");
        double additionalCharge = sc.nextDouble();
        list.add(new entities.OutsourcedEmployee(name, hours, valuePerHour, additionalCharge));
      } else {
        list.add(new Employee(name, hours, valuePerHour));
      }
    }
    System.out.println();
    System.out.println("Pagamentos:");
    for (Employee emp : list) {
      System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
    }

    sc.close();
  }
}