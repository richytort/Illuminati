package GUI;

import java.awt.*;
import java.util.Random;

public class Block extends GameObject {

    Random r = new Random();

    public Block(int x, int y, ID id) {
        super(x, y, id);


    }


    public void tick() {
        x += velX;
        y += velY;
    }

    public void render(Graphics g) {
        g.setColor(Color.white);

        g.drawRect((int)x, (int)y, 32, 32);
    }

    public Rectangle getBounds(){
        return new Rectangle(x , y , 32 , 32 );
    }


}
