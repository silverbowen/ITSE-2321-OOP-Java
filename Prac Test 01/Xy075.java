public class Xy075{
  public static void main(
                        String args[]){
    new Worker().doArrays();
  }//end main()
}//end class definition

class Worker{
  public void doArrays(){
    int[] B = returnArray();
    for(int i = 0; i < B.length;i++){
      System.out.print(B[i] + " ");
    }//end for loop
    System.out.println();
  }//end doArrays()
   
  public int[] returnArray(){
    int[] A = new int[2];
    A[0] = 1;
    A[1] = 2;
    return A;
  }//end returnArray()
}// end class

/* Works fine. Output is '1 2'.
 * Quite straightforward.
 * */