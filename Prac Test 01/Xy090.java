public class Xy090{
  public static void main(
                        String args[]){
    new Worker().makeObj();
  }//end main()
}//end class definition

class Worker{
  public void makeObj(){
    NewClass obj = NewClass(); // this call to the NewClass constructor
    System.out.println(obj);   // will fail because it lakes the word new

  }//end makeObj()
  

}// end class

class NewClass{
  public NewClass(){};
  public String toString(){
    return "An Object";
  }//end toString()
}//end NewClass

/* This doesn't compile, because the syntax
 * for creating a new object requires the keyword
 * new. EG: Class_name object_name = new Constructor_call
 * NewClass obj = new NewClass();