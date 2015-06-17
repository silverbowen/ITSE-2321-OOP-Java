 /* This program is for ASG05 of ITSE 2321
  * It makes an array of all the pixels in 2
  * objects, then assigns all the non Green255
  * pixels to the same locations in the third
  * object. In the case of the 2nd picture, it
  * also inverts the color of the transfered
  * pixels (and does some other processing).
  * Then it opens the new picture object
  * in Picture Explorer for viewing.
  * Author: Silver Bowen **/

import java.awt.Color;
import java.io.PrintStream;

/* Define Proj05Runner class - it
 * extends Proj05 so it can override
 * Proj05's Run() method. **/
class Proj05Runner extends  Proj05 {
  
  /* Define the constructor, as in proj01
   * using extraneous code to insert my name
   * into the command line output **/
  public Proj05Runner() {
    System.out.println("William Bowen");
  }
  
  /* Define the run() method, which is called
   * by the driver and is the part of this code
   * that 'makes stuff happen'. **/
  public void run(){
    
    /* Instantiate new Picture object workPic.
    * Here the argument is the supplied Proj05c jpeg. **/
    Picture workPic = new Picture("Proj05b.bmp");
    
    // cut workPic down to size
    workPic = this.cutDown(workPic);

    // This inserts my name into the pic.
    workPic.addMessage("William Bowen", 10, 20);
    
    // Instantiate & call invertGreen on workPic
    workPic = this.invertGreen(workPic);
    
    // instantiate and call bGPic1
    Picture bGPic1 = new Picture ("Proj05a.bmp");
    
    // cutDown bGPic1
    bGPic1 = this.cutDown(bGPic1);
    
    // Call copyGreen args workPic and pic a
    workPic = this.copyGreen(workPic, bGPic1);
    
    // instantiate and call bGPic2
    Picture bGPic2 = new Picture ("Proj05c.jpg");
    
    // cutDown bGPic2
    bGPic2 = this.cutDown(bGPic2);

    // Call copyGreen on workPic and pic c
    workPic = this.copyGreen(workPic, bGPic2);
      
    // Open workPic
    workPic.explore();
  
  } // end run method
  
  /* cutDown trims the excess junk off the edges
   * of a picture **/
  Picture cutDown(Picture workPic){
    
    // new Picture object to put workPic in
    Picture smallPic = new Picture(392, 293);
    
    // loop runs through pixels
    for(int x = 6; x < 398; x++) { // pick an x
      
      for(int y = 59; y < 352; y++) { // for each x, pick a y
        
        // get current pixel
        Pixel curPixel  = workPic.getPixel(x,y);
        Pixel workPixel = smallPic.getPixel(x-6, y-59);
        
        // set new color
        workPixel.setColor(curPixel.getColor());
      } // end inner loop
    } // end outer loop
    
    return smallPic;
  } // end cutDown method
  
  
  /* invertGreen is a method that inverts the 
   * non-Green255 portions of a picture **/
  Picture invertGreen(Picture workPic){
    
    // Declare variables
    Pixel curPixel;
    int red, green, blue;
    int width  = workPic.getWidth();
    int height = workPic.getHeight();
    
    // nested loop
    for(int x = 0; x <  width; x++) { // pick an x
      
      for(int y = 0; y < height; y++) { // for each x, pick a y
        
        // get current pixel
        curPixel = workPic.getPixel(x,y);
        
        // get Bg colors
        red   = curPixel.getRed();
        green = curPixel.getGreen();
        blue  = curPixel.getBlue();
        
        // If color isn't green, invert it.
        if ((green != 255) && (red != 0) && (blue != 0)) {
          curPixel.setRed(255-red);
          curPixel.setGreen(255-green);
          curPixel.setBlue(255-blue);
        
        } // end if
      } // end inner loop
    } // end outer loop
    
    return workPic;
  } // end invertGreen method
  
  /* copyGreen is a method that copies the non-Green255
   * portions of a background picture to a working picture **/
  Picture copyGreen(Picture workPic, Picture copyPic){
    
    // Declare variables
    Pixel curPixel,
         workPixel;
    int red,
        green,
        blue;
    int width  = workPic.getWidth();
    int height = workPic.getHeight();
    
    // nested loop
    for(int x = 0; x <  width; x++) { // pick an x
      
      for(int y = 0; y < height; y++) { // for each x, pick a y
        
        // get current pixel
        curPixel = copyPic.getPixel(x,y);
        
        // get pixel to change
        workPixel = workPic.getPixel(x,y);
        
        // get BG colors
        red = curPixel.getRed();
        green = curPixel.getGreen();
        blue  = curPixel.getBlue();
        
        // If color isn't green, copy it to workPic
        if ((green != 255) && (red != 0) && (blue != 0)){
          workPixel.setColor(curPixel.getColor());
        } // end if
      } // end inner loop
    } // end outer loop
    
    return workPic;
  } // end copyGreen method  
} // end class  

        
    