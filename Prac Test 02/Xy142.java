public class Xy142{
  public static void main(
                        String args[]){
    new Worker().doIt();
  }//end main()
}//end class

class Worker{
  void doIt(){
    char[] anArray = {'J','o','e'};
    String Str1 = new String(anArray);
    String Str2 = new String(anArray);

    System.out.println(
              Str1 + " " + Str2 + " " +
              Str1.equals(Str2));
  }//end doIt()
}// end class Worker

/* > run Xy142
Joe Joe true
> 
/