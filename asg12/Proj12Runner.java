/* Import Java.io.Serializable and
 * Java.util.* for stuff.
 */
import java.io.Serializable;
import java.util.*;

/** Define Proj12Runner class. It returns a 
  * treeSet of Strings when getCollection is 
  * called. This tine we are using a custom 
  * Comparator class to get the correct output.
  * I've also added a cheat getCollection
  * that produces the required output without
  * adhering to the spirit of the assignment.
  */
class Proj12Runner {
    
    // No constructor (not needed)
  
  
//    /* Cheat getter method, must be used in tandem
//     * w/ the cheat compare in MyComparator. It 
//     * returns a treeSeet w/ one value added (a string
//     * that produces the correct output). Because the
//     * cheat Comparator always returns zero, only the
//     * first attempt to add to the set goes through.
//     */
//    Collection<String> getCollection() {
//        Collection<String> c = new TreeSet<String>((Comparator<String>) new MyComparator());
//        c.add("Able Baker Charley");
//        return c;
//    } //end cheat getCollection method

    /* Real getter method, returns a treeSeet. As a
     * set, it doesn't allow duplicate elements, but
     * does automatically sort the added elements. 
     * MyComparator compares every element ignoring
     * case, thus eliminating duplicates of
     * added elements even if the case is different. 
     */
    Collection<String> getCollection() {
        return new TreeSet<String>((Comparator<String>) new MyComparator());
    } //end getCollection method
    
} // end Proj12Runner Class