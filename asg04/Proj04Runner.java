 /* This program is for ASG04 of ITSE 2321
 * It mirrors the top left quadrant of an
 * image into the top right quadrant,
 * then mirrors the top half onto the bottom,
 * while altering the color to negative, then
 * opens the object in Picture Explorer.
 * Author: Silver Bowen */

// Define Proj04Runner class
class Proj04Runner {
  
  /* Instantiate new Picture object workPic.
   * Here the argument is the supplied Proj04 jpeg. */
  private Picture workPic = new Picture("Proj04.jpg");
  
  /* Define the constructor, as in proj01
   * using extraneous code to insert my name
   * into the command line output */
  public Proj04Runner() {
    System.out.println("William Bowen");
  }
  
  /* Define a public accessor method,
   * which will allow code outside of
   * instantiated objects to access them. */
  public Picture getPicture() {
    return workPic;
  }
  
  /* Define the run() method, which is called
   * by the driver and is the part of this code
   * that 'makes stuff happen'. */
  public Picture run(){
    // This inserts my name into the pic.
    workPic.addMessage("William Bowen", 10, 20);
    
    // Declare variables
    Pixel refPix, quadURPix,
          quadBLPix, quadBRPix = null; // my working pixels
    int green, blue, red = 0; // where we'll store the original values
    int width = workPic.getWidth(); // the width of the workPic
    int height = workPic.getHeight(); // the height of the workPic
        
    /* This nested for loop goes through the UL quadrant pixel
     * by pixel and gets each BGR value, then writes it to the 
     * other 3 quadrants - in order = RU, lB, rB. */
    for(int x = 0; x <  width/2; x++) { // pick an x
      
      for(int y = 0; y < height/2; y++) { // for each x, pick a y
        
        refPix    = workPic.getPixel(x, y); // set refPix to width, height
        quadURPix = workPic.getPixel(width-1-x, y); // set to width-x,y
        quadBLPix = workPic.getPixel(x, height-1-y); // set to x,height-y
        quadBRPix = workPic.getPixel(width-1-x, height-1-y); // width-x,height-y
        
        green = refPix.getGreen(); // set green to current Green
        blue = refPix.getBlue();   // set blue to current Blue
        red = refPix.getRed();      // set red to current Red
        
        /* This all could also be done by:
         * quadURPix.setColor(refPix.getColor());
         * or even:
         * workpic.getPixel(width-1-x, y).setColor(
         *   workPick.getPixel(x,y).getColor()); 
         * The inversions would still require
         * getting rgb individually, though (I think).*/
        
        // mirror refPix onto QuadURPix
        quadURPix.setGreen(green);
        quadURPix.setBlue(blue);
        quadURPix.setRed(red);
        
        // mirror & negative refPix onto QuadBLPix        
        quadBLPix.setGreen(255-green);
        quadBLPix.setBlue(255-blue);
        quadBLPix.setRed(255-red);
       
        // double-mirror & negative refPix onto QuadBRPix
        quadBRPix.setGreen(255-green);
        quadBRPix.setBlue(255-blue);
        quadBRPix.setRed(255-red);
        
      } // end inner for
    } // end outer for
    
    // Display modified JPEG.
    workPic.explore();
    
    // return Picture
    return workPic;
    
  } //end run() method
} // end Prof04Runner class

/* AAR - I probably could have used some methods
 * to select and modify each quadrant rather than
 * typing it all out each time. I definitely could have
 * used getColor rather than picking RGB individually.
 * Same for setColor. I had to set run() to return type
 * Picture and return workPic because the driver
 * calls Proj04Runner().run()rather than obj =
 * new Project04Runner; obj.run(). (Not sure I
 * entirely understand the difference.) I could have skipped
 * most of the variables names by directly calling the
 * methods assigned to them. */
