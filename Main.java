public class Main {
  public static void main(String[] args) {
    finalModifier();
    primitiveDataTypes();
    typeCasting();
    mathClass();
  }

  private static void mathClass() {
    Math.max(5, 10);
    Math.min(4, 2);
    Math.sqrt(9);
    Math.abs(-4.7);
    randomMethodExtensionExample();
  }

  private static void randomMethodExtensionExample() {
    int randomNum = (int)(Math.random() * 101);  // 0 to 100
    System.out.println(randomNum);
  }

  private static void typeCasting() {
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

  private static void finalModifier() {
    // readonly modifier
    final float tutFloat = 1.0f;
    final boolean tutBool = false;
    System.out.println(tutFloat);
    System.out.println(tutBool);
  }

  private static void primitiveDataTypes() {
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

  private static void byteRange() {
    byte tutSmallestByte = -127;
    byte tutLargestByte = 127;
    System.out.println(tutSmallestByte + tutLargestByte);
  }

  private static void shortRange() {
    short tutSmallestShort = -32768;
    short tutLargestShort = 32767;
    System.out.println(tutSmallestShort + tutLargestShort);
  }

  private static void scientificNumbers() {
    float scientificNumber = 2e4f;
    System.out.println(scientificNumber);
  }

  private static void asciiChars() {
    char asciiChar = 43;
    System.out.println(asciiChar);
  }
}