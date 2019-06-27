package GUI;

import framework.Texture;

import java.awt.*;
import java.util.Random;

public class GUICard extends GameObject {
    private int width = 32, height = 64;
    Texture tex = GameFrame.getInstance() ;
    private int type ;

    public GUICard(int x, int y, int type, ID id) {
        super(x, y, id);
        this.type = type ;

    }


    public void tick() {
        x += velX;
        y += velY;
    }

    public void render(Graphics g) {
        if(type == 0 ) //Front card image
            g.drawImage(tex.card[0], x, y, null);
        if(type == 1 ) // back card image
            g.drawImage(tex.card[1], x, y, null);
    }

    public Rectangle getBounds() {
        return new Rectangle(x, y, width, height);
    }



}
