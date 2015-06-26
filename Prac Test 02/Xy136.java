public class Xy136{
  public static void main(
                        String args[]){
    new Worker().doIt();
  }//end main()
}//end class

class Worker{
  void doIt(){
    Object[] myArray = new Object[2];
    myArray[0] = new A();
    myArray[1] = new B();
    
    for(int i=0;i<myArray.length;i++){
      myArray[i].intfcMethodX();
    }//end for loop

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
    
  public void intfcMethodX(){
    System.out.print(
                    "A-intfcMethodX ");
  }//end intfcMethodX()
}//end class A

class B extends Base implements X{
  public void inherMethod(){
    System.out.print(
                    " B-inherMethod ");
  }//end inherMethod()
    
  public void intfcMethodX(){
    System.out.print(
                    "B-intfcMethodX ");
  }//end intfcMethodX()
}//end class B

interface X{
  public void intfcMethodX();
}//end X 

/* 1 error found:
File: /home/silver/Git/ITSE-2321-OOP-Java/Prac Test 02/Xy136.java  [line: 15]
Error: cannot find symbol
  symbol:   method intfcMethodX()
  location: class java.lang.Object
  */