public class Xy093{
  public static void main(
                        String args[]){
    new Worker().makeObj(); // error, must pass an int argument
  }//end main()
}//end class definition

class Worker{
  public void makeObj(){
    NewClass obj = new NewClass();
    System.out.println(obj);
  }//end makeObj()
}// end class

class NewClass{
  private int x = 2;
 
  public NewClass(int x){ // requires int argument
    this.x = x;
  }//end constructor
 
  public String toString(){
    return "Object containing " + x;
  }//end toString()
}//end NewClass

  /* This does not compile, because the only
   * available constructor for NewClass
   * requires an argument that is an integer.
   * Had the constructor notbeen included
   * in the class, an implicit super() would
   * have been added at compile time.
   * */