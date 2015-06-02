/* This program is for ASG02 of ITSE 2321
 * It creates a picture object, manipulates
 * it pixel by pixel, then opens the object
 * in Picture Explorer.
 * Author: Silver Bowen */


// Define Proj02Runner class
class Proj02Runner {
  
  /* Instantiate a new Picture object workPic.
   * Here the argument is the supplied proj02 jpeg. */
  private Picture workPic = new Picture("Proj02.jpg");
  
  /* Define the constructor, as in proj01
   * using extraneous code to insert my name
   * into the command line output */
  public Proj02Runner(){
    System.out.println("William Bowen");
  }
  
  /* Define a public accessor method,
   * which will allow code outside of
   * instantiated objects to access them. */
  public Picture getPicture(){
    return workPic;
  }
  
  /* Define the run() method, which is called
   * by the driver and is the part of this code
   * that 'makes stuff happen'. */
  public void run(){
    // This inserts my name into the pic.
    workPic.addMessage("William Bowen", 10, 20);
    
    // Declare and initialize array using getPixels().
    Pixel[] arrayPix = workPic.getPixels();
    
    
    /* This for each loop goes through the array
     * by pixel and changes each RGB value. We are
     * inverting red and green (via 255 - current
     * value) and setting blue to a flat 127. */
    for(Pixel pixel : arrayPix) {
      pixel.setRed(255 - pixel.getRed());
      pixel.setGreen(255 - pixel.getGreen());
      pixel.setBlue(127);
    }
    
    // Display modified JPEG.
    workPic.explore();
  }
}
    
    
    