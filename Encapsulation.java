public class Encapsulation extends AbstractExample {
  
  private String name;

  public String getName(){
    return this.name;
  }

  public void setName(String newName){ 
    this.name = newName;
  }

  public void MethodExample() {
    System.out.println("Inherited method.");
  }
}

abstract class AbstractExample {

  abstract void MethodExample();
}