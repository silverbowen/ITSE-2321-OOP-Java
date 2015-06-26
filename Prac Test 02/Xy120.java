public class Xy120{
  public static void main(
                        String args[]){
    new Worker().doIt();
  }//end main()
}//end class

class Worker{
  void doIt(){
    Base myVar = new A();
    myVar.test();
    System.out.println("");
  }//end doIt()
}// end class Worker

class Base{
}//end class Base

class A extends Base{
  public void test(){
    System.out.print("A ");
  }//end test()
}//end class A 

/* 1 error found:
File: /home/silver/Git/ITSE-2321-OOP-Java/Prac Test 02/Xy120.java  [line: 11]
Error: cannot find symbol
  symbol:   method test()
  location: variable myVar of type Base
  */