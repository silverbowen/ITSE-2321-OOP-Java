public class Xy074{
  public static void main(
                        String args[]){
    new Worker().doArrays();
  }//end main()
}//end class definition

class Worker{
  public void doArrays(){
    int[] A = new int[2];
    A[0] = 1;
    A[1] = 2;
   
    double[] B = (double[])A; // error, can't recast int[] as double[]
   
    System.out.println(
                    B[0] + " " + B[1]);
  }//end doArrays()
}// end class

/* This doesn't compile, because you cannot convert
 * an int array to a double array and vice versa,
 * although you can convert a number inside those arrays, eg:
 * int[2] A = {1, 2};
 * (double) A[1]; //this is fine
 * */