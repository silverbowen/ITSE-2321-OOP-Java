//34567890123456789012345678901234567890123456789012345678

/*File Proj08 Copyright 2013, R.G.Baldwin
*********************************************************/
import java.util.*;

class Proj08{
  public static void main(String[] args){

    Random generator = new Random(new Date().getTime());
    int randomNumber = (byte)generator.nextInt();

    Object[] objRef = {new Proj08RunnerA(randomNumber)};
    System.out.println(
          new Proj08RunnerB().getDataFromObj(objRef[0]));
    System.out.println(randomNumber/3);

  }//end main
}//end class Proj08
//End program specifications