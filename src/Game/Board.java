package Game;

import java.util.*;

public class Board {
   Scanner in = new Scanner(System.in);
   private ArrayList<Player> players;
   Player player1;
   Player player2;
   private boolean turn;
   private int income;
   protected int dice1;
   protected int dice2;
   protected int total;


   public Board() {
      player1 = new Player();
      player2 = new Player();
      players = new ArrayList<Player>();
   }

   public void addPlayers() {
      players.add(player1);
      players.add(player2);
   }

   public int rollDice() {
      dice1 = (int) (Math.random() * 6);
      dice2 = (int) (Math.random() * 6);
      total = dice1 * dice2;
      return total;
   }

}