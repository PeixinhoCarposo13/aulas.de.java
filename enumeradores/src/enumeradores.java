import java.util.Date;
import entities.order;

public class enumeradores {
    public static void main(String[] args) throws Exception {

        order.OrderStatus status1 = order.OrderStatus.PENDING_PAYMENT;
        order.OrderStatus status2 = order.OrderStatus.valueOf("PROCESSING");

        order o = new order(123, new Date(), order.OrderStatus.valueOf("PROCESSING"));

       

        System.out.println(o);
        System.out.println("Status1: " + status1);
         System.out.println("Status2: " + status2);

    }
}
