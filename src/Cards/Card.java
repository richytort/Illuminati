package Cards;

import java.awt.image.BufferedImage;

public class Card {
    //instance variables
    private String name ;
    private BufferedImage frontCardImage;
    private BufferedImage backCardImage;
    private String type;

    public Card(String name , BufferedImage frontCardImage , BufferedImage backCardImage ) {
        /////////////////////////Maybe this should be null for later see if ability is null, print it has no ability
        this.name = name;
        this.frontCardImage = frontCardImage ;
        this.backCardImage = backCardImage ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public BufferedImage getFrontCardImage() {
        return frontCardImage;
    }

    public void setFrontCardImage(BufferedImage frontCardImage) {
        this.frontCardImage = frontCardImage;
    }

    public BufferedImage getBackCardImage() {
        return backCardImage;
    }

    public void setBackCardImage(BufferedImage backCardImage) {
        this.backCardImage = backCardImage;
    }

    @Override
    public String toString() {
        return name + " ";
    }

}
