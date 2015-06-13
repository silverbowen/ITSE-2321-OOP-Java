public class Xy105{
  public static void main(
                        String args[]){
    System.out.println(Worker.fPi);
  }//end main()
}//end class definition

class Worker{
  public static final float fPi =
                        (float)Math.PI;
}// end class

/* Returns 3.1415927.
 * static means it's only initialized once,
 * it belongs to the class, and all instantiated
 * object share the one variable. No worker is needed
 * to access this variable (ie can use class.variable_name).
 * final means it's only initialized once and
 * cannot later be changed.
 * recasting the double retrieved by Math.PI to a
 * float decreases the precision to 8 digits instead of 16. */