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
    public Card getCard(int i){
        Card card =cards.get(i);
        return card;
    }
    public void printCard(){
        for(Card e : cards){
            System.out.println(e + " ");
        }
    }
    public void removeGroup(int e){
        cards.remove(e);
    }
    public void addGroup(Card e){
        cards.add(e);
    }

    public void action(String action){
        if(action == "regular action"){ //regular action
            System.out.println("1.Attack a group. \n 2.Transfer Money. \n 3.Move a group. \n 4.Give a group away");
            System.out.println("What type of Regular Action do you want to take?");
            int regularA = in.nextInt();
            regularAction(regularA);
            turn = true;
        }else if(action =="free action"){ //free action
            System.out.println("1. Dropping group.\n2. Aiding an attack. \n 3.Giving away a special card. \n 4. Giving away money. \n 5.Using a special card ");
            System.out.println("What type of free Action do you want to take?");
            int freeA = in.nextInt();
            freeAction(freeA);
            turn = true;
        }else if(action == "passing"){ //passing
            turn = false;
            income = getIncome() + 5;
        }
    }
    public void regularAction(int regularAction){
        if(regularAction == 1){//attack a group
            System.out.println("1.Attack to control. \n 2.Attack to neutralize. \n 3.Attack to destroy.");
            int attackD = in.nextInt();
            attackGroup(attackD);
        }else if(regularAction ==2){ //transfer money

        }else if(regularAction == 3){ //move a group

        }else if (regularAction == 4){ //give a group away

        }
    }

    public void attackGroup(int decision){
        if(decision == 1){ //attack to control

        }if(decision == 2){ //attack to neutralize

        }if(decision == 3){ //attack to destroy

        }
    }

    public void freeAction(int freeAction){
        if(freeAction == 1){ //dropping groups
            printCard();
            System.out.println("What group do you want to drop?");
            int group = in.nextInt();
            removeGroup(group);
        }else if(freeAction == 2){ //aiding an attack

        }else if(freeAction == 3){ //giving away a special card

        }else if(freeAction == 4){ //giving away money
            System.out.println("How much money do you want to transfer?");
            int transfer = in.nextInt();
        }
        else if(freeAction == 5){ //using a special card
            System.out.println("What special card would you like to use?");
            String specialCard = in.nextLine().toLowerCase();
            specialCard(specialCard);
        }
    }

    public void specialCard(String specialCard){
        if(specialCard == "assassination"){

        }else if(specialCard== "bribery"){

        }else if(specialCard == "computer espionage"){

        }else if(specialCard == "deep agent "){

        } else if(specialCard== "interference"){

        }else if(specialCard == "Market manipulation "){

        }else if(specialCard== "media campaign"){

        }else if(specialCard == "murphy's law"){

        }else if(specialCard == "secrets man was not meant to know "){

        }else if(specialCard== "senate investigating committee"){

        }else if(specialCard == "slush fund"){

        }else if(specialCard == "swiss bank account"){

        }else if(specialCard== "whispering campaign"){

        }else if(specialCard == "white collar crime"){

        }
    }


}