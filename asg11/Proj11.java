//34567890123456789012345678901234567890123456789012345678
/*File Proj11 Copyright 2013 R.G.Baldwin
--------------------------------------------------------*/
import java.util.*;

public class Proj11{
  public static void main(String args[]){
    Proj11Runner runner = new Proj11Runner();

    Collection <String> collection = 
                                   runner.getCollection();

    collection.add("Able");
    collection.add("aBle");
    collection.add("Baker");
    collection.add("Charley");
    collection.add("Baker");
    
    Iterator <String> iter = collection.iterator();
    while(iter.hasNext()){
      System.out.print(iter.next() + " ");
    }//end while loop
    System.out.println();
  }//end main()
}//end class Proj11

