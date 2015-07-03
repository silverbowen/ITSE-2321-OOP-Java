/* Import Serializable because we are
 * supposed to, and Comparator because
 * this is an implementation of Comparator.
 */
import java.io.Serializable;
import java.util.Comparator;

/** Thgis class implements the compare
  * and equals methods of the Comparator
  * interface.
  */
class MyComparator
implements Comparator<String>, Serializable {

    /* The compare method. Note the @Override flag.
     * Consensus online seems to be that using this
     * notation saves significant bug-fixing
     * problems at compile time, so I'm using it.
     */
    @Override
    public int compare(String s1, String s2) {
        
       // If s1 isn't a String instance = exception
        if (!(s1 instanceof String))
            throw new ClassCastException();
        
        // if s2 isn't a String instance = exception
        if (!(s2 instanceof String))
            throw new ClassCastException();
        
        /* Call compareToIgnoreCase to sort the
         * String array in natural order, returning
         * the result. Note that aBle still comes
         * after Able, since we are ignoring case and
         * aBle was added after Able.
         */
        return (s1).compareToIgnoreCase(s2);
        
    } // End overridden Compare method
    
    // The equals method, again w/ @Override.
    @Override
    public boolean equals(Object o) {
        
        // Set bool;
        boolean bool = false;
        
        // If o is an instance ofMyComparator, return true.
        if (o instanceof MyComparator)
            bool = true;
        
        // Otherwise return false.
        return bool;
        
    } // End overriden equals
    
} // end MyComparator Class