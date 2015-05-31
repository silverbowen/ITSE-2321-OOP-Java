/* this program is for ASG01 of ITSE 2321
 * It creates a world object, populates it with a picture,
 * creates 2 turtle objects, then moves them around
 * while manipulating their pens.
 * Author: Silver Bowen */

/* First, we import the Color class from the libraries.
 * This let's us type BLUE instead of having to specify
 * exact values for a particular color. */
import java.awt.Color;

/* define Proj01Runner, the class driven by Proj01
 * the visibility is public (can be called from anywhere)
 * this is the only class in this file. */
public class Proj01Runner{

  /* Here we define some variables (for easier changes later)
   * WIDTH an HEIGHT are used for the world, which will be
   * 394 x 295, as per spec. They are also used for joe's semicircle
   * calculations as is RADIUS. */
  int WIDTH = 394;
  int HEIGHT = 295;
  int RADIUS = 90;
  
  /* This is were we instantiate a world and populate
   * it with two turtle objects. All this is private
   * because it's only called inside this class. The
   * world is of type World, the turtles of type Turtle.
   * The references to these objects mars, joe, sue.*/
  private World mars = new World(WIDTH,HEIGHT);
  private Turtle joe = new Turtle(mars);
  private Turtle sue = new Turtle(mars);
  
  /* Here we define the constructor for this
   * class. Superfluous code causes it to
   * automatically print my name when an
   * object of this class is instantiated.*/
  public Proj01Runner(){
    System.out.println("William Bowen");
  }
  
  /* Here we define accessor methods -
   * when Proj01 main() calls these they
   * return text output about the listed objects
   * via overiding the toString method. */
  public Turtle getJoe(){return joe;}
  public Turtle getSue(){return sue;}
  public World getMars(){return mars;}
  
  /* Here we define the run method. When called
   * on the obj object (the driver class does
   * this), run makes all the 'stuff' happen.
   * It's public, and listed as void because it
   * doesn't return any values.*/
  public void run(){ 
    /* The setPicture method replaces the default
     * world picture (white) with required pic.*/
    mars.setPicture(new Picture("Proj01.jpg"));
    /* The addMessage method inserts my name
     * into the world picture at the listed coordinates. */
    mars.getPicture().addMessage("William Bowen",10,20);

    /* This code manipulates the Turtle joe's characteristics. */
    /* The setName method gives joe a name ('joe'). */
    joe.setName("joe");
      
    /* The setBodyColor method set's joe's body color. */
    joe.setBodyColor(Color.YELLOW);
    /* The setShellColor method set's joe's shell color. */
    joe.setShellColor(Color.RED);
    
    /* The setPenColor method set's joe's pen color. */
    joe.setPenColor(Color.YELLOW);
    /* The setPenWidth method set's joe's pen width. */
    joe.setPenWidth(3);
    
    /* The forward method moves joe forward the listed
     * number of pixels. */
    joe.forward(90);
        
    joe.setPenColor(Color.RED);
    joe.setPenWidth(1);
    
    /* This joe move is needed to make the pen trail
     * conform to that of the required image. */
    joe.moveTo(183, 58);
    
    /* This block of code is a for loop that
     * moves joe in a quarter-circle. Normally
     * it would start at 270, but to match the
     * given picture I had to do it differently. */
    for(int ang = 260;ang > 180;ang -= 1){

      /* Math.toRadians converts a given degree angle
       * into a radian. This is fed into math.cos & .sin
       * as part of the formula to derive x and y. */
      double radians = Math.toRadians(ang);
      int x = WIDTH/2 + (int)(Math.cos(radians)*RADIUS);
      int y = HEIGHT/2 + (int)(Math.sin(radians)*RADIUS);

      /* Joe moves to the derived x and y for the given
       * degree, then we go to the top of the loop
       * and do it again (until we iterate ang
       * to the given stopping point. */
       joe.moveTo(x,y);
    }
    
    joe.setPenColor(Color.GREEN);
    joe.setPenWidth(3);
    
    for(int ang = 179;ang > 96;ang -= 1){
      double radians = Math.toRadians(ang);
      int x = WIDTH/2 + (int)(Math.cos(radians)*RADIUS);
      int y = HEIGHT/2 + (int)(Math.sin(radians)*RADIUS);

      joe.moveTo(x,y);
    }
    
    /* Again, this last move is only to conform to the
     * given picture. It would have been simpler just to
     move joe in 2 quarter circles by listing the rad as
     269 to 180, then 179 to 89.*/
    joe.moveTo(197,237);
    joe.turn(90);

    /* Turtle object sue gets a similar treatment
     * to Turtle object joe, only less intensive. */
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