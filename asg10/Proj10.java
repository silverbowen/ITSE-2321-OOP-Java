//34567890123456789012345678901234567890123456789012345678
/*File Proj10 Copyright 2013 R.G.Baldwin
--------------------------------------------------------*/
import java.util.*;

public class Proj10{
  public static void main(String args[]){
    Proj10Runner runner = new Proj10Runner();

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

    runner.sortReverse(collection);
    iter = collection.iterator();
    while(iter.hasNext()){
      System.out.print(iter.next() + " ");
    }//end while loop
    System.out.println();
  }//end main()
}//end class Proj10

