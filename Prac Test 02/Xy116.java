public class Xy116{
  public static void main(
                        String args[]){
    System.out.println(Worker.twoPI);
  }//end main()
}//end class

class Worker{
  public static final double twoPI
                            = 2 * myPI;
  public static final double myPI
                             = Math.PI;
}// end class Worker

/* 1 error found:
File: /home/silver/Git/ITSE-2321-OOP-Java/Prac Test 02/Xy116.java  [line: 10]
Error: illegal forward reference
*/