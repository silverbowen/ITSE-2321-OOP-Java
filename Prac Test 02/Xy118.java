public class Xy118{
  public static void main(
                        String args[]){
    new Worker().display();
    new Worker(5,true).display();
    System.out.println();
  }//end main()
}//end class

class Worker{
  private int myInt;
  private boolean myBoolean;

  public Worker(int x, boolean y){
    myInt = x;
    myBoolean = y;
  }//end parameterized constructor
 
  public void display(){
    System.out.print(myInt);
    System.out.print(
                " " + myBoolean + " ");
  }//end display()
 
}// end class Worker

/* 1 error found:
File: /home/silver/Git/ITSE-2321-OOP-Java/Prac Test 02/Xy118.java  [line: 4]
Error: constructor Worker in class Worker cannot be applied to given types;
  required: int,boolean
  found: no arguments
  reason: actual and formal argument lists differ in length
  */