 /* This program is for ASG05 of ITSE 2321
  * It makes 3 picture objects, performs
  * various manipulations on them, then
  * opens the 3rd picture object
  * in Picture Explorer for viewing.
  * Author: Silver Bowen **/

import java.awt.Color;

/* Define Proj05Runner class - it
 * extends Proj05 so it can override
 * Proj05's Run() method. **/
class Proj05Runner extends Proj05 {
  
  /* Define the constructor, as in proj01
   * using extraneous code to insert my name
   * into the command line output **/
  public Proj05Runner() {
    System.out.println("William Bowen");
  } // end constructor
  
  /* Define the run() method, which is called
   * by the driver and is the part of this code
   * that 'makes stuff happen'. **/
  public void run(){
    
    // Instantiate bGPic1
    Picture bGPic1 = new Picture("Proj05a.bmp");
    
    // Call cutDown, arg bGPic1
    bGPic1 = this.cutDown(bGPic1);
    
    // Call tintYellow, arg bGPic1
    this.tintYellow(bGPic1);
    
    // Instantiate bGPic2
    Picture bGPic2 = new Picture ("Proj05b.bmp");
    
    // Call cutDown, arg bGPic2
    bGPic2 = this.cutDown(bGPic2);
    
    // Instantiate bGPic3
    Picture bGPic3 = new Picture ("Proj05c.jpg");
    
    // Call cutDown, arg bGPic3
    bGPic3 = this.cutDown(bGPic3);
    
    // Call darkBG, args bGPic2 and bGPic3
    this.darkBG(bGPic2, bGPic3);
    
    // Call tintYellow, args bGPic2 and bGPic3
    this.tintYellow(bGPic2, bGPic3);
    
    // Call copyGreen, args bGPic1 and bGpic3
    this.copyGreen(bGPic1, bGPic3);
    
    // Insert my name into bGPic1
    bGPic1.addMessage("William Bowen", 10, 20);

    // Open bGPic3
    bGPic1.explore();
    
  } // end run method
  
  /* cutDown trims the excess junk off the edges
   * of a picture **/
  Picture cutDown(Picture curPic){
    
    // new Picture object to put workPic in
    Picture smallPic = new Picture(392, 293);
    
    // loop runs through pixels
    for(int x = 6; x < 398; x++) { // pick an x      
      for(int y = 59; y < 352; y++) { // for each x, pick a y
        
        // get current pixel
        Pixel curPixel  = curPic.getPixel(x,y);
        Pixel smallPixel = smallPic.getPixel(x-6, y-59);
        
        // set new color
        smallPixel.setColor(curPixel.getColor());
      } // end inner loop
    } // end outer loop
    
    return smallPic;
    
  } // end cutDown method
  
  /* tintYellow loops through the pixels of an image.
   * Where they are not Green, it tints them yellow. **/
  void tintYellow(Picture dest) {
    
    // Declare variables
    Pixel curPixel;
    Color color,color2;
    int red, green, blue;
    int width  = dest.getWidth();
    int height = dest.getHeight();
    
    // nested loop
    for(int x = 0; x <  width; x++) { // pick an x      
      for(int y = 0; y < height; y++) { // for each x, pick a y
        
        // get current pixel
        curPixel = dest.getPixel(x,y);
        
        // get color
        color = curPixel.getColor();
          
          // Where color is not  Green, tint pixel
        if (!(color.equals(Color.GREEN))) {
          
          // set red to 1.25, max of 255
          red = color.getRed();
          if((red * 1.25) < 255) {
            red = (int)(red * 1.25);
          }
          else
            red= 255;
          
          // set green to 1.25, max of 255
          green = color.getGreen();
          if((green * 1.25) < 255) {
            green = (int)(green * 1.25);
          }
          else
            green= 255;
          
          // decrease blue .80
          blue = (int)(color.getBlue() * .8);
          
          // set new color2 to curPixel
          color2 = new Color(red, green, blue);
          curPixel.setColor(color2);
        } // end if
      } // end inner loop
    } //end outer loop
    
  } //end tintYellow method
  
  /* darkBG loops through the pixels of a
   * picture. Where these are Green, it darkens
   * the corresponding pixels in a 2nd picture. **/
  void darkBG(Picture pattern, Picture dest) {
    
    // Declare variables
    Pixel curPixel, destPixel;
    Color color, color2;
    int width  = pattern.getWidth();
    int height = pattern.getHeight();
    
    // nested loop
    for(int x = 0; x <  width; x++) { // pick an x      
      for(int y = 0; y < height; y++) { // for each x, pick a y
        
        // get current pixel
        curPixel = pattern.getPixel(x,y);
        
        // get color
        color = curPixel.getColor();
        
        // Where color is Green, darken dest.
        if (color.equals(Color.GREEN)) {
          
          // get color values
          destPixel = dest.getPixel(x,y);
          color2 = destPixel.getColor();
          destPixel.setColor(color2.darker());
        } // end if
      } // end inner loop
    } //end outer loop
    
  } //end darkBG method
  
  /* tintYellow (overloaded version) accepts two parameters.
   * It is essentially a combo of darkBG and the first
   * tintYellow. It loops through the pixels of an image.
   * Where they are not Green, it darkens the 
   * corresponding pixels in a 2nd picture. **/
  void tintYellow(Picture pattern, Picture dest) {
    
    // Declare variables
    Pixel curPixel, destPixel;
    Color color,color2, color3;
    int red, green, blue;
    int width  = pattern.getWidth();
    int height = pattern.getHeight();
    
    // nested loop
    for(int x = 0; x <  width; x++) { // pick an x      
      for(int y = 0; y < height; y++) { // for each x, pick a y
        
        // get current pixel
        curPixel = pattern.getPixel(x,y);
        
        // get color
        color = curPixel.getColor();
          
        // Where color is not Green, tint corresponding pixel
        if (!(color.equals(Color.GREEN))) {
          
          // get destination pixel and color
          destPixel = dest.getPixel(x,y);
          color2 = destPixel.getColor();
            
          // set red to 1.25, max of 255
          red = color2.getRed();
          if((red * 1.25) < 255) {
            red = (int)(red * 1.25);
          }
          else
            red= 255;
          
          // set green to 1.25, max of 255
          green = color2.getGreen();
          if((green * 1.25) < 255) {
            green = (int)(green * 1.25);
          }
          else
            green= 255;
          
          // decrease blue .80
          blue = (int)(color2.getBlue() * .8);
          
          // set new color3 to destPixel
          color3 = new Color(red, green, blue);
          destPixel.setColor(color3);
        } // end if
      } // end inner loop
    } //end outer loop
    
  } //end tintYellow method
  
  /* copyGreen loops through the pixels of a
   * picture. Where these are Green, it copies
   * the corresponding pixels of a 2nd picture **/
  void copyGreen(Picture pattern, Picture dest){
    
    // Declare variables
    Pixel curPixel, destPixel;
    Color color, color2;
    int width  = pattern.getWidth();
    int height = pattern.getHeight();
    
    // nested loop
    for(int x = 0; x <  width; x++) { // pick an x      
      for(int y = 0; y < height; y++) { // for each x, pick a y
        
        // get current pixel
        curPixel = pattern.getPixel(x,y);
        
        // get color
        color = curPixel.getColor();
        
        // If color isn't Green, darken it.
        if (color.equals(Color.GREEN)) {
          
          // get new pixel and color
          destPixel = dest.getPixel(x,y);
          color2 = destPixel.getColor();
          curPixel.setColor(color2);
        } // end if
      } // end inner loop
    } //end outer loop
    
  } // end copyGreen method
  
} //end class
    