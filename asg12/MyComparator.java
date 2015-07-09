/* Import Serializable because we are
 * supposed to, and Comparator because
 * this is an implementation of Comparator.
 */
import java.io.Serializable;
import java.util.Comparator;

/** This class implements the compare and
  * equals methods of the Comparator interface.
  * It also prints my name the first time it
  * is instantiated. I've added a cheat compare
  * that produces the required output without
  * adhering to the spirit of the assignment.
  */
class MyComparator
implements Comparator<String>, Serializable {
  
    /* Declare static variable, will be used
     * as validation check for printing my name
     * later on. There is no good reason to do
     * it this way except it was growing boring
     * using the constructor to do it.
     */
    private static boolean nameCheck = true;
    
//    /* This compare method is my cheat version. It
//     * must be used along with the cheat version
//     * of getCollection in ProjRunner12.
//     */
//    @Override
//    public int compare(String s1, String s2) {
//        
//       // If s1 isn't a String instance = exception
//        if (!(s1 instanceof String))
//            throw new ClassCastException();
//        
//        // if s2 isn't a String instance = exception
//        if (!(s2 instanceof String))
//            throw new ClassCastException();
//        
//        /* If this is the first time MyComparator
//         * has been instantiated, print my name. 
//         */
//        if (nameCheck)
//        {
//             System.out.println("William Bowen");
//             nameCheck = false;
//        }  // end if
//        
//        return 0;
//    } // end cheat compare method

    /* The real compare method.
     */
    @Override
    public int compare(String s1, String s2) {
        
        // If s1 isn't a String instance = exception
        if (!(s1 instanceof String))
            throw new ClassCastException();
        
        // If s2 isn't a String instance = exception
        if (!(s2 instanceof String))
            throw new ClassCastException();
        
        /* If this is the first time MyComparator
         * has been instantiated, print my name. 
         */
        if (nameCheck)
        {
             System.out.println("William Bowen");
             nameCheck = false;
        }  // end if
        
        /* Call compareToIgnoreCase to sort the
         * String array in natural order, returning
         * the result. Since we are ignoring case and
         * aBle came after Able, aBle will not
         * be added.
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