import java.awt.image.BufferedImage;

public class SpecialCard extends Card {
    //instance variables
    private String ability ;
    private String type ;

    SpecialCard(String name , BufferedImage frontCardImage , BufferedImage backCardImage , String ability){
        super( name , frontCardImage , backCardImage ) ;
        this.ability = ability ;
        this.type = "Special" ;
    }

    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public String toString(){
        return  "Special Card [name=" + super.toString() + "type= " + type + ", ability=" + ability +  "]";
    }
}
