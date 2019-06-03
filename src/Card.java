import java.awt.image.BufferedImage;

public class Card {
    //instance variables
    private String name ;
    private BufferedImage cardImage ;
    public Card(String name , BufferedImage cardImage) {
        /////////////////////////Maybe this should be null for later see if ability is null, print it has no ability
        this.name = name;
        this.cardImage = cardImage ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BufferedImage getCardImage() {
        return cardImage;
    }

    public void setCardImage(BufferedImage cardImage) {
        this.cardImage = cardImage;
    }

    @Override
    public String toString() {
        return name + " ";
    }

}
