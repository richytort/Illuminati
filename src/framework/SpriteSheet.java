package framework;

import java.awt.image.BufferedImage;

public class SpriteSheet {
    private BufferedImage image;
     public SpriteSheet(BufferedImage image){
         this.image = image;
     }

     public BufferedImage grabImage( BufferedImage image){
         BufferedImage img = image;
         return img;

     }
}
