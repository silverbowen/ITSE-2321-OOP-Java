//34567890123456789012345678901234567890123456789012345678
/*File Proj06 Copyright 2008 R.G.Baldwin
*********************************************************/
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.Graphics;

public class Proj06{
  //DO NOT MODIFY THE CODE IN THIS CLASS DEFINITION.
  static Picture pic = new Picture("Proj06.jpg");

  public static void main(String[] args){
    Proj06 obj = new Proj06Runner();
    obj.run(45.0);
    pic.explore();
    pic = new Picture("Proj06.jpg");
    obj.run(-45);
    pic.explore();
  }//end main method
  //----------------------------------------------------//
  void run(double hello){
    System.out.println("Hello World");
  }//end run
  //----------------------------------------------------//
  void run(int hello){
    System.out.println("Hello World");
  }//end run
}//end class Proj06
//End program specifications.