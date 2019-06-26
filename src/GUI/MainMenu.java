package GUI;

import java.awt.event.ActionListener;
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

        ActionListener startListener = new StartListener() ;
        startButton.addActionListener( startListener);


       p.add(createPlayerButton);
       p.add(startButton);


       this.add(p);



    }

    class StartListener implements ActionListener
    {

        @Override
        public void actionPerformed(ActionEvent arg0) {
            //open a different frame with drop menus for the different coffee options
            p.add(scrollPane); //added this text field. MAYBE PLACE IT SOMEWHEREELSE

            CoffeePurchaseFrame coffeeFrame = new CoffeePurchaseFrame() ;

            coffeeFrame.setVisible(true);

            coffeeFrame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);


            ///////////////////maybe i can place these on the coffee purchase frame after they select done
            p.add(doneButton);
            p.revalidate();
        }


    }
}
