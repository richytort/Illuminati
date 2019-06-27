package framework;

import Cards.Card;
import GUI.BufferedImageLoader;
import Game.Deck;

import java.awt.image.BufferedImage;
import java.io.IOException;

public class Texture {
    //SpriteSheet bs, ps ;
    //private BufferedImage block_sheet = null ;
    //private BufferedImage card_sheet = null ;

    public BufferedImage[] card = new BufferedImage[2];



    public Texture() throws IOException {
        Deck myDeck = new Deck();

        Card temp = myDeck.deck.get(0);

        card[0] = temp.getFrontCardImage();
        card[1] = temp.getBackCardImage();

        /*
        BufferedImageLoader loader = new BufferedImageLoader();
        try{
            block_sheet = loader.loadImage("block_sheet.png");
            card_sheet = loader.loadImage();
        }catch(Exception e){
            e.printStackTrace();
        }

        bs = new SpriteSheet(block_sheet);
        ps = new SpriteSheet(card_sheet);


         */

        getTextures();

    }

    private void getTextures() {
        //card = ps.grabImage();
    }

}
