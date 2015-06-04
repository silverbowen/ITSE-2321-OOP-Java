/* This program is for ASG03 of ITSE 2321
 * It creates a picture object, manipulates
 * a copy of it pixel by pixel, then opens
 * both objects in Picture Explorer.
 * Author: Silver Bowen */


// Define Proj03Runner class
class Proj03Runner {
  
  /* Instantiate new Picture object workPic.
   * Here the argument is the supplied proj03 jpeg. */
  private Picture workPic = new Picture("Proj03.jpg");
  
  /* Define the constructor, as in proj01
   * using extraneous code to insert my name
   * into the command line output */
  public Proj03Runner() {
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
  public void run(){
    
    // This inserts my name into the pic.
    workPic.addMessage("William Bowen", 10, 20);
    
    // Declare variables
    Pixel changePixel = null; // this is my working pixel
    int green, blue = 0; // where we'll store the original values
        
    /* This nested for loop goes through the pixel grid
     * by pixel and changes each G and B value. */
    for(int x = 0; x <  365; x++) { // pick an x
      
      for(int y = 0; y < 274; y++) { // for each x, pick a y
        
        changePixel = workPic.getPixel(x, y); // set changePixel to current x,y
        green = changePixel.getGreen(); // set green to current Green
        blue = changePixel.getBlue();   // set blue to current Blue
        
        // change stuff up
        changePixel.setGreen((int) (green * x / 365));
        changePixel.setBlue((int) (blue * (365 - x) / 365));
        
        /* I spent hours figuring the above out, mainly by trial and error.
         * Essentially it relies on integer casting of x (our iterator)
         * (later subtracted from total width of the picture), then divided
         * by total width of the picture. Green was easier to figure,
         * and eventually led to blue. */
      }
    }
    
    // Display modified JPEG.
    workPic.explore();
  }
}