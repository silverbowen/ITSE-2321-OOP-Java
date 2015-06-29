//34567890123456789012345678901234567890123456789012345678
/*File Proj09 Copyright 2008 R.G.Baldwin
--------------------------------------------------------*/
import java.util.*;

public class Proj09{
  public static void main(String args[]){
    Proj09Runner runner = new Proj09Runner();

    Collection <String> collection = 
                                   runner.getCollection();

    collection.add("Able");
    collection.add("Baker");
    collection.add("aBle");
    collection.add("Charley");
    collection.add("Baker");
    
    Iterator <String> iter = collection.iterator();
    while(iter.hasNext()){
      System.out.print(iter.next() + " ");
    }//end while loop
    System.out.println();

  }//end main()
}//end class Proj09

