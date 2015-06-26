 /* This program is for ASG08 of ITSE 2321
  * It prints Proj08, my first and last name,
  * then a random number twice at the command line.
  * Author: Silver Bowen **/

/* Define Proj08RunnerA class - it doesn't
 * extend anything this time, however (except 
 * Object, which is implicit). It's only real
 * purpose is holding the random number. **/
class Proj08RunnerA {
  
  /* Define a variable (we need something to hold
   * the random number passed to the constructor). */
  private int holder;
  
  /* Define constructor, which has to accept
   * one parameter, an int. We are going to
   * go ahead and use that parameter to initialize
   * our holding variable, holder. For once,
   * we aren't using our constructor to print
   * our name. That happens in ProjRunner08B.*/
  public Proj08RunnerA(int number) {
    
    // Set holder to number.
    holder = number;
    
  } // end constructor
  
  /* Define getHolder. This will be called
   * later by Proj08RunnerB to get the value
   * sent to holder by Proj08. */
  public int getHolder() {
    
    // return holder.
    return holder;
    
  } // end getData method
 
} // end class Proj08RunnerA Class