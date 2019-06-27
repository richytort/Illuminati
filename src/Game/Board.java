package Game;

import java.util.*;
import Cards.Card;

public class Board{
   Scanner in = new Scanner(System.in);
   private ArrayList<Player> players;
   Player p1;
   private ArrayList<Card> uncontrolled;
   private int dice1;
   private int dice2;
   Deck deck;
   private int total;

   public Board(){
      players = new ArrayList<>();
      uncontrolled = new ArrayList<>();
   }
   public void getCard(){
      Card c =deck.getDeck().get(0);
      if(c.getType().toLowerCase() == "special card"){
         deck.shuffle();
         getCard();
      }else if(c.getType().toLowerCase() == "other group"){
         p1.addGroup(c);
         deck.getDeck().remove(c);
      }
   }

   public void getIlluminati(){
      Card c= deck.getDeck().get(0);
      p1.addGroup(c);
      deck.getDeck().remove(0);
      for(int e =0; e < deck.getDeck().size(); e++){
         if(deck.getDeck().get(e).getType().toLowerCase() == "illuminati"){
            deck.getDeck().remove(e);
         }
      }
   }

   public void get4Cards(){
      Card cards4;
      for(int i = 0; i < 4; i++){
         cards4 =deck.getDeck().get(i);
         uncontrolled.add(cards4);
      }
   }


   public int rollDice() {
      dice1 = (int) (Math.random() * 6);
      dice2 = (int) (Math.random() * 6);
      total = dice1 * dice2;
      return total;
   }



}