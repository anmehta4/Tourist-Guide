// --== CS400 File Header Information ==--
// Name: Arnav Mehta
// Email: anmehta4@wisc.edu email address
// Team: LC
// TA: Divyanshu Saxena
// Lecturer: Gary Dahl
// Notes to Grader: None

/**
 * This class is used to test the functionality of the Tourist Guide Application.
 * 
 * @author hazaa
 *
 */
public class TestTouristGuide {

  static HashTableMap<String, Destinations> map = new HashTableMap<String, Destinations>(5);
  static Destinations object1 =
      new Destinations("US Space and Rocket Center", "1 Tranquility Base, Huntsville, AL 35805",
          "Gulf Shores Beach", "101 Gulf Shores Pkwy, Gulf Shores, AL 36542");
  static Destinations object2 =
      new Destinations("Kailua Beach", "526 Kawailoa Rd, Kailua, HI 96734",
          "Hawaii Volcanoes National Park", "Hawaii Volcanoes National Park, HI 96718");

  /**
   * This method tests the functioning of the getSpots() method from the Destinations class
   * 
   * @return a boolean value depending on the result of the test
   */
  public static boolean test1() {
    map.put("Alabama", object1);
    if (object1.getSpots()
        .equals("1. " + "US Space and Rocket Center" + "\n2. " + "Gulf Shores Beach" + "\n")) {
      return true;
    }
    map.put("Sjsh", object2);
    if (map.containsKey("Sjsh")) {
      return false;
    }
    return false;
  }

  /**
   * This method tests the functioning of the getAddress() method from the Destinations class
   * 
   * @return a boolean value depending on the result of the test
   */
  public static boolean test2() {

    if (object2.getAddress(1).equals("526 Kawailoa Rd, Kailua, HI 96734" + "\n")) {
      return true;
    }
    return false;
  }

  /**
   * This method tests the functioning of the getRating() method from the Destinations class
   * 
   * @return a boolean value depending on the result of the test
   */
  public static boolean test3() {
    Destinations object1 = new Destinations("Yale University", "New Haven, CT 06520",
        "Mystic Aquarium", "55 Coogan Blvd, Mystic, CT 06355");
    if (object1.getRating() == 0) {
      return true;
    }
    return false;
  }

  /**
   * This method tests the functioning of the addRating() method from the Destinations class
   * 
   * @return a boolean value depending on the result of the test
   */
  public static boolean test4() {
    Destinations object1 = new Destinations("Everglades National Park",
        "Everglades National Park, large natural area encompassing the southwestern portion of the more extensive Everglades region in southern Florida",
        "Universal Studios", "6000 Universal Blvd, Orlando, FL 32819");
    object1.addRating(3);
    if (object1.getRating() == 3) {
      return true;
    }
    return false;
  }

  // The Main Method is being used to run the tests.
  public static void main(String[] args) {
    System.out.println("Test 1: " + test1());
    System.out.println("Test 2: " + test2());
    System.out.println("Test 3: " + test3());
    System.out.println("Test 4: " + test4());

  }

}
