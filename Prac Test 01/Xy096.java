public class Xy096{
  public static void main(
                        String args[]){
    new Worker().makeObj();
  }//end main()
}//end class definition

class Worker{
  public void makeObj(){
    NewClass obj = new NewClass();
    System.out.println(obj);  // calls toString on the object
  }//end makeObj()
}// end class

class NewClass{
  private int x;
  private double y;
  private boolean z;
 
  public String toString(){   // this overides the parent class
    return "Object containing " + // version of toString
                          x + ", " +
                          y + ", " + z;
  }//end toString()
}//end NewClass

/* This works fine. The overidden toString
 * prints out the default values of int,
 * double, and boolean types (0, 0.0, and false)
 * because they have been declared but not
 * initialized.
 * */