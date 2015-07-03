/* Import Java.io.* for Serializable and
 * Java.util.* for a ton of stuff.
 */
import java.io.*;
import java.util.*;

/** Define Proj10Runner class. It returns our 
  * arrayListof Strings and implements
  * reverseOrder (called in main).
  */
class Proj10Runner {
    
  
    // Constructor, prints name. No other good
    // place to do this in this program.
    Proj10Runner() {
        System.out.println("William Bowen");
    }

    /* Getter method, returns an arrayList. Like last 
     * time, we need a list so we can include
     * multiple elements (rather than a set). */
    Collection<String> getCollection() {
        return new ArrayList<String>();
    }
    
    /** The cheap way to do the assignment is commented
      * out below. This version of sortReverse returns
      * the correct output, and doesn't even require
      * a Comparator class. Seems unsporting, however.
      */
    
//    void sortReverse(Collection<String> c) {

//    collection.remove("Able");
//    collection.remove("Baker");
//    collection.remove("aBle");
//    collection.remove("Charley");
//    collection.remove("Baker");
//    
//    collection.add("Able");
//    collection.add("aBle");
//    collection.add("Baker");
//    collection.add("Baker");
//    collection.add("Charley");
    
//    } // end unsporting sortReverse method

    /* sortReverse is called in main, and must return
     * a list sorted as in the fake sortReverse commented
     * out above. Surprisingly, this has nothing to do
     with sorting the list in reverse order.
     */
    void sortReverse(Collection<String> c) {
    
        /* Here we are calling the sort method of Collections,
         * using the arguments of our String array and the
         * Comparator we define in a separate file.
         */
      Collections.sort((List<String>)c, new MyComparator());
        
    } // end sortReverse method
    
} // end Proj10Runner Class