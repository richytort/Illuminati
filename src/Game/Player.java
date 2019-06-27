package Game;
import java.util.ArrayList;
import java.util.Scanner;

import Cards.Card;

/**
 * This is the player class that we need for our Illuminati game. Represents the individual player
 *
 * @author ARK
 * @since 25 June 2019
 *
 */
public class Player {
    Scanner in = new Scanner(System.in);
    //instance variables
    protected String name ;
    protected Boolean turn;
    protected Integer income;
    private ArrayList<Card> cards;


    /**
     * This is the basic constructor for our player class.
     */
    public Player(){
        name = "Default";
        cards = new ArrayList<Card>() ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getIncome(){
        for(int i = 0; i < cards.size(); i++) {
            income += cards.get(i).getIncome();
        }
        return income;
    }

    public void action(String action){
        if(action == "regular action"){ //regular action
            System.out.println("What type of Regular Action do you want to take?");
            String regularA = in.nextLine().toLowerCase();
            turn = true;
        }else if(action =="free action"){ //free action
            System.out.println("What type of free Action do you want to take?");
            String freeA = in.nextLine().toLowerCase();
            freeAction(freeA);
            turn = true;
        }else if(action == "passing"){ //passing
            turn = false;
            income = getIncome() + 5;
        }
    }

    public void freeAction(String freeAction){
        if(freeAction == "dropping groups"){ //dropping groups
            System.out.println("What group do you want to drop?");
            String group = in.nextLine().toLowerCase();
            cards.remove(group);
        }else if(freeAction == "aiding an attack"){ //aiding an attack

        }else if(freeAction == "giving away a special card"){ //giving away a special card

        }else if(freeAction == "giving away money"){ //giving away money

        }
        else if(freeAction == "using a special card"){ //using a special card
            System.out.println("What special card would you like to use?");
            String specialCard = in.nextLine().toLowerCase();
            specialCard(specialCard);
        }
    }

    public void specialCard(String specialCard){
        if(specialCard == ""){

        }else if(){

        }else if(){

        }else if(){

        }
    }


}