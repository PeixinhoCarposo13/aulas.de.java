import java.text.SimpleDateFormat;
import java.util.Calendar;

public class data {

  public static void main(String[] args) {
    // Criando um objeto SimpleDateFormat com o formato desejado
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    // Obtendo a data e hora atual
    java.util.Date now = new java.util.Date();

    // Formatando a data e hora atual
    String formattedDate = sdf.format(now);
    String formattedDateTime = sdf2.format(now);

    // Exibindo a data e hora formatada
    System.out.println("Data e hora atual: " + formattedDate);
    System.out.println("Data e hora atual: " + formattedDateTime);

    Calendar calendar = Calendar.getInstance();
    calendar.setTime(now); // Definindo a data atual no objeto Calendar
    calendar.add(Calendar.DAY_OF_MONTH, 7); // Adiciona 7 dias à data atual
    int day = calendar.get(Calendar.DAY_OF_MONTH); // Obtendo o dia do mês
    int month = calendar.get(Calendar.MONTH) + 1; // Obtendo o mês (0-11, então adicionamos 1)
    int year = calendar.get(Calendar.YEAR); // Obtendo o ano
    int hour = calendar.get(Calendar.HOUR_OF_DAY); // Obtendo a hora (0-23)
    int minute = calendar.get(Calendar.MINUTE); // Obtendo os minutos
    int second = calendar.get(Calendar.SECOND); // Obtendo os segundos

    System.out.println(
        "Data e hora daqui a 7 dias: " + day + "/" + month + "/" + year + " " + hour + ":" + minute + ":" + second);

  }

}
