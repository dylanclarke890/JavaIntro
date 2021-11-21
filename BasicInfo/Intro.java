package BasicInfo;
public class Intro {
  public Intro() {
    finalModifier();
    primitiveDataTypes();
    typeCasting();
    mathClass();
    ternaryOperator();
    forEachLoops();
    blockScope();
  }

  private void finalModifier() {
    // readonly modifier
    final float tutFloat = 1.0f;
    final boolean tutBool = false;
    System.out.println(tutFloat);
    System.out.println(tutBool);
  }

  private void primitiveDataTypes() {
    // examples of primitive data types
    char tutChar = 'a';
    int tutInt = 1;
    System.out.println(tutChar);
    System.out.println(tutInt);
    
    // non-primitive data type
    String tutString = "Hello World";
    System.out.println(tutString);

    asciiChars();
    byteRange();
    shortRange();

    long tutLong = 15000000000L;
    System.out.println(tutLong);

    scientificNumbers();
  }

  private void blockScope() {
    // Code here CANNOT use x

    { // This is a block

      // Code here CANNOT use x

      int x = 100;

      // Code here CAN use x
      System.out.println(x);

   } // end of block

  // x is undefined again

  }

  private void forEachLoops() {
    String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
    for (String i : cars) {
      System.out.println(i);
    }
  }

  private void ternaryOperator() {
    // wrapped in parentheses compared to c#
    int someNumber = 3;
    String isTrue = (4 > someNumber) ? "Yes" : "No";
    System.out.println(isTrue);
  }

  private void mathClass() {
    // usage examples
    Math.max(5, 10);
    Math.min(4, 2);
    Math.sqrt(9);
    Math.abs(-4.7);
    randomMethodExtensionExample();
  }

  private void randomMethodExtensionExample() {
    int randomNum = (int)(Math.random() * 101);  // 0 to 100
    System.out.println(randomNum);
  }

  private void typeCasting() {
    /* widening casting - can be done if converted 
      datatype is a bigger size type */
    int smallerType = 9;
    double castedInt = smallerType; // Automatic
    System.out.println(castedInt);

    /* narrowing casting must be done otherwise*/
    double biggerType = 9.0;
    int castedDouble = (int) biggerType;
    System.out.println(castedDouble);
  }

  private void asciiChars() {
    char asciiChar = 43;
    System.out.println(asciiChar);
  }

  private void byteRange() {
    byte tutSmallestByte = -127;
    byte tutLargestByte = 127;
    System.out.println(tutSmallestByte + tutLargestByte);
  }

  private void shortRange() {
    short tutSmallestShort = -32768;
    short tutLargestShort = 32767;
    System.out.println(tutSmallestShort + tutLargestShort);
  }

  private void scientificNumbers() {
    float scientificNumber = 2e4f;
    System.out.println(scientificNumber);
  }
}
