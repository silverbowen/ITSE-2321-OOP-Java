public class Xy144{
  public static void main(
                        String args[]){
    new Worker().doIt();
  }//end main()
}//end class

class Worker{
  void doIt(){
    ArrayList ref =
            new ArrayList(1);
    ref.add("ABC ");
    ref.add("DEF ");
    ref.add("GHI");
    
    System.out.println(
                   (String)ref.get(0) +
                   (String)ref.get(1) +
                   (String)ref.get(2));
  }//end doIt()
}// end class Worker

/* 2 errors found:
File: /home/silver/Git/ITSE-2321-OOP-Java/Prac Test 02/Xy144.java  [line: 10]
Error: cannot find symbol
  symbol:   class ArrayList
  location: class Worker
File: /home/silver/Git/ITSE-2321-OOP-Java/Prac Test 02/Xy144.java  [line: 11]
Error: cannot find symbol
  symbol:   class ArrayList
  location: class Worker
*/