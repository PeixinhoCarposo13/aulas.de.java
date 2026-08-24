import entities.Comments;
import entities.Post;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class stringBuilder {
  public static void main(String[] args) throws ParseException {
    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    Comments c1 = new Comments("Have a nice trip");
    Comments c2 = new Comments("Wow that's awesome!");
    Post p1 = new Post(
        sdf.parse("21/06/2023 14:30:00"),
        "Traveling to New Zealand",
        "I'm going to visit this wonderful country!",
        12);
    p1.addComment(c1);
    p1.addComment(c2);

    System.out.println(p1);
  }
}
