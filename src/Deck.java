import java.io.File;
import java.io.IOException;
import java.util.ArrayList ;
import javax.imageio.ImageIO;

public class Deck {
    //instance variables
    protected ArrayList<Card> deck ;

    public Deck() throws IOException {
        this.deck = new ArrayList<Card>() ;
        createCards() ;
    }

    public void createCards() throws IOException {
        IlluminatiCard assassins = new IlluminatiCard("The Society of Assassins" , ImageIO.read(new File("Assassins.png") ) , "Illuminati" , "+4 on any attempt to neutralize any group" , 8, 8, 8, true, true, true, true );
        IlluminatiCard network = new IlluminatiCard("The Network" , ImageIO.read(new File("Network.png") ) , "Illuminati" , "Turns over two cards at beginning of turn" , 7, 7, 9, true, true, true, true );
        IlluminatiCard discordian = new IlluminatiCard("The Discordian Society" , ImageIO.read(new File("Discordian.png") ) , "Illuminati" , "+4 on any attempt to control Weird groups\nimmune to any attacks from Government or Straight groups" , 8 , 8, 8, true, true, true, true );
        IlluminatiCard UFO = new IlluminatiCard("The UFOs" , ImageIO.read(new File("UFO.png") ) , "Illuminati" , "Illuminati group may participate in two attacks per turn" , 6, 6, 8, true, true, true, true );
        IlluminatiCard cthulhu = new IlluminatiCard("The Servants of Cthulhu" , ImageIO.read(new File("Cthulhu.png") ) , "Illuminati" , "+2 on any attempt to destroy any group" , 9, 9, 7, true, true, true, true );
        IlluminatiCard gnomes = new IlluminatiCard("The Gnomes of Zurich" , ImageIO.read(new File("Gnomes.png") ) , "Illuminati" , "May move money freely at end of turn" , 7, 7, 12, true, true, true, true );
        IlluminatiCard bavarian = new IlluminatiCard("The Bavarian Illuminati" , ImageIO.read(new File("Bavarian.png") ) , "Illuminati" , "May take one privileged attack each turn at a cost of 5MB" , 10, 10, 9, true, true, true, true );
        IlluminatiCard bermudaTriangle = new IlluminatiCard("The Bermuda Triangle" , ImageIO.read(new File("BermudaTriangle.png") ) , "Illuminati" , "May reorganize groups freely at end of turn" , 8, 8, 9, true, true, true, true );

        this.deck.add(assassins);
        this.deck.add(network);
        this.deck.add(discordian);
        this.deck.add(UFO);
        this.deck.add(cthulhu);
        this.deck.add(gnomes);
        this.deck.add(bavarian);
        this.deck.add(bermudaTriangle);

    }
}
