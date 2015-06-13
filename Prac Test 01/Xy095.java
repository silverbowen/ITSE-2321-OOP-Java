public class Xy095{
  public static void main(
                        String args[]){
    new Worker().makeObj();
  }//end main()
}//end class definition

class Worker{
  public void makeObj(){
    NewClass obj = new NewClass(5);
    System.out.println(obj);
  }//end makeObj()
}// end class

class NewClass{
  private int x = 2;
 
  public NewClass(){  // not used
  }//end constructor
 
  public NewClass(int x){ // used
    this.x = x;
  }//end constructor
 
  public String toString(){
    return "Object containing " + x;
  }//end toString()
}//end NewClass

/* Works fine. Returns 'Object containing 5'.
 * This has overloaded constructors.
 * The one that accepts an int is
 * used here. It also overides Object's
 * toString.
 * */