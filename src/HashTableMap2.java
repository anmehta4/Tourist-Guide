// --== CS400 File Header Information ==--
// Name: Arnav Mehta
// Email: anmehta4@wisc.edu email address
// Team: LC
// TA: Divyanshu Saxena
// Lecturer: Gary Dahl
// Notes to Grader: None

import java.util.NoSuchElementException;

/**
 * 
 * @author Arnav - Create a HashTableMap using MapADT interface and all the relevant methods
 *
 * @param <K> - Type of Key object for the Key-Value Pair
 * @param <V> - Type of Value object for the Key-Value Pair
 */
public class HashTableMap2<K, V> implements MapADT<K, V> {

  private HashNode<K, V> values[];
  private int size;

  /**
   * Default Constructor creating a HashMap with capacity 10
   */
  @SuppressWarnings("unchecked")
  public HashTableMap2() {
    values = new HashNode[10]; // creating an array with capacity 10
    size = 0;
  }

  /**
   * Constructor creating a HashMap with capacity given as parameter
   * 
   * @param capacity
   */
  @SuppressWarnings("unchecked")
  public HashTableMap2(int capacity) {
    values = new HashNode[capacity]; // creating an array with capacity provided by parameter
    size = 0;
  }

  /**
   * Rehashing the HashMap when Load Factor of 0.8 is reached
   */
  @SuppressWarnings("unchecked")
  public void rehash() {
    if (((1.0 * this.size) / this.values.length >= 0.8)) { // checks if the LoadFactor >= 0.8
      HashNode<K, V> temp[] = values;
      this.values = new HashNode[values.length * 2]; // doubling the array size
      this.size = 0;

      for (int i = 0; i < temp.length; i++) {// adding previous key-value pairs to the new array
        if (temp[i] != null) { // adding all non-null key-value pairs
          HashNode<K, V> node = temp[i];
          while (node != null) {
            this.put(node.key, node.value);
            node = node.next;
          } // using the put method to add them to the Hash Map
        }
      }
    }
  }

  /**
   * Adds the Key-Value pair to the HashMap
   * 
   * @param K key - key of the key-value pair
   * @param V value - value of the key-value pair
   * @return true if successfully added else false
   * 
   */
  @Override
  public boolean put(K key, V value) {
    // TODO Auto-generated method stub
    int index = Math.abs(key.hashCode() % values.length); // find the index to add the key-value
                                                          // pair
    HashNode<K, V> temp = values[index]; // storing the key-value pair at this index in temp
    HashNode<K, V> node = new HashNode<K, V>(key, value);// creating new node of the key-value pair
                                                         // to be added in the Hash Map

    if (temp == null) { // if temp is null
      values[index] = node; // adding new node to the array
      this.size++; // increment size
      this.rehash(); // call rehash() after every addition
      return true;

    }
    while (temp.next != null) {// if there are already key-value pairs run through the list and
                               // checks if a key-value pair of the same key exists
      if (temp.key.equals(node.key))
        return false; // if an identical key is found you return false
      temp = temp.next;
    }

    if (temp.key.equals(key)) // checks if the last key has the same key as the while loop checks
                              // until the 2nd last node
      return false;

    temp.next = node; // add the node to this list
    this.size = this.size + 1; // increment the size
    this.rehash(); // call rehash on every addition of the node
    return true;
  }

  /**
   * Get the value of a key
   * 
   * @param key - key of the key-value pair
   * @return value - value of the corresponding key if found
   * @throws NoSuchElementException if key is not found
   */
  @Override
  public V get(K key) throws NoSuchElementException {
    // TODO Auto-generated method stub
    int index = Math.abs(key.hashCode() % values.length); // find the index to add the key-value
                                                          // pair
    HashNode<K, V> temp = values[index]; // storing the key-value pair at this index in temp

    while (temp != null) { // iterate through the entire linked list to find the key-value pair
      if (temp.key.equals(key)) // if the keys are equal
        return temp.value; // return the value of the key-value pair
      temp = temp.next;
    }
    throw new NoSuchElementException("This key does not exist!");// if not found throw the Exception
  }

  /**
   * Checks if the key is in the Hash Map
   * 
   * @param K key - key of the key-value pair
   * @return true if successfully found else false
   * 
   */
  @Override
  public boolean containsKey(K key) {
    // TODO Auto-generated method stub
    int index = Math.abs(key.hashCode() % values.length); // find the index to add the key-value
                                                          // pair
    HashNode<K, V> temp = values[index]; // storing the key-value pair at this index in temp

    while (temp != null) { // iterate through the entire linked list to find the key-value pair
      if (temp.key.equals(key)) // if the keys are equal
        return true; // the key-value pair exists and return true

      temp = temp.next;
    }
    return false;
  }

  /**
   * Removes the Key-Value pair to the HashMap
   * 
   * @param K key - key of the key-value pair
   * @param V value - value of the key-value pair
   * @return returns V of the key-value pair deleted if found, else null
   * 
   */
  @Override
  public V remove(K key) {
    // TODO Auto-generated method stub
    int index = Math.abs(key.hashCode() % values.length); // find the index to add the key-value
                                                          // pair
    HashNode<K, V> temp = values[index]; // storing the key-value pair at this index in temp
    HashNode<K, V> deleted = null; // storing the deleted node

    if (temp == null) // if list is empty there is node to remove and so return null
      return null;

    if (temp.key.equals(key)) { // if the first node in the list is to be removed
      deleted = temp; // store it in deleted
      values[index] = temp.next; // store the next node as the head of the list
      this.size = this.size - 1; // decrement the size
    }

    while (temp.next != null) { // iterate through the list
      if (temp.next.key.equals(key)) { // find the node whose next node has the same key
        deleted = temp.next; // store the next node in deleted
        temp.next = temp.next.next; // setting the next node of current node to the next node of
                                    // deleted node
        this.size = this.size - 1; // decrement the size by 1
      }
      temp = temp.next;
    }

    if (deleted != null) // if not null
      return deleted.value; // return the value
    else
      return null; // return null
  }

  /**
   * To return the size of the Hash Map
   * 
   * @return size of the HashMap
   * 
   */
  @Override
  public int size() {
    // TODO Auto-generated method stub
    return this.size;
  }


  /**
   * To return the capacity of the Hash Map
   * 
   * @return capacity of the HashMap
   * 
   */
  public int capacity() {
    // TODO Auto-generated method stub
    return this.values.length;
  }


  /**
   * To clear the entire HashMap
   */
  @Override
  public void clear() {
    // TODO Auto-generated method stub
    for (int i = 0; i < values.length; i++) // making all values in the array null
      values[i] = null;
    this.size = 0; // making the size 0
  }

}
