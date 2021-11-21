import java.util.Scanner;

public class Importing {

  public static void ImportingExample() {
    Scanner userInput = new Scanner(System.in);

    try {
      System.out.println("Enter username");
    
      String userName = userInput.nextLine();
      System.out.println("Username is: " + userName);
    }
    finally {
      userInput.close();
    }
  }
}
