public class Xy113{
  public static void main(
                        String args[]){
    System.out.println(
                   new Worker().twoPI);
  }//end main()
}//end class

class Worker{
  public static final double twoPI;
 
  public Worker(){
    twoPI = 2 * Math.PI;
  }//end constructor
}// end class Worker

/* 1 error found:
File: /home/silver/Git/ITSE-2321-OOP-Java/Prac Test 02/Xy113.java  [line: 13]
Error: cannot assign a value to final variable twoPI
*/