package GUI;

import java.awt.*;

public class GUICard extends GameObject {

    public GUICard(int x, int y, ID id) {
        super(x, y, id);
    }


    public void tick() {

    }

    public void render(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(x, y, 32, 32);
    }



}
