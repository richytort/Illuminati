import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main {

    public static void main(String[] args) throws IOException {
        Deck myDeck = new Deck() ;

        for(int i = 0 ; i < myDeck.deck.size() ; i++ )
            System.out.println( myDeck.deck.get(i).toString() );

        ///create the card image

        JFrame window1 = new JFrame(myDeck.deck.get(11).getName()) ;
        window1.setSize(450,300);
        window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window1.setVisible(true);
        JPanel p1 = new JPanel() ;
        JLabel cardLabel1 = new JLabel( new ImageIcon(myDeck.deck.get(11).getCardImage()));
        cardLabel1.setSize(400,300);
        p1.add(cardLabel1);
        window1.add(p1);
        window1.setVisible(true);

        /*
        JFrame window2 = new JFrame(myDeck.deck.get(1).getName()) ;
        window2.setSize(450,300);
        window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window2.setVisible(true);
        JPanel p2 = new JPanel() ;
        JLabel cardLabel2 = new JLabel( new ImageIcon(myDeck.deck.get(1).getCardImage()));
        cardLabel2.setSize(400,300);
        p2.add(cardLabel2);
        window2.add(p2);
        window2.setVisible(true);

        JFrame window3 = new JFrame(myDeck.deck.get(2).getName()) ;
        window3.setSize(450,300);
        window3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window3.setVisible(true);
        JPanel p3 = new JPanel() ;
        JLabel cardLabel3 = new JLabel( new ImageIcon(myDeck.deck.get(2).getCardImage()));
        cardLabel3.setSize(400,300);
        p3.add(cardLabel3);
        window3.add(p3);
        window3.setVisible(true);

        JFrame window4 = new JFrame(myDeck.deck.get(3).getName()) ;
        window4.setSize(450,300);
        window4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window4.setVisible(true);
        JPanel p4 = new JPanel() ;
        JLabel cardLabel4 = new JLabel( new ImageIcon(myDeck.deck.get(3).getCardImage()));
        cardLabel4.setSize(400,300);
        p4.add(cardLabel4);
        window4.add(p4);
        window4.setVisible(true);
        JFrame window5 = new JFrame(myDeck.deck.get(4).getName()) ;
        window5.setSize(450,300);
        window5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window5.setVisible(true);
        JPanel p5 = new JPanel() ;
        JLabel cardLabel5 = new JLabel( new ImageIcon(myDeck.deck.get(4).getCardImage()));
        cardLabel5.setSize(400,300);
        p5.add(cardLabel5);
        window5.add(p5);
        window5.setVisible(true);

        JFrame window6 = new JFrame(myDeck.deck.get(5).getName()) ;
        window6.setSize(450,300);
        window6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window6.setVisible(true);
        JPanel p6 = new JPanel() ;
        JLabel cardLabel6 = new JLabel( new ImageIcon(myDeck.deck.get(5).getCardImage()));
        cardLabel6.setSize(400,300);
        p6.add(cardLabel6);
        window6.add(p6);
        window6.setVisible(true);

        JFrame window7 = new JFrame(myDeck.deck.get(6).getName()) ;
        window7.setSize(450,300);
        window7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window7.setVisible(true);
        JPanel p7 = new JPanel() ;
        JLabel cardLabel7 = new JLabel( new ImageIcon(myDeck.deck.get(6).getCardImage()));
        cardLabel7.setSize(400,300);
        p7.add(cardLabel7);
        window7.add(p7);
        window7.setVisible(true);

        JFrame window8 = new JFrame(myDeck.deck.get(7).getName()) ;
        window8.setSize(450,300);
        window8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window8.setVisible(true);
        JPanel p8 = new JPanel() ;
        JLabel cardLabel8 = new JLabel( new ImageIcon(myDeck.deck.get(7).getCardImage()));
        cardLabel8.setSize(400,300);
        p8.add(cardLabel8);
        window8.add(p8);
        window8.setVisible(true);

        JFrame window9 = new JFrame(myDeck.deck.get(9).getName());
        window9.setSize( 450, 300);
        window9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window9.setVisible(true);
        JPanel p9 = new JPanel() ;
        JLabel cardLabel9 = new JLabel (new ImageIcon(myDeck.deck.get(8).getCardImage()));
        cardLabel9.setSize(400, 300 );
        p9.add(cardLabel9);
        window9.add(p9);
        window9.setVisible(true);

        JFrame window10 = new JFrame(myDeck.deck.get(9).getName());
        window10.setSize( 450, 300);
        window10.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window10.setVisible(true);
        JPanel p10 = new JPanel() ;
        JLabel cardLabel10 = new JLabel (new ImageIcon(myDeck.deck.get(9).getCardImage()));
        cardLabel9.setSize(400, 300 );
        p10.add(cardLabel10);
        window10.add(p10);
        window10.setVisible(true);
        */



















    }
}
