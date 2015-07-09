/* Import Java.io.Serializable and
 * Java.util.* for stuff.
 */
import java.io.Serializable;
import java.util.*;

/** Define Proj11Runner class. It returns a 
  * treeSet of Strings when getCollection is 
  * called. This treeSet does everything needed
  * to produce the required output.
  */
class Proj11Runner {
    
  
    // Constructor, prints name. No other good
    // place to do this in this program.
    Proj11Runner() {
        System.out.println("William Bowen");
    }

    /* Getter method, returns a treeSeet. Unlike last 
     * time, we are using a set, which doesn't allow
     * multiple elements, but does automatically sort
     * the added elements. */
    Collection<String> getCollection() {
        return new TreeSet<String>();
    } //end getCollection method
    
} // end Proj11Runner Class