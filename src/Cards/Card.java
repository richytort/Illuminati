package Cards;

import java.awt.image.BufferedImage;

/**
 * This class is basically our super class for our cards. It holds variables like Name, the images for the front and
 * back of the cards.
 *
 * @author ARK
 * @since June 25th 2019
 */
public class Card {
    //instance variables
    private String name ;
    private BufferedImage frontCardImage;
    private BufferedImage backCardImage;
    private String type;

    /**
     * This is our constructor for this class. It takes in overloaded parameters of certain types to create a card.
     * @param name This is the name of the cards as type String
     * @param frontCardImage This is the front image of the card as type BufferedImage
     * @param backCardImage This is the back image of the card as type BufferedImage
     */
    public Card(String name , BufferedImage frontCardImage , BufferedImage backCardImage ) {
        /////////////////////////Maybe this should be null for later see if ability is null, print it has no ability
        this.name = name;
        this.frontCardImage = frontCardImage ;
        this.backCardImage = backCardImage ;
    }

    /**
     * Basic geter for our Card to get the name.
     * @return name THis is the name as type String
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     */
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
