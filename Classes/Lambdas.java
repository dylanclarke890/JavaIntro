package Classes;
import java.util.ArrayList;
import java.util.function.Consumer;

public class Lambdas {
  public Lambdas() {
    BasicExample();
    ExampleWithInterface();
  }

  private void ExampleWithInterface() {
    StringFunction exclaim = (s) -> s + "!";
    StringFunction ask = (s) -> s + "?";
    printFormatted("Hello", exclaim);
    printFormatted("Hello", ask);
  }

  private void printFormatted(String str, StringFunction format) {
    String result = format.run(str);
    System.out.println(result);
  }

  private void BasicExample() {
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    
    numbers.add(5);
    numbers.add(9);
    numbers.add(8);
    numbers.add(1);

    // store a lambda in a variable
    Consumer<Integer> method = (n) -> { System.out.println(n); };
    numbers.forEach( method );
  }
  
  interface StringFunction {
    String run(String str);
  }
}
