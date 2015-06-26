public class Xy148{
  public static void main(
                        String args[]){
    new Worker().doIt();
  }//end main()
}//end class

class Worker{
  void doIt(){
    System.out.println(1.0/0);
  }//end doIt()
}// end class Worker

/* > run Xy148
Infinity
> 
*/