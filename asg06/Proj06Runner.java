 /* This program is for ASG06 of ITSE 2321
  * It mturns a picture 45.0 degrees,
  * then -45 degrees.
  * Author: Silver Bowen **/

/* All this stuff is imported so we
 * can use the Affine Transform class. **/
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.geom.Rectangle2D;
import java.awt.Graphics;
import java.awt.Color;

/* Define Proj06Runner class - it
 * extends Proj06 so it can override
 * Proj06's Run() methods. **/
class Proj06Runner extends Proj06 {
  
  /* Define the constructor, as in proj01
   * using extraneous code to insert my name
   * into the command line output **/
  public Proj06Runner() {
    System.out.println("William Bowen");
  } // end constructor
  
  /* Define overridden run(double) method,
   * which is the first of two overloaded methods
   * called by the driver. **/
  public void run(double notHello) {
    
    /* note that our variable is pic,
     * a static object initialized
     * in the Proj06 class that this
     * Proj06runner class extends. */    
    pic = this.reverse(pic);  // reverse the pic
    pic.addMessage("William Bowen", 10, 20); // add name
    pic = this.rotate(pic, notHello); // rotate
  }
  
  /* Define overridden run(int) method,
   * which is the second of two overloaded methods
   * called by the driver. **/
  public void run(int notHello) {
    
    // add name and rotate
    pic.addMessage("William Bowen", 10, 20);
    pic = this.rotate(pic, notHello);
  }
    
    
    
    /* This method mirrors a picture **/
    private Picture reverse(Picture refPicture) {
      
      // Declare variables
      Pixel refPix,
           flopPix;
      Color color;
      int width  = refPicture.getWidth();
      int height = refPicture.getHeight();
      Picture flopPicture = new Picture(width, height);
      
      /* This nested for loop goes through the picture and writes
       * each pixel to the opposite one in a holding picture. */
      for(int x = 0; x <  width; x++) { // pick an x
        for(int y = 0; y < height; y++) { // for each x, pick a y
          
          refPix = refPicture.getPixel(x, y); // set refPix to x, y
          color = refPix.getColor();        // get color of refPix
          // set flopPix to width-x-1, y
          flopPix = flopPicture.getPixel((width-x-1), y); 
          // set the color of FlopPix = to color of refPix
          flopPix.setColor(color);
        } // end inner loop
      } // end outer loop
      
      return flopPicture;
    } // end reverse method
    
    /* This method uses affine transforms to rotate
     * parameter pic by parameter angle. **/
    private Picture rotate(Picture workPic, double angle) {

    int  width1 = workPic.getWidth(),
        height1 = workPic.getHeight(),
        centerX = width1/2,
        centerY = height1/2,
        width2,
        height2;

    // Create an affine transform object worktrans
    AffineTransform workTrans = new AffineTransform();
    
    // Rotate worktrans by angle parameter
    workTrans.rotate(Math.toRadians(angle), // toRadians is useful!
                         centerX, centerY); // centerpoint of workPic
    
    /* getTransformEnclosingRectangle is the Erricson class
     * that computes the size rectangle needed to hold the
     * newly rotated workTrans */    
    Rectangle2D workRect = workPic.getTransformEnclosingRect(workTrans);

    width2 = (int)(workRect.getWidth());
    height2 = (int)(workRect.getHeight());
    
    /* Now we make a (bigger!) new affine transform object
     * to concatenate with (hold, really) our old one. */
    AffineTransform workTrans2 = new AffineTransform();
    
    /* Set the new object to translate an image by the
     * width/height of workRect minus the centerpoint of workPic. */
    workTrans2.translate((width2 - width1)/2,(height2 - height1)/2);
    
    // Now we concatenate the two transforms
    workTrans2.concatenate(workTrans);
    
    // Make an object to hold our transformed pic
    Picture transPic = new Picture(width2, height2);
    
    /* Make a Graphics2D reference to hold the object
     * returned by getGraphics called on transPic
     * (cast as a graphics2D object). */
    Graphics2D g2D = (Graphics2D)transPic.getGraphics();

    /* Do the transform on transPic, using parameters
     * the image to transform, the image to hold
     * the transformed image, and null (could
     * also be reference to imageObserver. */
    
    g2D.drawImage(workPic.getImage(),workTrans2,null);

    return transPic;
    } // end rotate method
} // end class