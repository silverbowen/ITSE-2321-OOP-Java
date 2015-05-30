/*this program is for ASG01 of ITSE 2321
It creates a world object, populates it with a picture,
creates 2 turtle objects, then moves then around
while manipulating their pens
Author: Silver Bowen*/

import java.awt.Color;

//define Proj01Runner
//visibility = public (can be called from anywhere)
public class Proj01Runner{

  //define reusable variables (allows for easier change later)
  int WIDTH = 395;
  int HEIGHT = 295;
  int RADIUS = 90;
  
  //world will be 394 x 295, as per spec
  //instantiate world and turtle objects
  //private because only used inside this class
  //names mars, joe, sue as per spec
  private World mars = new World(WIDTH,HEIGHT);
  private Turtle joe = new Turtle(mars);
  private Turtle sue = new Turtle(mars);
  
  //this is a constructor
  //it automatically provides the given value
  //when an object of this class is instantiated
  //(in this case, printing my name)
  public Proj01Runner(){
    System.out.println("William Bowen");
  }
  
  //define accessor methods -
  //these are the methods Proj01 main
  //calls to get the text output
  //via overidden toString
  public Turtle getJoe(){return joe;}
  public Turtle getSue(){return sue;}
  public World getMars(){return mars;}
  
  //define run method
  //when called on obj, this makes stuff happen
  public void run(){
    //replace default (white) with required pic
    mars.setPicture(new Picture("Proj01.jpg"));
    mars.getPicture().addMessage("William Bowen",10,20);

    
    //center is 197, 147

    //Manipulate the turtle named joe.
    joe.setName("joe");
      
    joe.setBodyColor(Color.YELLOW);
    joe.setShellColor(Color.RED);
    
    joe.setPenColor(Color.YELLOW);
    joe.setPenWidth(3);
    
    joe.forward(90);
    
    joe.setPenColor(Color.RED);
    joe.setPenWidth(1);
    
    joe.moveTo(191, 57);
    joe.moveTo(190, 58);
    joe.moveTo(183, 58);
               
    for(int ang = 260;ang > 180;ang -= 1){
      double angle = Math.toRadians(ang);
      int x = 197 + (int)(Math.cos(angle)*RADIUS);
      int y = 147 + (int)(Math.sin(angle)*RADIUS);

      joe.moveTo(x,y);
    }
    
    joe.setPenColor(Color.GREEN);
    joe.setPenWidth(3);
    
    for(int ang = 179;ang > 97;ang -= 1){
      double radius = Math.toRadians(ang);
      int x = 197 + (int)(Math.cos(radius)*RADIUS);
      int y = 147 + (int)(Math.sin(radius)*RADIUS);

      joe.moveTo(x,y);
    }
    
    joe.moveTo(197,237);
    joe.turn(90);

    //Manipulate the turtle named sue
    sue.setName("sue");
      
    sue.setPenWidth(2);
    sue.setPenColor(Color.BLUE);
    
    sue.moveTo(237,187);
    sue.setPenDown(false);
    
    sue.moveTo(277,227);
    sue.setPenDown(true);
    
    sue.moveTo(317,267);
  }
}