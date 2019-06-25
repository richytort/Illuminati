package Tester;

import Game.Deck;

import java.io.IOException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardTester {

    public static void main(String[] args) throws IOException {
        Deck myDeck = new Deck() ;

        for(int i = 0 ; i < myDeck.deck.size() ; i++ )
            System.out.println( myDeck.deck.get(i).toString() );

        ///create the card image

        JFrame window1 = new JFrame(myDeck.deck.get(20).getName()) ;
        window1.setSize(450,330);
        window1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window1.setVisible(true);
        JPanel p1 = new JPanel() ;
        JLabel cardLabel1 = new JLabel( new ImageIcon(myDeck.deck.get(20).getFrontCardImage()));
        cardLabel1.setSize(425,325);
        p1.add(cardLabel1);
        window1.add(p1);
        window1.setVisible(true);

        JFrame window2 = new JFrame(myDeck.deck.get(0).getName()) ;
        window2.setSize(450,330);
        window2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window2.setVisible(true);
        JPanel p2 = new JPanel() ;
        JLabel cardLabel2 = new JLabel( new ImageIcon(myDeck.deck.get(0).getBackCardImage()));
        cardLabel2.setSize(425,325);
        p2.add(cardLabel2);
        window2.add(p2);
        window2.setVisible(true);




        JFrame window3 = new JFrame(myDeck.deck.get(2).getName()) ;
        window3.setSize(450,330);
        window3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window3.setVisible(true);
        JPanel p3 = new JPanel() ;
        JLabel cardLabel3 = new JLabel( new ImageIcon(myDeck.deck.get(2).getFrontCardImage()));
        cardLabel3.setSize(425,325);
        p3.add(cardLabel3);
        window3.add(p3);
        window3.setVisible(true);

        JFrame window4 = new JFrame(myDeck.deck.get(3).getName()) ;
        window4.setSize(450,330);
        window4.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window4.setVisible(true);
        JPanel p4 = new JPanel() ;
        JLabel cardLabel4 = new JLabel( new ImageIcon(myDeck.deck.get(3).getFrontCardImage()));
        cardLabel4.setSize(425,325);
        p4.add(cardLabel4);
        window4.add(p4);
        window4.setVisible(true);
        JFrame window5 = new JFrame(myDeck.deck.get(4).getName()) ;
        window5.setSize(450,330);
        window5.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window5.setVisible(true);
        JPanel p5 = new JPanel() ;
        JLabel cardLabel5 = new JLabel( new ImageIcon(myDeck.deck.get(4).getFrontCardImage()));
        cardLabel5.setSize(425,325);
        p5.add(cardLabel5);
        window5.add(p5);
        window5.setVisible(true);

        JFrame window6 = new JFrame(myDeck.deck.get(5).getName()) ;
        window6.setSize(450,330);
        window6.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window6.setVisible(true);
        JPanel p6 = new JPanel() ;
        JLabel cardLabel6 = new JLabel( new ImageIcon(myDeck.deck.get(5).getFrontCardImage()));
        cardLabel6.setSize(425,325);
        p6.add(cardLabel6);
        window6.add(p6);
        window6.setVisible(true);

        JFrame window7 = new JFrame(myDeck.deck.get(6).getName()) ;
        window7.setSize(450,330);
        window7.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window7.setVisible(true);
        JPanel p7 = new JPanel() ;
        JLabel cardLabel7 = new JLabel( new ImageIcon(myDeck.deck.get(6).getFrontCardImage()));
        cardLabel7.setSize(425,325);
        p7.add(cardLabel7);
        window7.add(p7);
        window7.setVisible(true);

        JFrame window8 = new JFrame(myDeck.deck.get(7).getName()) ;
        window8.setSize(450,330);
        window8.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window8.setVisible(true);
        JPanel p8 = new JPanel() ;
        JLabel cardLabel8 = new JLabel( new ImageIcon(myDeck.deck.get(7).getFrontCardImage()));
        cardLabel8.setSize(425,325);
        p8.add(cardLabel8);
        window8.add(p8);
        window8.setVisible(true);

        JFrame window9 = new JFrame(myDeck.deck.get(9).getName());
        window9.setSize( 450, 330);
        window9.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window9.setVisible(true);
        JPanel p9 = new JPanel() ;
        JLabel cardLabel9 = new JLabel (new ImageIcon(myDeck.deck.get(8).getFrontCardImage()));
        cardLabel9.setSize(425, 325 );
        p9.add(cardLabel9);
        window9.add(p9);
        window9.setVisible(true);

        JFrame window10 = new JFrame(myDeck.deck.get(9).getName());
        window10.setSize( 450, 330);
        window10.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window10.setVisible(true);
        JPanel p10 = new JPanel() ;
        JLabel cardLabel10 = new JLabel (new ImageIcon(myDeck.deck.get(9).getFrontCardImage()));
        cardLabel10.setSize(425, 325 );
        p10.add(cardLabel10);
        window10.add(p10);
        window10.setVisible(true);

        JFrame window11 = new JFrame(myDeck.deck.get(10).getName());
        window11.setSize( 450, 330);
        window11.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window11.setVisible(true);
        JPanel p11 = new JPanel() ;
        JLabel cardLabel11 = new JLabel (new ImageIcon(myDeck.deck.get(10).getFrontCardImage()));
        cardLabel1.setSize(425, 325 );
        p11.add(cardLabel11);
        window11.add(p11);
        window11.setVisible(true);

        JFrame window12 = new JFrame(myDeck.deck.get(11).getName());
        window12.setSize( 450, 330);
        window12.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window12.setVisible(true);
        JPanel p12 = new JPanel() ;
        JLabel cardLabel12 = new JLabel (new ImageIcon(myDeck.deck.get(11).getFrontCardImage()));
        cardLabel12.setSize(425, 325 );
        p12.add(cardLabel12);
        window12.add(p12);
        window12.setVisible(true);

        JFrame window13 = new JFrame(myDeck.deck.get(12).getName());
        window13.setSize( 450, 330);
        window13.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window13.setVisible(true);
        JPanel p13 = new JPanel() ;
        JLabel cardLabel13 = new JLabel (new ImageIcon(myDeck.deck.get(12).getFrontCardImage()));
        cardLabel13.setSize(425, 325 );
        p13.add(cardLabel13);
        window13.add(p13);
        window13.setVisible(true);

        JFrame window14 = new JFrame(myDeck.deck.get(13).getName());
        window14.setSize( 450, 330);
        window14.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window14.setVisible(true);
        JPanel p14 = new JPanel() ;
        JLabel cardLabel14 = new JLabel (new ImageIcon(myDeck.deck.get(13).getFrontCardImage()));
        cardLabel14.setSize(425, 325 );
        p14.add(cardLabel14);
        window14.add(p14);
        window14.setVisible(true);

        JFrame window15 = new JFrame(myDeck.deck.get(14).getName());
        window15.setSize( 450, 330);
        window15.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window15.setVisible(true);
        JPanel p15 = new JPanel() ;
        JLabel cardLabel15 = new JLabel (new ImageIcon(myDeck.deck.get(14).getFrontCardImage()));
        cardLabel15.setSize(425, 325 );
        p15.add(cardLabel15);
        window15.add(p15);
        window15.setVisible(true);

        JFrame window16 = new JFrame(myDeck.deck.get(15).getName());
        window16.setSize( 450, 330);
        window16.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window16.setVisible(true);
        JPanel p16 = new JPanel() ;
        JLabel cardLabel16 = new JLabel (new ImageIcon(myDeck.deck.get(15).getFrontCardImage()));
        cardLabel16.setSize(425, 325 );
        p16.add(cardLabel16);
        window16.add(p16);
        window16.setVisible(true);

        JFrame window17 = new JFrame(myDeck.deck.get(16).getName());
        window17.setSize( 450, 330);
        window17.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window17.setVisible(true);
        JPanel p17 = new JPanel() ;
        JLabel cardLabel17 = new JLabel (new ImageIcon(myDeck.deck.get(16).getFrontCardImage()));
        cardLabel17.setSize(425, 325 );
        p17.add(cardLabel17);
        window17.add(p17);
        window17.setVisible(true);

        JFrame window18 = new JFrame(myDeck.deck.get(17).getName());
        window18.setSize( 450, 330);
        window18.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window18.setVisible(true);
        JPanel p18 = new JPanel() ;
        JLabel cardLabel18 = new JLabel (new ImageIcon(myDeck.deck.get(17).getFrontCardImage()));
        cardLabel18.setSize(425, 325 );
        p18.add(cardLabel18);
        window18.add(p18);
        window18.setVisible(true);

        JFrame window19 = new JFrame(myDeck.deck.get(18).getName());
        window19.setSize( 450, 330);
        window19.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window19.setVisible(true);
        JPanel p19 = new JPanel() ;
        JLabel cardLabel19 = new JLabel (new ImageIcon(myDeck.deck.get(18).getFrontCardImage()));
        cardLabel19.setSize(425, 325 );
        p19.add(cardLabel19);
        window19.add(p19);
        window19.setVisible(true);

        JFrame window20 = new JFrame(myDeck.deck.get(19).getName());
        window20.setSize( 450, 330);
        window20.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window20.setVisible(true);
        JPanel p20 = new JPanel() ;
        JLabel cardLabel20 = new JLabel (new ImageIcon(myDeck.deck.get(19).getFrontCardImage()));
        cardLabel20.setSize(425, 325 );
        p20.add(cardLabel20);
        window20.add(p20);
        window20.setVisible(true);

        JFrame window21 = new JFrame(myDeck.deck.get(20).getName());
        window21.setSize( 450, 330);
        window21.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window21.setVisible(true);
        JPanel p21 = new JPanel() ;
        JLabel cardLabel21 = new JLabel (new ImageIcon(myDeck.deck.get(20).getFrontCardImage()));
        cardLabel21.setSize(425, 325 );
        p21.add(cardLabel21);
        window21.add(p21);
        window21.setVisible(true);

        JFrame window22 = new JFrame(myDeck.deck.get(21).getName());
        window22.setSize( 450, 330);
        window22.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window22.setVisible(true);
        JPanel p22 = new JPanel() ;
        JLabel cardLabel22 = new JLabel (new ImageIcon(myDeck.deck.get(21).getFrontCardImage()));
        cardLabel22.setSize(425, 325 );
        p22.add(cardLabel22);
        window22.add(p22);
        window22.setVisible(true);

        JFrame window23 = new JFrame(myDeck.deck.get(22).getName());
        window23.setSize( 450, 330);
        window23.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window23.setVisible(true);
        JPanel p23 = new JPanel() ;
        JLabel cardLabel23 = new JLabel (new ImageIcon(myDeck.deck.get(22).getBackCardImage()));
        cardLabel23.setSize(425, 325 );
        p23.add(cardLabel23);
        window23.add(p23);
        window23.setVisible(true);

        JFrame window24 = new JFrame(myDeck.deck.get(23).getName());
        window24.setSize( 450, 330);
        window24.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window24.setVisible(true);
        JPanel p24 = new JPanel() ;
        JLabel cardLabel24 = new JLabel (new ImageIcon(myDeck.deck.get(23).getFrontCardImage()));
        cardLabel24.setSize(425, 325 );
        p24.add(cardLabel24);
        window24.add(p24);
        window24.setVisible(true);

        JFrame window25 = new JFrame(myDeck.deck.get(24).getName());
        window25.setSize( 450, 330);
        window25.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window25.setVisible(true);
        JPanel p25 = new JPanel() ;
        JLabel cardLabel25 = new JLabel (new ImageIcon(myDeck.deck.get(24).getFrontCardImage()));
        cardLabel25.setSize(425, 325 );
        p25.add(cardLabel25);
        window25.add(p25);
        window25.setVisible(true);

        JFrame window26 = new JFrame(myDeck.deck.get(25).getName());
        window26.setSize( 450, 330);
        window26.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window26.setVisible(true);
        JPanel p26 = new JPanel() ;
        JLabel cardLabel26 = new JLabel (new ImageIcon(myDeck.deck.get(25).getFrontCardImage()));
        cardLabel26.setSize(425, 325 );
        p26.add(cardLabel26);
        window26.add(p26);
        window26.setVisible(true);

        JFrame window27 = new JFrame(myDeck.deck.get(26).getName());
        window27.setSize( 450, 330);
        window27.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window27.setVisible(true);
        JPanel p27 = new JPanel() ;
        JLabel cardLabel27 = new JLabel (new ImageIcon(myDeck.deck.get(26).getFrontCardImage()));
        cardLabel27.setSize(425, 325 );
        p27.add(cardLabel27);
        window27.add(p27);
        window27.setVisible(true);

        JFrame window28 = new JFrame(myDeck.deck.get(27).getName());
        window28.setSize( 450, 330);
        window28.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window28.setVisible(true);
        JPanel p28 = new JPanel() ;
        JLabel cardLabel28 = new JLabel (new ImageIcon(myDeck.deck.get(27).getFrontCardImage()));
        cardLabel28.setSize(425, 325 );
        p28.add(cardLabel28);
        window28.add(p28);
        window28.setVisible(true);

        JFrame window29 = new JFrame(myDeck.deck.get(28).getName());
        window29.setSize( 450, 330);
        window29.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window29.setVisible(true);
        JPanel p29 = new JPanel() ;
        JLabel cardLabel29 = new JLabel (new ImageIcon(myDeck.deck.get(28).getFrontCardImage()));
        cardLabel29.setSize(425, 325 );
        p29.add(cardLabel29);
        window29.add(p29);
        window29.setVisible(true);

        JFrame window30 = new JFrame(myDeck.deck.get(29).getName());
        window30.setSize( 450, 330);
        window30.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window30.setVisible(true);
        JPanel p30 = new JPanel() ;
        JLabel cardLabel30 = new JLabel (new ImageIcon(myDeck.deck.get(29).getFrontCardImage()));
        cardLabel30.setSize(425, 325 );
        p30.add(cardLabel30);
        window30.add(p30);
        window30.setVisible(true);

        JFrame window31 = new JFrame(myDeck.deck.get(30).getName());
        window31.setSize( 450, 330);
        window31.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window31.setVisible(true);
        JPanel p31 = new JPanel() ;
        JLabel cardLabel31 = new JLabel (new ImageIcon(myDeck.deck.get(30).getFrontCardImage()));
        cardLabel31.setSize(425, 325 );
        p31.add(cardLabel31);
        window31.add(p31);
        window31.setVisible(true);

        JFrame window32 = new JFrame(myDeck.deck.get(31).getName());
        window32.setSize( 450, 330);
        window32.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window32.setVisible(true);
        JPanel p32 = new JPanel() ;
        JLabel cardLabel32 = new JLabel (new ImageIcon(myDeck.deck.get(31).getFrontCardImage()));
        cardLabel32.setSize(425, 325 );
        p32.add(cardLabel32);
        window32.add(p32);
        window32.setVisible(true);

        JFrame window33 = new JFrame(myDeck.deck.get(32).getName());
        window33.setSize( 450, 330);
        window33.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window33.setVisible(true);
        JPanel p33 = new JPanel() ;
        JLabel cardLabel33 = new JLabel (new ImageIcon(myDeck.deck.get(32).getFrontCardImage()));
        cardLabel33.setSize(425, 325 );
        p33.add(cardLabel33);
        window33.add(p33);
        window33.setVisible(true);

        JFrame window34 = new JFrame(myDeck.deck.get(33).getName());
        window34.setSize( 450, 330);
        window34.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window34.setVisible(true);
        JPanel p34 = new JPanel() ;
        JLabel cardLabel34 = new JLabel (new ImageIcon(myDeck.deck.get(33).getFrontCardImage()));
        cardLabel34.setSize(425, 325 );
        p34.add(cardLabel34);
        window34.add(p34);
        window34.setVisible(true);

        JFrame window35 = new JFrame(myDeck.deck.get(34).getName());
        window35.setSize( 450, 330);
        window35.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window35.setVisible(true);
        JPanel p35 = new JPanel() ;
        JLabel cardLabel35 = new JLabel (new ImageIcon(myDeck.deck.get(34).getFrontCardImage()));
        cardLabel35.setSize(425, 325 );
        p35.add(cardLabel35);
        window35.add(p35);
        window35.setVisible(true);

        JFrame window36 = new JFrame(myDeck.deck.get(35).getName());
        window36.setSize( 450, 330);
        window36.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window36.setVisible(true);
        JPanel p36 = new JPanel() ;
        JLabel cardLabel36 = new JLabel (new ImageIcon(myDeck.deck.get(35).getFrontCardImage()));
        cardLabel36.setSize(425, 325 );
        p36.add(cardLabel36);
        window36.add(p36);
        window36.setVisible(true);

        JFrame window37 = new JFrame(myDeck.deck.get(36).getName());
        window37.setSize( 450, 330);
        window37.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window37.setVisible(true);
        JPanel p37 = new JPanel() ;
        JLabel cardLabel37 = new JLabel (new ImageIcon(myDeck.deck.get(36).getFrontCardImage()));
        cardLabel37.setSize(425, 325 );
        p37.add(cardLabel37);
        window37.add(p37);
        window37.setVisible(true);

        JFrame window38 = new JFrame(myDeck.deck.get(37).getName());
        window38.setSize( 450, 330);
        window38.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window38.setVisible(true);
        JPanel p38 = new JPanel() ;
        JLabel cardLabel38 = new JLabel (new ImageIcon(myDeck.deck.get(37).getFrontCardImage()));
        cardLabel38.setSize(425, 325 );
        p38.add(cardLabel38);
        window38.add(p38);
        window38.setVisible(true);

        JFrame window39 = new JFrame(myDeck.deck.get(38).getName());
        window39.setSize( 450, 330);
        window39.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window39.setVisible(true);
        JPanel p39 = new JPanel() ;
        JLabel cardLabel39 = new JLabel (new ImageIcon(myDeck.deck.get(38).getFrontCardImage()));
        cardLabel39.setSize(425, 325 );
        p39.add(cardLabel39);
        window39.add(p39);
        window39.setVisible(true);

        JFrame window40 = new JFrame(myDeck.deck.get(39).getName());
        window40.setSize( 450, 330);
        window40.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window40.setVisible(true);
        JPanel p40 = new JPanel() ;
        JLabel cardLabel40 = new JLabel (new ImageIcon(myDeck.deck.get(39).getFrontCardImage()));
        cardLabel40.setSize(425, 325 );
        p40.add(cardLabel40);
        window40.add(p40);
        window40.setVisible(true);

        JFrame window41 = new JFrame(myDeck.deck.get(40).getName());
        window41.setSize( 450, 330);
        window41.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window41.setVisible(true);
        JPanel p41 = new JPanel() ;
        JLabel cardLabel41 = new JLabel (new ImageIcon(myDeck.deck.get(40).getFrontCardImage()));
        cardLabel41.setSize(425, 325 );
        p41.add(cardLabel41);
        window41.add(p41);
        window41.setVisible(true);

        JFrame window42 = new JFrame(myDeck.deck.get(41).getName());
        window42.setSize( 450, 330);
        window42.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window42.setVisible(true);
        JPanel p42 = new JPanel() ;
        JLabel cardLabel42 = new JLabel (new ImageIcon(myDeck.deck.get(41).getFrontCardImage()));
        cardLabel42.setSize(425, 325 );
        p42.add(cardLabel42);
        window42.add(p42);
        window42.setVisible(true);


        JFrame window43 = new JFrame(myDeck.deck.get(42).getName());
        window43.setSize( 450, 330);
        window43.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window43.setVisible(true);
        JPanel p43 = new JPanel() ;
        JLabel cardLabel43 = new JLabel (new ImageIcon(myDeck.deck.get(42).getFrontCardImage()));
        cardLabel43.setSize(425, 325 );
        p41.add(cardLabel43);
        window43.add(p43);
        window43.setVisible(true);

        JFrame window44 = new JFrame(myDeck.deck.get(43).getName());
        window44.setSize( 450, 330);
        window44.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window44.setVisible(true);
        JPanel p44 = new JPanel() ;
        JLabel cardLabel44 = new JLabel (new ImageIcon(myDeck.deck.get(43).getFrontCardImage()));
        cardLabel44.setSize(425, 325 );
        p41.add(cardLabel44);
        window44.add(p44);
        window44.setVisible(true);

        JFrame window45 = new JFrame(myDeck.deck.get(44).getName());
        window45.setSize( 450, 330);
        window45.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window45.setVisible(true);
        JPanel p45 = new JPanel() ;
        JLabel cardLabel45 = new JLabel (new ImageIcon(myDeck.deck.get(44).getFrontCardImage()));
        cardLabel45.setSize(425, 325 );
        p41.add(cardLabel45);
        window45.add(p45);
        window45.setVisible(true);

        JFrame window46 = new JFrame(myDeck.deck.get(45).getName());
        window46.setSize( 450, 330);
        window46.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window46.setVisible(true);
        JPanel p46 = new JPanel() ;
        JLabel cardLabel46 = new JLabel (new ImageIcon(myDeck.deck.get(45).getFrontCardImage()));
        cardLabel46.setSize(425, 325 );
        p46.add(cardLabel46);
        window46.add(p46);
        window46.setVisible(true);

        JFrame window47 = new JFrame(myDeck.deck.get(46).getName());
        window47.setSize( 450, 330);
        window47.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window47.setVisible(true);
        JPanel p47 = new JPanel() ;
        JLabel cardLabel47 = new JLabel (new ImageIcon(myDeck.deck.get(46).getFrontCardImage()));
        cardLabel47.setSize(425, 325 );
        p47.add(cardLabel47);
        window47.add(p47);
        window47.setVisible(true);

        JFrame window48 = new JFrame(myDeck.deck.get(47).getName());
        window48.setSize( 450, 330);
        window48.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window48.setVisible(true);
        JPanel p48 = new JPanel() ;
        JLabel cardLabel48 = new JLabel (new ImageIcon(myDeck.deck.get(47).getFrontCardImage()));
        cardLabel48.setSize(425, 325 );
        p48.add(cardLabel48);
        window48.add(p48);
        window48.setVisible(true);

        JFrame window49 = new JFrame(myDeck.deck.get(48).getName());
        window49.setSize( 450, 330);
        window49.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window49.setVisible(true);
        JPanel p49 = new JPanel() ;
        JLabel cardLabel49 = new JLabel (new ImageIcon(myDeck.deck.get(48).getFrontCardImage()));
        cardLabel49.setSize(425, 325 );
        p49.add(cardLabel49);
        window49.add(p49);
        window49.setVisible(true);

        JFrame window50 = new JFrame(myDeck.deck.get(49).getName());
        window50.setSize( 450, 330);
        window50.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window50.setVisible(true);
        JPanel p50 = new JPanel() ;
        JLabel cardLabel50 = new JLabel (new ImageIcon(myDeck.deck.get(49).getFrontCardImage()));
        cardLabel50.setSize(425, 325 );
        p50.add(cardLabel50);
        window50.add(p50);
        window50.setVisible(true);

        JFrame window51 = new JFrame(myDeck.deck.get(50).getName());
        window51.setSize( 450, 330);
        window51.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window51.setVisible(true);
        JPanel p51 = new JPanel() ;
        JLabel cardLabel51 = new JLabel (new ImageIcon(myDeck.deck.get(50).getFrontCardImage()));
        cardLabel51.setSize(425, 325 );
        p51.add(cardLabel51);
        window51.add(p51);
        window51.setVisible(true);

        JFrame window52 = new JFrame(myDeck.deck.get(51).getName());
        window52.setSize( 450, 330);
        window52.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window52.setVisible(true);
        JPanel p52 = new JPanel() ;
        JLabel cardLabel52 = new JLabel (new ImageIcon(myDeck.deck.get(51).getFrontCardImage()));
        cardLabel52.setSize(425, 325 );
        p52.add(cardLabel52);
        window52.add(p52);
        window52.setVisible(true);

        JFrame window53 = new JFrame(myDeck.deck.get(52).getName());
        window53.setSize( 450, 330);
        window53.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window53.setVisible(true);
        JPanel p53 = new JPanel() ;
        JLabel cardLabel53 = new JLabel (new ImageIcon(myDeck.deck.get(52).getFrontCardImage()));
        cardLabel53.setSize(425, 325 );
        p53.add(cardLabel53);
        window53.add(p53);
        window53.setVisible(true);

        JFrame window54 = new JFrame(myDeck.deck.get(53).getName());
        window54.setSize( 450, 330);
        window54.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window54.setVisible(true);
        JPanel p54 = new JPanel() ;
        JLabel cardLabel54 = new JLabel (new ImageIcon(myDeck.deck.get(53).getFrontCardImage()));
        cardLabel54.setSize(425, 325 );
        p54.add(cardLabel54);
        window54.add(p54);
        window54.setVisible(true);

        JFrame window55 = new JFrame(myDeck.deck.get(54).getName());
        window55.setSize( 450, 330);
        window55.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window55.setVisible(true);
        JPanel p55 = new JPanel() ;
        JLabel cardLabel55 = new JLabel (new ImageIcon(myDeck.deck.get(54).getFrontCardImage()));
        cardLabel55.setSize(425, 325 );
        p55.add(cardLabel55);
        window55.add(p55);
        window55.setVisible(true);

        JFrame window56 = new JFrame(myDeck.deck.get(55).getName());
        window56.setSize( 450, 330);
        window56.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window56.setVisible(true);
        JPanel p56 = new JPanel() ;
        JLabel cardLabel56 = new JLabel (new ImageIcon(myDeck.deck.get(55).getFrontCardImage()));
        cardLabel56.setSize(425, 325 );
        p56.add(cardLabel56);
        window56.add(p56);
        window56.setVisible(true);

        JFrame window57 = new JFrame(myDeck.deck.get(56).getName());
        window57.setSize( 450, 330);
        window57.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window57.setVisible(true);
        JPanel p57 = new JPanel() ;
        JLabel cardLabel57 = new JLabel (new ImageIcon(myDeck.deck.get(56).getFrontCardImage()));
        cardLabel57.setSize(425, 325 );
        p57.add(cardLabel57);
        window57.add(p57);
        window57.setVisible(true);

        JFrame window58 = new JFrame(myDeck.deck.get(57).getName());
        window58.setSize( 450, 330);
        window58.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window58.setVisible(true);
        JPanel p58 = new JPanel() ;
        JLabel cardLabel58 = new JLabel (new ImageIcon(myDeck.deck.get(57).getFrontCardImage()));
        cardLabel41.setSize(425, 325 );
        p58.add(cardLabel58);
        window58.add(p41);
        window58.setVisible(true);

        JFrame window59 = new JFrame(myDeck.deck.get(58).getName());
        window59.setSize( 450, 330);
        window59.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window59.setVisible(true);
        JPanel p59 = new JPanel() ;
        JLabel cardLabel59 = new JLabel (new ImageIcon(myDeck.deck.get(58).getFrontCardImage()));
        cardLabel59.setSize(425, 325 );
        p41.add(cardLabel59);
        window59.add(p59);
        window59.setVisible(true);

        JFrame window60 = new JFrame(myDeck.deck.get(59).getName());
        window60.setSize( 450, 330);
        window60.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window60.setVisible(true);
        JPanel p60 = new JPanel() ;
        JLabel cardLabel60 = new JLabel (new ImageIcon(myDeck.deck.get(59).getFrontCardImage()));
        cardLabel60.setSize(425, 325 );
        p60.add(cardLabel60);
        window60.add(p60);
        window60.setVisible(true);

        JFrame window61 = new JFrame(myDeck.deck.get(60).getName());
        window61.setSize( 450, 330);
        window61.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window61.setVisible(true);
        JPanel p61 = new JPanel() ;
        JLabel cardLabel61 = new JLabel (new ImageIcon(myDeck.deck.get(60).getFrontCardImage()));
        cardLabel61.setSize(425, 325 );
        p61.add(cardLabel61);
        window61.add(p61);
        window61.setVisible(true);

        JFrame window62 = new JFrame(myDeck.deck.get(61).getName());
        window62.setSize( 450, 330);
        window62.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window62.setVisible(true);
        JPanel p62 = new JPanel() ;
        JLabel cardLabel62 = new JLabel (new ImageIcon(myDeck.deck.get(61).getFrontCardImage()));
        cardLabel62.setSize(425, 325 );
        p62.add(cardLabel62);
        window62.add(p62);
        window62.setVisible(true);

        JFrame window63 = new JFrame(myDeck.deck.get(62).getName());
        window63.setSize( 450, 330);
        window63.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window63.setVisible(true);
        JPanel p63 = new JPanel() ;
        JLabel cardLabel63 = new JLabel (new ImageIcon(myDeck.deck.get(62).getFrontCardImage()));
        cardLabel63.setSize(425, 325 );
        p63.add(cardLabel63);
        window63.add(p63);
        window63.setVisible(true);

        JFrame window64 = new JFrame(myDeck.deck.get(63).getName());
        window64.setSize( 450, 330);
        window64.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window64.setVisible(true);
        JPanel p64 = new JPanel() ;
        JLabel cardLabel64 = new JLabel (new ImageIcon(myDeck.deck.get(63).getFrontCardImage()));
        cardLabel64.setSize(425, 325 );
        p64.add(cardLabel64);
        window64.add(p64);
        window64.setVisible(true);

        JFrame window65 = new JFrame(myDeck.deck.get(64).getName());
        window65.setSize( 450, 330);
        window65.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window65.setVisible(true);
        JPanel p65 = new JPanel() ;
        JLabel cardLabel65 = new JLabel (new ImageIcon(myDeck.deck.get(64).getFrontCardImage()));
        cardLabel65.setSize(425, 325 );
        p65.add(cardLabel65);
        window65.add(p65);
        window65.setVisible(true);

        JFrame window66 = new JFrame(myDeck.deck.get(65).getName());
        window66.setSize( 450, 330);
        window66.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window66.setVisible(true);
        JPanel p66 = new JPanel() ;
        JLabel cardLabel66 = new JLabel (new ImageIcon(myDeck.deck.get(65).getFrontCardImage()));
        cardLabel66.setSize(425, 325 );
        p66.add(cardLabel66);
        window66.add(p66);
        window66.setVisible(true);

        JFrame window67 = new JFrame(myDeck.deck.get(66).getName());
        window67.setSize( 450, 330);
        window67.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window67.setVisible(true);
        JPanel p67 = new JPanel() ;
        JLabel cardLabel67 = new JLabel (new ImageIcon(myDeck.deck.get(66).getFrontCardImage()));
        cardLabel67.setSize(425, 325 );
        p67.add(cardLabel67);
        window67.add(p67);
        window67.setVisible(true);


        JFrame window68 = new JFrame(myDeck.deck.get(67).getName());
        window68.setSize( 450, 330);
        window68.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window68.setVisible(true);
        JPanel p68 = new JPanel() ;
        JLabel cardLabel68 = new JLabel (new ImageIcon(myDeck.deck.get(67).getFrontCardImage()));
        cardLabel68.setSize(425, 325 );
        p68.add(cardLabel68);
        window68.add(p68);
        window68.setVisible(true);












    }
}
