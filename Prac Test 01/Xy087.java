public class Xy087{
  public static void main(
                        String args[]){
    new Worker().doOverLoad();
  }//end main()
}//end class definition

class Worker{
  public void doOverLoad(){
    SubC a = new SubC(); // declared type is SubC
    SuperC b = new SubC();  // type is SuperC, class is SubC

    SubC obj = new SubC(); // needed because overloaded methods
    obj.overLoadMthd(a);   // are instance merhods and must have
    obj.overLoadMthd(b);   // an object to be invoked on

    System.out.println();
  }//end doOverLoad()

}// end class

class SuperC{
  public void overLoadMthd(SuperC x){
    System.out.print("SuperC ");
  }//end overLoadMthd
}//end SuperC

class SubC extends SuperC{
  public void overLoadMthd(SubC x){
    System.out.print("SubC ");
  }//end overLoadMthd
}//end class SubC

/* returns sub c super c
 * This works fine because class SubC
 * extends class SuperC, which means an object
 * instantiated from clas SubC can be treated
 * as type SubC or SuperC (or Object).
 * */