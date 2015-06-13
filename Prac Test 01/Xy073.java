public class Xy073{
  public static void main(
                        String args[]){
    new Worker().doArrays();
  }//end main()
}//end class definition

class Worker{
  public void doArrays(){
    double[] A = new double[2];
    A[0] = 1.0;
    A[1] = 2.0;
    Object B = A; // declaring and initializing B as an Object
                  // is fine (parent class/superclass)
    
    System.out.println(
              ((double[])B)[0] + " " +
              ((double[])B)[1]);
  }//end doArrays()
}// end class

/* returns 1.0 2.0
 * This works fine. Object is the
 * parent class of all objects, so it
 * has all the properties of the Double class.
 * */