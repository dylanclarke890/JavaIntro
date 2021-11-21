package BasicInfo;

public class Primitives {
  public Primitives() {
    primitiveDataTypes();
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
