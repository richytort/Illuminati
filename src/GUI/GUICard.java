package GUI;

import java.awt.*;
import java.util.Random;

public class GUICard extends GameObject {

    Random r = new Random();

    public GUICard(int x, int y, ID id) {
        super(x, y, id);

        velX = r.nextInt(5) + 1 ;
        velY = r.nextInt(5);
    }


    public void tick() {
        x += velX;
        y += velY;
    }

    public void render(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(x, y, 32, 32);
    }



}
