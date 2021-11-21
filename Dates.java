import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Dates {
  public Dates() {
    DatesExample();
    FormattingDatesExample();
  }
  
  private void DatesExample() {
    LocalDate date = LocalDate.now();
    LocalDateTime dateTime = LocalDateTime.now();
  
    System.out.println(date);
    System.out.println(dateTime);
  }

  private void FormattingDatesExample() {
    LocalDateTime before = LocalDateTime.now();
    System.out.println("Before formatting: " + before);
    DateTimeFormatter pattern = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    String after = before.format(pattern);
    System.out.println("After formatting: " + after);
  }
}
