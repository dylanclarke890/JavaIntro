package Classes;
public class NestedClasses {
  public NestedClasses() {
    new InnerClass();
  }

  int x = 10;

  class InnerClass {
    public InnerClass() {
      System.out.println(x + y);
    }
    
    int y = 5;
  }
}
