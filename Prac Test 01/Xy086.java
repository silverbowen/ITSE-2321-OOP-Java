public class Xy086{
  public static void main(
                        String args[]){
    new Worker().doOverLoad();
  }//end main()
}//end class definition

class Worker{
  public void doOverLoad(){
    Test a = new Test();
    Object b = new Test();
    overLoadMthd(a);
    overLoadMthd(b);
    System.out.println();
  }//end doOverLoad()
   
  public void overLoadMthd(Test x){
    System.out.print("Test ");
  }//end overLoadMthd
 
  public void overLoadMthd(Object x){
    System.out.print("Object ");
  }//end overLoadMthd

}// end class

class Test{
}//end class Test

/* returns Test Object
 * Works fine because Test is an extension
 *  of Objects, as are all objects. So any
 * instantiation of test can be declared as
 * type Test or type Object.
 * */