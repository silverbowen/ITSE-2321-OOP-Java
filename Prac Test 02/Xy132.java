public class Xy132{
  public static void main(
                        String args[]){
    new Worker().doIt();
  }//end main()
}//end class

class Worker{
  void doIt(){
    Base myVar1 = new Base();
    myVar1.inherMethod();
    Base myVar2 = new A();
    myVar2.intfcMethod();

    System.out.println("");
  }//end doIt()
}// end class Worker

class Base{
  public void inherMethod(){
    System.out.print("Base ");
  }//end inherMethod()
}//end class Base

class A extends Base implements X{
  public void inherMethod(){
    System.out.print(
                    " A-inherMethod ");
  }//end inherMethod()
    
  public void intfcMethod(){
    System.out.print("A-intfcMethod ");
  }//end intfcMethod()
}//end class A

interface X{
  public void intfcMethod();
}//end X

/* 1 error found:
File: /home/silver/Git/ITSE-2321-OOP-Java/Prac Test 02/Xy132.java  [line: 13]
Error: cannot find symbol
  symbol:   method intfcMethod()
  location: variable myVar2 of type Base
*/