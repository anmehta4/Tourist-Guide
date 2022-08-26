// --== CS400 File Header Information ==--
// Name: Arnav Mehta
// Email: anmehta4@wisc.edu email address
// Team: LC
// TA: Divyanshu Saxena
// Lecturer: Gary Dahl
// Notes to Grader: None

import java.util.Scanner;

/**
 * 
 * @author arnav - To implement the Guide Objects and use the HashMap to create a Tourist Guide.
 *
 */

public class TouristGuide implements GuideObjects {
  private final static String WELCOME_MESSAGE =
      "==================== Welcome to the Tourist Guide ===================";
  private final static String GOODBYE_MESSAGE =
      "=============== Thank You for using the Tourist Guide ===============";

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    HashTableMap<String, Destinations> map = new HashTableMap<String, Destinations>(50);
    /*
     * adding all the states to the map with their respective Destination Objects by using the
     * GuideObjects interface
     * 
     */
    map.put("Alabama", AlabamaD);
    map.put("Alaska", AlaskaD);
    map.put("Arizona", ArizonaD);
    map.put("Arkansas", ArkansasD);
    map.put("California", CaliforniaD);
    map.put("Colorado", ColoradoD);
    map.put("Connecticut", ConnecticutD);
    map.put("Delaware", DelawareD);
    map.put("Florida", FloridaD);
    map.put("Georgia", GeorgiaD);
    map.put("Hawaii", HawaiiD);
    map.put("Idaho", IdahoD);
    map.put("Illinois", IllinoisD);
    map.put("Indiana", IndianaD);
    map.put("Iowa", IowaD);
    map.put("Kansas", KansasD);
    map.put("Kentucky", KentuckyD);
    map.put("Louisiana", LouisianaD);
    map.put("Maine", MaineD);
    map.put("Maryland", MarylandD);
    map.put("Massachusetts", MassachusettsD);
    map.put("Michigan", MichiganD);
    map.put("Minnesota", MinnesotaD);
    map.put("Mississippi", MississippiD);
    map.put("Missouri", MissouriD);
    map.put("Montana", MontanaD);
    map.put("Nebraska", NebraskaD);
    map.put("Nevada", NevadaD);
    map.put("New Hampshire", New_HampshireD);
    map.put("New Jersey", New_JerseyD);
    map.put("New Mexico", New_MexicoD);
    map.put("North Carolina", North_CarolinaD);
    map.put("North Dakota", North_DakotaD);
    map.put("Ohio", OhioD);
    map.put("Oklahoma", OklahomaD);
    map.put("Oregon", OregonD);
    map.put("Pennsylvania", PennsylvaniaD);
    map.put("Rhode Island", Rhode_IslandD);
    map.put("South Carolina", South_CarolinaD);
    map.put("Tennessee", TennesseeD);
    map.put("Texas", TexasD);
    map.put("New York", New_YorkD);
    map.put("Utah", UtahD);
    map.put("Vermont", VermontD);
    map.put("Virginia", VirginiaD);
    map.put("Washington", WashingtonD);
    map.put("West Virginia", West_VirginiaD);
    map.put("Wisconsin", WisconsinD);
    map.put("Wyoming", WyomingD);

    System.out.println("\n" + WELCOME_MESSAGE + "\n"); // Displaying the welcome message
    int option = chooseOption(); // asking the user to enter an option


    while (option != 4) {

      if (option == 1) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the state following the rules of capitalization:");
        // Asking the user to input the state which is used as the key in our hashmap
        String key = sc.nextLine();
        if (map.containsKey(key)) {
          Destinations value = map.get(key); // storing the value mapped to the key
          System.out.println("These are a must visit if you go to " + key);
          System.out.println(value.getSpots()); // getting the tourist spots of the destination
          int newOption = addAddressOption(); // Additional options once the tourist spots are
                                              // displayed
          while (newOption != 3) {
            if (newOption == 1 || newOption == 2) { // displaying the address of the corresponding
                                                    // tourist spot
              System.out.println(value.getAddress(newOption));
              newOption = addAddressOption();
            } else if (newOption == 3) { // going back to the main menu
              break;
            } else {
              System.out.println("Please enter [1],[2] or [3]"); // if the user enters any other
                                                                 // number
              newOption = addAddressOption();
            }
          }
        } else
          System.out.println("Sorry. This state is not in the US" + "\n");


      } else if (option == 2) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the state following the rules of capitalization:");
        // Asking the user to input the state which is used as the key in our hashmap
        String key = sc.nextLine();
        if (map.containsKey(key) == false) { // displaying an appropriate message if wrong state
                                             // name
          System.out.println("Sorry. This state is not in the US" + "\n");
        } else {
          System.out.println("Enter a value between 1-5 to rate the place");
          int rating = sc.nextInt(); // storing the users rating
          if (rating >= 0 && rating <= 5) {
            map.get(key).addRating(rating); // adding the appropriate rating
            System.out.println("Rating added successfully!" + "\n"); // Displaying a success message
          } else
            System.out.println("Inappropriate rating! Could not add the rating" + "\n");
          // Displaying message if rating out of bounds
        }

      } else if (option == 3) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the state following the rules of capitalization:");
        // Asking the user to input the state which is used as the key in our hashmap
        String key = sc.nextLine();
        if (map.containsKey(key)) { // if the state is a valid name
          Destinations value = map.get(key);
          System.out.println("Rating: " + value.getRating() + " from a total of "
              + value.getRatingCount() + " visitors" + "\n"); // get the rating from the object and
                                                              // display it fof the user
        } else
          System.out.println("Sorry. This state is not in the US" + "\n");

      } else if (option == 4) {
        break; // exit the application

      } else {
        System.out.println("Error! Inappropriate option chosen. Please try again."); // if option is
                                                                                     // out of
                                                                                     // bounds
      }
      option = chooseOption();
    }
    System.out.println(GOODBYE_MESSAGE); // display the goodbye message
  }

  /**
   * Display options for the main menu and get the option chosen by the users
   * 
   * @return int - the option chosen by the user
   **/
  public static int chooseOption() {

    Scanner sc = new Scanner(System.in);
    System.out.println("MAIN COMMAND MENU:"); // Displaying the options of the main menu
    System.out.println("[1] Find the must visit spots of a state in the US");
    System.out.println("[2] Rate our listing for a state");
    System.out.println("[3] Get the rating of a state");
    System.out.println("[4] Exit");

    int option = sc.nextInt();
    return option; // returning the users option
  }

  /**
   * Display the options of the additional menu and get the option chosen by the users
   * 
   * @return int - the option chosen by the user
   */
  public static int addAddressOption() {
    Scanner sc = new Scanner(System.in);
    System.out.println("ADDITIONAL COMMAND MENU:");// Displaying the options of the additional menu
    System.out.println("[1] View the Address of the first popular Destination");
    System.out.println("[2] View the Address of the second popular Destination");
    System.out.println("[3] Go back to Main Command Menu");
    int option = sc.nextInt();// Storing the users option
    return option; // returning the users option
  }
}
