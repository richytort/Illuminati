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

        JFrame window1 = new JFrame(myDeck.deck.get(0).getName()) ;
        window1.setSize(450,300);
        window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window1.setVisible(true);
        JPanel p1 = new JPanel() ;
        JLabel cardLabel1 = new JLabel( new ImageIcon(myDeck.deck.get(0).getCardImage()));
        cardLabel1.setSize(400,300);
        p1.add(cardLabel1);
        window1.add(p1);
        window1.setVisible(true);


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
        cardLabel10.setSize(400, 300 );
        p10.add(cardLabel10);
        window10.add(p10);
        window10.setVisible(true);

        JFrame window11 = new JFrame(myDeck.deck.get(10).getName());
        window11.setSize( 450, 300);
        window11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window11.setVisible(true);
        JPanel p11 = new JPanel() ;
        JLabel cardLabel11 = new JLabel (new ImageIcon(myDeck.deck.get(10).getCardImage()));
        cardLabel1.setSize(400, 300 );
        p11.add(cardLabel11);
        window11.add(p11);
        window11.setVisible(true);

        JFrame window12 = new JFrame(myDeck.deck.get(11).getName());
        window12.setSize( 450, 300);
        window12.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window12.setVisible(true);
        JPanel p12 = new JPanel() ;
        JLabel cardLabel12 = new JLabel (new ImageIcon(myDeck.deck.get(11).getCardImage()));
        cardLabel12.setSize(400, 300 );
        p12.add(cardLabel12);
        window12.add(p12);
        window12.setVisible(true);

        JFrame window13 = new JFrame(myDeck.deck.get(12).getName());
        window13.setSize( 450, 300);
        window13.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window13.setVisible(true);
        JPanel p13 = new JPanel() ;
        JLabel cardLabel13 = new JLabel (new ImageIcon(myDeck.deck.get(12).getCardImage()));
        cardLabel13.setSize(400, 300 );
        p13.add(cardLabel13);
        window13.add(p13);
        window13.setVisible(true);

        JFrame window14 = new JFrame(myDeck.deck.get(13).getName());
        window14.setSize( 450, 300);
        window14.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window14.setVisible(true);
        JPanel p14 = new JPanel() ;
        JLabel cardLabel14 = new JLabel (new ImageIcon(myDeck.deck.get(13).getCardImage()));
        cardLabel14.setSize(400, 300 );
        p14.add(cardLabel14);
        window14.add(p14);
        window14.setVisible(true);

        JFrame window15 = new JFrame(myDeck.deck.get(14).getName());
        window15.setSize( 450, 300);
        window15.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window15.setVisible(true);
        JPanel p15 = new JPanel() ;
        JLabel cardLabel15 = new JLabel (new ImageIcon(myDeck.deck.get(14).getCardImage()));
        cardLabel15.setSize(400, 300 );
        p15.add(cardLabel15);
        window15.add(p15);
        window15.setVisible(true);

        JFrame window16 = new JFrame(myDeck.deck.get(15).getName());
        window16.setSize( 450, 300);
        window16.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window16.setVisible(true);
        JPanel p16 = new JPanel() ;
        JLabel cardLabel16 = new JLabel (new ImageIcon(myDeck.deck.get(15).getCardImage()));
        cardLabel16.setSize(400, 300 );
        p16.add(cardLabel16);
        window16.add(p16);
        window16.setVisible(true);

        JFrame window17 = new JFrame(myDeck.deck.get(16).getName());
        window17.setSize( 450, 300);
        window17.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window17.setVisible(true);
        JPanel p17 = new JPanel() ;
        JLabel cardLabel17 = new JLabel (new ImageIcon(myDeck.deck.get(16).getCardImage()));
        cardLabel17.setSize(400, 300 );
        p17.add(cardLabel17);
        window17.add(p17);
        window17.setVisible(true);

        JFrame window18 = new JFrame(myDeck.deck.get(17).getName());
        window18.setSize( 450, 300);
        window18.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window18.setVisible(true);
        JPanel p18 = new JPanel() ;
        JLabel cardLabel18 = new JLabel (new ImageIcon(myDeck.deck.get(17).getCardImage()));
        cardLabel18.setSize(400, 300 );
        p18.add(cardLabel18);
        window18.add(p18);
        window18.setVisible(true);

        JFrame window19 = new JFrame(myDeck.deck.get(18).getName());
        window19.setSize( 450, 300);
        window19.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window19.setVisible(true);
        JPanel p19 = new JPanel() ;
        JLabel cardLabel19 = new JLabel (new ImageIcon(myDeck.deck.get(18).getCardImage()));
        cardLabel19.setSize(400, 300 );
        p19.add(cardLabel19);
        window19.add(p19);
        window19.setVisible(true);

        JFrame window20 = new JFrame(myDeck.deck.get(19).getName());
        window20.setSize( 450, 300);
        window20.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window20.setVisible(true);
        JPanel p20 = new JPanel() ;
        JLabel cardLabel20 = new JLabel (new ImageIcon(myDeck.deck.get(19).getCardImage()));
        cardLabel20.setSize(400, 300 );
        p20.add(cardLabel20);
        window20.add(p20);
        window20.setVisible(true);

        JFrame window21 = new JFrame(myDeck.deck.get(20).getName());
        window21.setSize( 450, 300);
        window21.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window21.setVisible(true);
        JPanel p21 = new JPanel() ;
        JLabel cardLabel21 = new JLabel (new ImageIcon(myDeck.deck.get(20).getCardImage()));
        cardLabel21.setSize(400, 300 );
        p21.add(cardLabel21);
        window21.add(p21);
        window21.setVisible(true);

        JFrame window22 = new JFrame(myDeck.deck.get(21).getName());
        window22.setSize( 450, 300);
        window22.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window22.setVisible(true);
        JPanel p22 = new JPanel() ;
        JLabel cardLabel22 = new JLabel (new ImageIcon(myDeck.deck.get(21).getCardImage()));
        cardLabel22.setSize(400, 300 );
        p22.add(cardLabel22);
        window22.add(p22);
        window22.setVisible(true);

        JFrame window23 = new JFrame(myDeck.deck.get(22).getName());
        window23.setSize( 450, 300);
        window23.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window23.setVisible(true);
        JPanel p23 = new JPanel() ;
        JLabel cardLabel23 = new JLabel (new ImageIcon(myDeck.deck.get(22).getCardImage()));
        cardLabel23.setSize(400, 300 );
        p23.add(cardLabel23);
        window23.add(p23);
        window23.setVisible(true);

    }
}
