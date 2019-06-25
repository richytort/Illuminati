package GUI;

import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

public class MainMenu extends JFrame{
    //instance variables
    JButton createPlayerButton ;
    JButton startButton ;
    JPanel p ;

    public MainMenu() {
        this.setTitle( "Main Menu");
        this.setSize(450, 600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        createComponents();
    }

    public void createComponents(){
       JPanel p = new JPanel() ;
       startButton = new JButton("Start") ;
       createPlayerButton = new JButton("Create Player");
       p.add(createPlayerButton);
       p.add(startButton);


       this.add(p);

    }
}
