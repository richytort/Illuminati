package GUI;

import java.awt.*;
import java.util.Random;

public class GUICard extends GameObject {
    private int width = 32, height = 64;

    public GUICard(int x, int y, ID id) {
        super(x, y, id);


    }


    public void tick() {
        x += velX;
        y += velY;
    }

    public void render(Graphics g) {
            g.setColor(Color.blue);
            g.fillRect(x, y, width, height);
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }



}
