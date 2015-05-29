/*this program is for ASG01 of ITSE 2321
It creates a world object, populates it with a picture,
creates 2 turtle objects, then moves then around
while manipulating their pens
Author: Silver Bowen*/

//34567890123456789012345678901234567890123456789012345678
/*File Proj01 Copyright 2010 R.G.Baldwin
*********************************************************/
import java.awt.Color;

public class Proj01{
  //DO NOT MODIFY THE CODE IN THIS CLASS DEFINITION.
  public static void main(String[] args){
    Proj01Runner obj = new Proj01Runner();
    obj.run();

    System.out.println(obj.getMars());
    System.out.println(obj.getJoe());
    System.out.println(obj.getSue());
  }//end main
}//end class Proj01
//End program specifications.
//////////////////////////////////////////////////////////
//////////////////////////////////////////////////////////

//define Proj01Runner
//visibility = public (can be called from anywhere)
class Proj01Runner{
  //instantiate world and turtle objects
  //private because only used inside this class
  //names mars, joe, sue as per spec
  private World mars = new World(394,295);
  //world is 394 x 295, as per spec
  private Turtle joe = new Turtle(mars);
  private Turtle sue = new Turtle(mars);
  
  //this is a constructor
  //it automatically provides the given value
  //when an object of this class is instantiated
  //in this case, printing my name
  public Proj01Runner(){
    System.out.println("William Bowen");
  }
  
  //define accessor methods -
  //these are the methods Proj01 main
  //calls to get the text output
  public Turtle getJoe(){return joe;}
  public Turtle getSue(){return sue;}
  public World getMars(){return mars;}
  
  //define run method
  //when called on obj, this makes stuff happen
  public void run(){
    //replace default (white) with required pic
    mars.setPicture(new Picture("Proj01.jpg"));
    mars.getPicture().addMessage("William Bowen",10,20);
    
    //Manipulate the turtle named joe.
    joe.setName("joe");
    joe.setBodyColor(Color.RED);
    joe.setShellColor(Color.BLUE);
    joe.setPenColor(Color.YELLOW);
    joe.setPenWidth(3);
    joe.turn(180);
    joe.forward();
    joe.turn(-135);
    joe.setPenColor(Color.BLUE);
    joe.forward(150);

    //Manipulate the turtle named sue
    sue.setName("sue");
    sue.setPenWidth(5);
    sue.setPenColor(Color.RED);
    sue.moveTo(300-183,274-170);
    sue.setPenDown(false);
    sue.moveTo(300-216,274-203);
    sue.setPenDown(true);
    sue.moveTo(300-250,274-237);
  }
}