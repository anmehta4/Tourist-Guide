// --== CS400 File Header Information ==--
// Name: Arnav Mehta
// Email: anmehta4@wisc.edu email address
// Team: LC
// TA: Divyanshu Saxena
// Lecturer: Gary Dahl
// Notes to Grader: None

/**
 * This class defines the Destinations object type. It is the data type for the values in the
 * hashtable map. Each key of type String corresponds to a value of type Destinations.
 * 
 * @author ishitadhoot
 *
 */
public class Destinations {
  private String[][] destinationsList = new String[2][2]; // holds the two most popular destinations
                                                          // and their
                                                          // addresses
  private int rating; // the rating from 1-5 for the list of destinations we provide for each state
  private int ratingCount; // the number of users who rated our listing for that state

  /**
   * 
   * This constructor initializes the spots and their addresses.
   * 
   * @param spot1    - the first popular destination
   * @param address1 - the address of the first popular destination
   * @param spot2    - the second popular destination
   * @param address2 - the address of the second popular destination
   */
  public Destinations(String spot1, String address1, String spot2, String address2) {
    this.destinationsList[0][0] = spot1;
    this.destinationsList[0][1] = address1;
    this.destinationsList[1][0] = spot2;
    this.destinationsList[1][1] = address2;
  }

  /**
   * Retrieves the list of popular attractions one must visit in that state.
   * 
   * @return a String with the two places
   */
  public String getSpots() {
    return "1. " + destinationsList[0][0] + "\n2. " + destinationsList[1][0] + "\n"; // returns
                                                                                     // places in a
                                                                                     // neat and
                                                                                     // numbered
                                                                                     // fashion
  }

  /**
   * Retrieves the addresses of the popular destinations
   * 
   * @param spotNumber - the number of the destination for which the address needs to be returned
   * @return the address of one of the two places for that state
   */
  public String getAddress(int spotNumber) {
    if (spotNumber == 1) {
      return destinationsList[0][1] + "\n"; // returns the address of the first destination
    } else {
      return destinationsList[1][1] + "\n"; // returns the address of the first destination
    }
  }

  /**
   * Gets the rating for our listing
   * 
   * @return - the average rating left by all users till now for that set of destinations
   */
  public int getRating() {
    return rating;
  }

  /**
   * Gets the number of users who left us a rating
   * 
   * @return - the number of users for that set of destinations
   */
  public int getRatingCount() {
    return this.ratingCount;
  }

  /**
   * Takes in a rating by a new user and updates the average rating thus far
   * 
   * @param newRating - the average rating for this listing thus far
   */
  public void addRating(int newRating) {
    if (rating == 0) // Case 1: The first user leaves us a rating
      rating = newRating; // simply update the rating to reflect the new user's rating
    else // Case 2: There exists previous rating from other users
      this.rating = ((this.rating * this.ratingCount) + newRating) / (this.ratingCount + 1); // calulates
                                                                                             // the
                                                                                             // average
                                                                                             // of
                                                                                             // all
                                                                                             // rating
                                                                                             // so
                                                                                             // far
    this.ratingCount++; // increments the number of users who left us a rating
  }
}
