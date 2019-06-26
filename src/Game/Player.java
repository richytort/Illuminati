package Game;
import java.util.ArrayList;
import Cards.Card;


public class Player {
    //instance variables
    private String name ;
    private ArrayList<Card> Cards;

   public Player(String name){
       this.name = name;
       Cards = new ArrayList<>();
   }

    public void setName(String name){
        this.name = name;
    }

    

}
