import BasicInfo.*;
import Classes.*;
import FileHandling.*;

public class Main {
  public static void main(String[] args) {
    RunExample(12);
  }

  private static void RunExample(int exampleNumber)
  {
    switch (exampleNumber){
      case 0:
        new Intro();
        break;
      case 1:
        new Encapsulation();
        break;
      case 2:
        new NestedClasses();
        break;
      case 3:
        new Importing();
        break;
      case 4:
        new Dates();
        break;
      case 5:
        new ArrayLists();
        break;
      case 6:
        new LinkedLists();
        break;
      case 7:
        new HashMaps();
        break;
      case 8:
        new Iterators();
        break;
      case 9:
        new Regex();
        break;
      case 10:
        new Threads();
        break;
      case 11:
        new Lambdas();
        break;
      case 12:
        new Files();
        break;
    }
  }
}