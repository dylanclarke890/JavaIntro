public class Main {
  public static void main(String[] args) {
    new Intro();
    EncapExample();
  }

  private static void EncapExample() {
    var encap = new Encapsulation();
    encap.MethodExample();
    encap.setName("Hello");
    System.out.println(encap.getName());
  }
  
}