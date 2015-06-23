 /* This program is for ASG07 of ITSE 2321
  * It prints Proj07, my first and last name,
  * then a random number twice at the command line.
  * Author: Silver Bowen **/

/* Define Proj07Runner class - it
 * extends Proj07 because it has to override
 * Proj07's getData abstract method. **/
class Proj07Runner extends Proj07 {
  
  /* Define a variable (we need something to hold
   * the random number passed to the constructor). */
  private int holder; 
  
  /* Define constructor, which has to accept
   * one parameter, an int. We are going to
   * go ahead and use that parameter to initialize
   * our holding variable, holder. For once,
   * we aren't using our constructor to print
   * our name. We have to override toString later
   * anyway, so we'll do that there.*/
  public Proj07Runner(int number) {
    
    // Set holder to number.
    holder = number;
    
  } // end constructor
  
  /* We have to define the abstract method getData.
   * This concrete version will override the one
   * in Proj07. If we don't, the program won't work,
   * because the driver calls getData. */
  public int getData() {
    
    /* To match the earlier output number,
     * we need to divide holder by 2. */
    return holder/2;
    
  } // end getData method
 
  /* Now we need to override toString, since
   * Proj07 calls println directly on the
   * reference holding our Proj07Runner object. */
  public String toString() {

    // We'll return everything in one go.
    return "Proj07\nWilliam\nBowen";
  
  } // end toString method

} // end class Proj07Runner
  