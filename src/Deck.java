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

        SpecialCard assassinationCard = new SpecialCard("Assassination" , ImageIO.read(new File( "Assassination.png")), "Play this card immediately after the dice are rolled on any attempt (by any plare) to destroy, control, or neutralize. That roll is immediately changed, retroactivity, to a 2.") ;
        SpecialCard briberyCard = new SpecialCard("Bribery" , ImageIO.read(new File("Bribery.png")) , "Play this card during your turn to automatically take control of any one uncontrolled group. Playing this card counts as an action." ) ;
        SpecialCard computerEspionageCard = new SpecialCard( "Computer Espionage" , ImageIO.read(new File("ComputerEspionage.png")) , "Play this card at any time to either count the money on any one group card OR examie all of one player's special cards") ;
        SpecialCard deepAgentCard = new SpecialCard ( "Deep Agent" , ImageIO.read( new File("DeepAgent.png")) , "Play this card after privilege has been invoked. The privilege is totally abolished. That attack cannot be made privileged. ");
        SpecialCard interferenceCard1 = new SpecialCard( "Interference" , ImageIO.read( new File("Interference1.png")) , "You may interfere with one privileged attack. No other players may interfere.") ;
        SpecialCard interferenceCard2 = new SpecialCard ("Interference" , ImageIO.read( new File("Interference2.png")) , "You may interfere with one privileged attack. No other players may interfere.") ;
        SpecialCard marketManipulationCard = new SpecialCard ("Market Manipulation" , ImageIO.read(new File( "MarketManipulation.png")) ,"Play this card during your income phase to double all your groups' incomes, for that turn only.\nThis card does not allow the I.R.S. to collect twice, or require the Post Office to pay twice.");
        SpecialCard mediaCampaignCard = new SpecialCard ("Media Campaign" , ImageIO.read( new File ("MediaCampaign.png")) , "Play this card at any time to revive a group from the \"dead\" pile. It becomes uncontrolled. (If the Servants of Cthulhu destroyed the group, it still counts as a destroyed group for victory. If they destroy it again, it counts again!)"  );
        SpecialCard murphysLawCard = new SpecialCard ("Murphy's Law", ImageIO.read( new File ("MurphysLaw.png")), "Play this card immediately after the dice are rolled on any attempt (by any player)to destroy, control, or neutralize that roll is immediately changed, retroactively, to a 12.");
        SpecialCard secretsManWasNotMeantToKnowCard = new SpecialCard ("Secrets Man Was Not Meant To Know" ,  ImageIO.read(new File("SecretsManWasNotMeantToKnow.png")) , "Play this card when any other special card is played, for ANY purpose. That card is immediately neutralized, it has no effect. Both cards are disabled");
        SpecialCard senateInvestigatingCard = new SpecialCard( "Senate Investigating Committe" , ImageIO.read(new File("SenateInvestigatingCommittee.png")), "Play this card at the beginning of any other player's turn. That player loses his turn completely.") ;
        SpecialCard slushFundCard = new SpecialCard ("Slush Fund" , ImageIO.read( new File("SlushFund.png")) , "Exchange this card, at any time, for 15MB to be placed in your illuminati treasury.");
        SpecialCard swissBankAccountCard = new SpecialCard("Swiss Bank Account" , ImageIO.read( new File("SwissBankAccount.png")), "Exchange this card, at any time, for 25MB to be placed in your illuminati treaury" );
        SpecialCard whisperingCampaignCard = new SpecialCard("Whispering Campaign" , ImageIO.read( new File("WhisperingCampaign.png")) , "You may destroy a single group with Power 0. Roll attacking power vs. defending resistance, but a successful attack destroys the target.");
        SpecialCard whiteCollarCrime = new SpecialCard ("White Collar Crime" , ImageIO.read(new File("WhiteCollarCrime.png")) , "Play this card at any time to reorganize all your money freely -- that is, any amount(s) may be moved between any groups. You also get an extra 5MB which may be placed anywere");

        this.deck.add(assassins);
        this.deck.add(network);
        this.deck.add(discordian);
        this.deck.add(UFO);
        this.deck.add(cthulhu);
        this.deck.add(gnomes);
        this.deck.add(bavarian);
        this.deck.add(bermudaTriangle);
        this.deck.add(assassinationCard);
        this.deck.add(briberyCard);
        this.deck.add(computerEspionageCard);
        this.deck.add(deepAgentCard);
        this.deck.add(interferenceCard1);
        this.deck.add(interferenceCard2);
        this.deck.add(marketManipulationCard);

        this.deck.add(mediaCampaignCard);

        this.deck.add(murphysLawCard);
        this.deck.add(secretsManWasNotMeantToKnowCard);
        this.deck.add(senateInvestigatingCard);
        this.deck.add(slushFundCard);
        this.deck.add(swissBankAccountCard);
        this.deck.add(whisperingCampaignCard);
        this.deck.add(whiteCollarCrime);

    }
}
