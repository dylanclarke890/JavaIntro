import java.util.HashMap;

public class HashMaps {
  public HashMaps() {
    BasicExample();
    Looping();
  }

  private void BasicExample(){
    // Uses wrapped primitive data types instead of primitives
    HashMap<String, String> capitalCities = getCitiesHashMap();

    capitalCities.get("England"); // Get values
    capitalCities.remove("England"); // Delete values
    
    System.out.println(capitalCities);
  }

  private void Looping() {
    HashMap<String, String> capitalCities = getCitiesHashMap();

    // if wanting to access keys
    for (String i : capitalCities.keySet()) {
      System.out.println(i);
    }

    // if wanting to access values
    for (String i : capitalCities.values()) {
      System.out.println(i);
    }
  }

  private HashMap<String, String> getCitiesHashMap() {
    // Similar to Dictionary<string, string> in c#
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("Germany", "Berlin");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("USA", "Washington DC");

    return capitalCities;
  }

}
