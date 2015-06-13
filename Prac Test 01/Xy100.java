public class Xy100{
  public static void main(
                        String args[]){
    new Worker().makeObj();
  }//end main()
}//end class definition

class Worker{
  public void makeObj(){
    Subclass obj = new Subclass();
    System.out.println(obj.getX() +
                    ", " + obj.getY());
  }//end makeObj()
}// end class

class Superclass{
  private int x = 1;
   
  public Superclass(){
    x = 5;
  }//end constructor
 
  public int getX(){
    return x;
  }//end getX()
}//end Superclass

class Subclass extends Superclass{
  private int y = 2;
 
  public Subclass(){
    super();     // this call is explicit here, but would
    y = 10;      // be inserted implicitly if it wasn't
  }//end constructor
 
  public int getY(){
    return y;
  }//end getY()
}//end Subclass

/* returns '5, 10'.
 * super() invokes the super class constructor.
 * initial private values of x and y are change by 
 * constructor code. super() must come first!
 * */