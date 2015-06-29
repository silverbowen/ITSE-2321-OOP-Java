import java.util.*;

/** Define Proj09Runner class. It's only
 *  purpose is instantiating an ArrayList Collection.
 */

class Proj09Runner {
  
  /* Define constructor, which we're using
   * once again to print our name.*/
  public Proj09Runner() {
    
    System.out.println("William Bowen");
    
  } // end constructor
  
  /* Define getCollection. getCollection is 
   * called on runner (object of Proj09Runner)
   * in Proj09 main. collection (reference of
   * type Collection<string>) holds the result.
   * I didn't like the error messages, so I read
   * up on generics (enough to not get errors this
   * time, anyway) and implemented them. */
  Collection<String> getCollection() {
    
    /* Get an ArrayList<String>. We are using
     * a list rather than a set because we don't
     * want to reorder the items added later in main.
     * In particular, an ArrayList maintains it's elements
     * in the order added (like, you know, an array). */
    ArrayList<String> aList = new ArrayList<>();
    
    // return aList.
    return aList;
    
  } // end getCollection method
 
} // end class Proj09Runner Class