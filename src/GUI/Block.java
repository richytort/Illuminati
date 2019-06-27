package GUI;

import framework.Texture;

import java.awt.*;
import java.util.Random;

public class Block extends GameObject {
    Texture tex = GameFrame.getInstance() ;


    public Block(int x, int y, ID id) {
        super(x, y, id);


    }


    public void tick() {
        x += velX;
        y += velY;
    }

    public void render(Graphics g) {
        g.setColor(Color.white);
        /////////THIS SETS THE white border for the squares.
        g.fillRect((int)x, (int)y, 8, 8);
    }

    public Rectangle getBounds(){
        return new Rectangle(x , y , 8 , 8 );
    }


}
