package Classes;
import java.util.LinkedList;

/* 
  The LinkedList stores its items in "containers." The list has a link to the first
  container and each container has a link to the next container in the list. To add
  an element to the list, the element is placed into a new container and that
  container is linked to one of the other containers in the list.
*/
public class LinkedLists {
  public LinkedLists() {
    ExtraMethods();
  }

  private void ExtraMethods() {
    LinkedList<String> cars = new LinkedList<String>();
    cars.addFirst("Volvo");
    cars.addLast("BMW");
    cars.getFirst();
    cars.getLast();
    System.out.println(cars);
  }
}
