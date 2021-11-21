package BasicInfo;
import java.util.Scanner;

public class Importing {
  public Importing() {
    BasicExample();
  }

  public void BasicExample() {
    Scanner userInput = new Scanner(System.in);

    // Must close any I/O operations as usual
    try {
      System.out.println("Enter username");
    
      String userName = userInput.nextLine();
      System.out.println("Username is: " + userName);
    }
    finally {
      // ensures proper cleanup
      userInput.close();
    }
  }
}
