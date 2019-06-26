package Cards;

import java.awt.image.BufferedImage;

public class SpecialCard extends Card {
    //instance variables
    private String ability ;
    private String type ;

    public SpecialCard(String name , BufferedImage frontCardImage , BufferedImage backCardImage , String ability){
        super( name , frontCardImage , backCardImage ) ;
        this.ability = ability ;
        this.type = "Special" ;
    }

    /**
     * gets the special ability of the card
     * @return the ability
     */
    public String getAbility() {
        return ability;
    }

    /**
     * sets the special ability of the card
     * @param ability - special ability of the card
     */
    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String toString(){
        return  "Special Cards.Card [name=" + super.toString() + "type= " + type + ", ability=" + ability +  "]";
    }
}
