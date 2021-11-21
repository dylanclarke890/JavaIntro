package Classes;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
  public Regex() {
    BasicExample();
    Flags();
  }

  private void BasicExample() {
    Pattern pattern = Pattern.compile("Hello", Pattern.CASE_INSENSITIVE);
    Matcher matcher = pattern.matcher("hello world");
    boolean matchFound = matcher.find();
    if(matchFound) {
      System.out.println("Match found");
    } else {
      System.out.println("Match not found");
    }
  }

  private void Flags() {
    String stringToMatch = "Hello world";

    // The case of letters will be ignored when performing a search.
    Pattern insensitivePattern = Pattern.compile("Hello", Pattern.CASE_INSENSITIVE);
    Matcher insensitiveMatcher = insensitivePattern.matcher(stringToMatch);
    System.out.println("Match found:" + insensitiveMatcher.find());
    
    // Special characters in this pattern will not have any special meaning
    // and will be treated as ordinary characters
    Pattern literalPattern = Pattern.compile("Hello", Pattern.LITERAL);
    Matcher literalMatcher = literalPattern.matcher(stringToMatch);
    System.out.println("Match found:" + literalMatcher.find());

    // Use this together with the CASE_INSENSITIVE 
    // flag to also ignore the case of letters outside of the English alphabet
    Pattern unicodePattern = Pattern.compile("Hello", Pattern.UNICODE_CASE);
    Matcher unicodeMatcher = unicodePattern.matcher(stringToMatch);
    System.out.println("Match found:" + unicodeMatcher.find());
  }
}
