package GUI;

import Game.Player;

import javax.swing.*;

public class GameFrame extends JFrame implements Runnable {
    private JPanel panel ;
    private Player one;
    private Player two ;

    private final int WIDTH = 1080, HEIGHT = WIDTH / 12 * 9 ;

    public GameFrame(Player one , Player two ){
        this.one = one ;
        this.two = two ;
        createComponents() ;
        this.setTitle("Game!");
        this.setSize(WIDTH, HEIGHT);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void createComponents(){

    }

    public synchronized void start(){

    }

    public void run(){

    }

}
