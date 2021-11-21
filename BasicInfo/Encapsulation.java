package BasicInfo;
public class Encapsulation extends AbstractExample {
  public Encapsulation() {
    BasicExample();
  }

  private String name;
  public String getName(){
    return this.name;
  }
  public void setName(String newName){ 
    this.name = newName;
  }
  
  private void BasicExample() {
    MethodExample();
    setName("Hello");
    System.out.println(getName());
  }

  public void MethodExample() {
    System.out.println("Inherited method.");
  }
}

abstract class AbstractExample {
  abstract void MethodExample();
}