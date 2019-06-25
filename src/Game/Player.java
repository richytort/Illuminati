package Game;
import java.util.ArrayList;
import Cards.Card;

/**
 * This is the player class that we need for our Illuminati game. Represents the individual player
 *
 * @author ARK
 * @since 25 June 2019
 *
 */
public class Player {
    //instance variables
    private String name ;
    private ArrayList<Card> cards;

    /**
     * This is the basic constructor for our player class.
     */
    public Player(){
        name = "Default";
        cards = new ArrayList<Card>() ;
    }

}

