public class Xy104{
  public static void main(
                        String args[]){
    new Worker().finalStuff();
  }//end main()
}//end class definition

class Worker{
  void finalStuff(){
    final int x = 5;
    System.out.println(x);
  }//end finalStuff()
}// end class

/* Works fine. returns 5.  Final just means the 
 * variable is a constant and cannot be changed.
 * */