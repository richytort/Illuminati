package GUI;

import java.awt.*;
import java.util.Random;

public class GUICard extends GameObject {

    Random r = new Random();

    public GUICard(int x, int y, ID id) {
        super(x, y, id);


    }


    public void tick() {
        x += velX;
        y += velY;
    }

    public void render(Graphics g) {
        //if(id == ID.PlayerOneCard)
            g.setColor(Color.white);
        //else
            //g.setColor(Color.red);
            g.fillRect(x, y, 32, 32);
    }



}
