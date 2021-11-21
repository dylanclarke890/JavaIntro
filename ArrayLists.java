import java.util.ArrayList;
import java.util.Collections;

/* 
  ArrayLists add new items to an array, unless the array
  isn't big enough, in which case a new, bigger array is created
  and the old one is removed.
*/
public class ArrayLists {
  public ArrayLists() {
    BasicExample();
    ExampleWithPrimitives();
    SortingExample();
  }

  private void BasicExample() {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    // accessing items
    cars.get(0);
    cars.set(0, "New");
    
    System.out.println(cars);
  }

  private void ExampleWithPrimitives() {
    /* instead of using primitive version, have to specify a
      wrapper type to be able to use primitives */
    ArrayList<Integer> myNumbers = new ArrayList<Integer>();

    myNumbers.add(10);
    myNumbers.add(15);
    myNumbers.add(20);
    myNumbers.add(25);
    
    for (int i : myNumbers) {
      System.out.println(i);
    }
  }

  private void SortingExample() {
    ArrayList<String> cars = new ArrayList<String>();

    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    Collections.sort(cars);  // Sort cars
    
    for (String i : cars) {
      System.out.println(i);
    }
  }
}
