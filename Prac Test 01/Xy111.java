public class Xy111{
  public static void main(
                        String args[]){
        new Worker().doThis();
  }//end main()
}//end class Ap111

class Worker{
  private int data = 33;
 
  public void doThis(){
    new Helper().helpMe(this);
  }//end area()
   
  public String getData(){
    return "" + data;
  }//end getData()
}// end class Worker

class Helper{
  public void helpMe(Worker param){
    System.out.println(
                      param.getData());
  }//end helpMe()
}//end class Helper