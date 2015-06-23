//34567890123456789012345678901234567890123456789012345678

/*File Proj07 Copyright 2013, R.G.Baldwin
*********************************************************/
import java.util.*;

abstract class Proj07{
  //DO NOT MODIFY THE CODE IN THIS CLASS DEFINITION.
  public static void main(String[] args){
    Random generator = new Random(new Date().getTime());
    int randomNumber = (byte)generator.nextInt();

    Proj07 objRef = new Proj07Runner(randomNumber);
    System.out.println(objRef);
    System.out.println(objRef.getData());
    System.out.println(randomNumber/2);
  }//end main

  public abstract int getData();

}//end class Proj07
//End program specifications