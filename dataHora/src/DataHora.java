import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DataHora {
    public static void main(String[] args) throws Exception {

        // Data de agora
        LocalDate d1 = LocalDate.now();

        // data e hoario de agora
        LocalDateTime d2 = LocalDateTime.now();

        // data e horario de agora global GNT
        Instant d3 = Instant.now();

        LocalDate d4 = LocalDate.parse("2026-08-07");

        LocalDateTime d5 = LocalDateTime.parse("2026-08-07T16:10:58");

        Instant d6 = Instant.parse("2026-08-07T16:10:58Z");

        // Esse formato serve
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        // Esse formato serve
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        // Esse formato é usado para formatar a data e hora no fuso horário do sistema
        // da máquina que está executando o código. Ele pega a data e hora do Instant
        // (d3) e converte para o fuso horário local.
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());

        /*
         * // Listando todos os fusos horários disponíveis
         * for (String zoneId : ZoneId.getAvailableZoneIds()) {
         * System.out.println(zoneId);
         * }
         */

        // Convertendo o Instant (d3) para LocalDate no fuso horário do sistema
        /* LocalDate d7 = LocalDate.ofInstant(d3, ZoneId.systemDefault()); */

        // Convertendo para Dia, Mes, Ano, Hora, minuto e segundo.
        System.out.println("Dia: " + d5.getDayOfMonth());
        System.out.println("Mês: " + d5.getMonthValue());
        System.out.println("Ano: " + d5.getYear());
        System.out.println("Hora: " + d2.getHour());
        System.out.println("Minuto: " + d2.getMinute());
        System.out.println("Segundo: " + d2.getSecond());

        // Calculando datas passadas e futuras
        LocalDate pastweek = d1.minusDays(7);
        LocalDate nextweek = d1.plusDays(7);
        LocalDateTime pastweek2 = d2.minusDays(7);
        LocalDateTime nextweek2 = d2.plusDays(7);

        System.out.println("Data de hoje: " + d1);
        System.out.println("Data de uma semana atrás: " + pastweek);
        System.out.println("Data de uma semana a frente: " + nextweek);

        System.out.println("Data e hora de hoje: " + d2);
        System.out.println("Data e hora de uma semana atrás: " + pastweek2);
        System.out.println("Data e hora de uma semana a frente: " + nextweek2);

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);
        System.out.println(d4);
        System.out.println(d5);
        System.out.println(d6);
        System.out.println(d1.format(fmt1));
        System.out.println(d1.format(fmt2));
        System.out.println(fmt3.format(d3));
        /* System.out.println(d7); */
    }
}
