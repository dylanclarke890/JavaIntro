import java.util.ArrayList;
import java.util.Iterator;

/* 
  Java can get objects used for iterating over a collection.
  Iterators are useful as they are able to manipulate the data of a collection
  while looping over it, which isn't possible with a for/foreach loop
  as the size of the collection would be changing while looping.
*/
public class Iterators {
  public Iterators() {
    BasicExample();
    ManipulateDataWhileLooping();
  }

  private void BasicExample() {
    // Make a collection
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("1st");
    cars.add("2nd");
    cars.add("3rd");
    cars.add("4th");

    // Get the iterator
    Iterator<String> it = cars.iterator();

    // Print the first item
    System.out.println(it.next());

    // loop through the rest
    while(it.hasNext()) {
      System.out.println(it.next());
    }
  }

  private void ManipulateDataWhileLooping(){
    ArrayList<Integer> numbers = new ArrayList<Integer>();
    
    numbers.add(12);
    numbers.add(8);
    numbers.add(2);
    numbers.add(23);

    Iterator<Integer> it = numbers.iterator();

    while(it.hasNext()) {
      Integer i = it.next();
      if(i < 10) {
        it.remove();
      }
    }

    System.out.println(numbers);
  }
}
