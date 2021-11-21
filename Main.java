public class Main {
  public static void main(String[] args) {
    RunExample(10);
  }

  private static void RunExample(int exampleNumber)
  {
    switch (exampleNumber){
      case 0:
        new Intro();
        break;
      case 1:
        EncapExample();
        break;
      case 2:
        NestedClassesExample();
        break;
      case 3:
        Importing.ImportingExample();
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
    }

  }

  private static void EncapExample() {
    var encap = new Encapsulation();
    encap.MethodExample();
    encap.setName("Hello");
    System.out.println(encap.getName());
  }

  private static void NestedClassesExample() {
    System.out.println(NestedClasses.x + NestedClasses.InnerClass.y);
  }

}