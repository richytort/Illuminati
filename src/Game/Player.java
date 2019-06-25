package Game;
import java.util.ArrayList;
import Cards.Card;


public class Player {
    //instance variables
    private String name ;
    private ArrayList<Card> cards;

    public Player(){
        name = "Default";
        cards = new ArrayList<Card>() ;
    }

}

