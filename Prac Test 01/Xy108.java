public class Xy108{
  public static void main(
                        String args[]){
    Worker.staticMethod();
  }//end main()
}//end class Ap108

class Worker{
  private int x = 5;
  public static void staticMethod(){
    System.out.println(
                  new Worker().getX());
  }//end staticMethod()
   
  public int getX(){
    return x;
  }//end getX()
   
}// end class

/* Works fine. Output is '5'.
 * getX is a method of class Worker,
 * Worker knows private int x, so
 * getX can use it just fine.
 * */