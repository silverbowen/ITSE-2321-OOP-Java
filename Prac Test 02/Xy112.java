public class Xy112{
  public static void main(
                        String args[]){
    Worker obj1 = new Worker(11);
    Worker obj2 = new Worker(22);
    Worker obj3 = new Worker(33);
    Worker obj4 = new Worker(44);
    obj2.doThis();
  }//end main()
}//end class

class Worker{
  private int data;
 
  public Worker(int data){
    this.data = data;
  }//end constructor
 
  public void doThis(){
    System.out.println(this);
  }//end area()
    
  public String toString(){
    return "" + data;
  }//end toString()
}// end class Worker

/* > run Xy112
22
> 
*/