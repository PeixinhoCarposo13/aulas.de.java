import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DataHora {
    public static void main(String[] args) throws Exception {
        
        //Data de agora
        LocalDate d1 = LocalDate.now();

        //data e hoario de agora
        LocalDateTime d2 = LocalDateTime.now();

        //data e horario de agora global GNT
        Instant d3 = Instant.now();

        LocalDate d4 = LocalDate.parse("2026-08-07");

        LocalDateTime d5 = LocalDateTime.parse("2026-08-07T16:10:58");

        Instant d6 = Instant.parse("2026-08-07T16:10:58Z");

        Instant d7 = Instant.parse("2026-08-07T16:10:58-3:00");

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);
        System.out.println(d7);
    }
}
