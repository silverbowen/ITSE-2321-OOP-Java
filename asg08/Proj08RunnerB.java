 /* This program is for ASG08 of ITSE 2321
  * It prints Proj08, my first and last name,
  * then a random number twice at the command line.
  * Author: Silver Bowen **/

/* Define Proj08RunnerB class - main purpose is to use
 * the call to getDataFromObj to call getHolder.**/
class Proj08RunnerB {

  /* Define the method getDataFromObj, which
   * is called on a new Proj08RunnerB object
   * in Proj08. The method accepts an Object
   * object (in this case a reference to the
   * random number in holder from ProjRunnerA,
   * stored in the first index of an Object array). */
  public int getDataFromObj(Object objRef) {
  
    // We're going to go ahead and print our name here. 
    System.out.println("Proj08\nWilliam\nBowen");
        
    /* Return the parameter, downcast to a
     * Proj08RunnerA reference (what the 
     * actual object is), with getHolder called
     * on it, divided by three to match later output
     * in Proj08. */

    return ((Proj08RunnerA)objRef).getHolder()/3;
    
  } // end getDataFromObj method

} // End Proj08Runner B Class