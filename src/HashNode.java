// --== CS400 File Header Information ==--
// Name: Arnav Mehta
// Email: anmehta4@wisc.edu email address
// Team: LC
// TA: Divyanshu Saxena
// Lecturer: Gary Dahl
// Notes to Grader: None

/**
 * 
 * @author Arnav - Create a node for the Key-Value pairs
 * 
 **/

/**
 * Constructor of the class to create a node of the key-value pair
 * 
 * @param <K>
 * @param <V>
 */
class HashNode<K, V> {
  K key;
  V value;

  HashNode<K, V> next; // Reference to next node

  /**
   * Constructor to create a node with a key-value pair
   * 
   * @param key
   * @param value
   */
  public HashNode(K key, V value) {
    this.key = key;
    this.value = value;
  }
}
