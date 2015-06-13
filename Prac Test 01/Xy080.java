public class Xy080{
  public static void main(
                        String args[]){
    new Worker().doOverLoad();
  }//end main()
}//end class definition

class Worker{
  public void doOverLoad(){
    int x = 3;      // even though x is an int, Java will
    double y = 4.2;  // implicitly recast it to a float or double
                     // (in this case a float)

    System.out.print(square(x) + " ");
    System.out.print(square(y));
    System.out.println();
  }//end doOverLoad()
   
  public float square(float y){
    System.out.print("float ");
    return y*y;
  }//end square()
   
  public double square(double y){
    System.out.print("double ");
    return y*y;
  }//end square()
}// end class

/* This works fine, because Java can implicitely
 * convert int (or floats) to doubles.
 * But not doubles to ints or floats!
 * */