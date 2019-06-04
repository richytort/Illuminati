package Game;
import Cards.Card;
import Cards.IlluminatiCard;
import Cards.SpecialCard;
import Cards.otherGroups;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList ;
import javax.imageio.ImageIO;

public class Deck {
    //instance variables
    public ArrayList<Card> deck ;

    public Deck() throws IOException {
        this.deck = new ArrayList<Card>() ;
        createCards() ;
    }

    public void createCards() throws IOException {
        IlluminatiCard temp = new IlluminatiCard("The Society of Assassins", ImageIO.read(new File("Assassins.png")), ImageIO.read(new File("Back.png")) ,"Illuminati", "+4 on any attempt to neutralize any group", 8, 8, 8, true, true, true, true);
        this.deck.add(temp);
        temp = new IlluminatiCard("The Network" , ImageIO.read(new File("Network.png") ) , ImageIO.read(new File("Back.png")) ,"Illuminati" , "Turns over two cards at beginning of turn" , 7, 7, 9, true, true, true, true );
        this.deck.add(temp);
        temp = new IlluminatiCard("The Discordian Society" , ImageIO.read(new File("Discordian.png") ) , ImageIO.read(new File("Back.png")) ,"Illuminati" , "+4 on any attempt to control Weird groups\nimmune to any attacks from Government or Straight groups" , 8 , 8, 8, true, true, true, true );
        this.deck.add(temp);
        temp = new IlluminatiCard("The UFOs" , ImageIO.read(new File("UFO.png") ) , ImageIO.read(new File("Back.png")) ,"Illuminati" , "Illuminati group may participate in two attacks per turn" , 6, 6, 8, true, true, true, true );
        this.deck.add(temp);
        temp = new IlluminatiCard("The Servants of Cthulhu" , ImageIO.read(new File("Cthulhu.png") ) , ImageIO.read(new File("Back.png")) ,"Illuminati" , "+2 on any attempt to destroy any group" , 9, 9, 7, true, true, true, true );
        this.deck.add(temp);
        temp = new IlluminatiCard("The Gnomes of Zurich" , ImageIO.read(new File("Gnomes.png") ) , ImageIO.read(new File("Back.png")) ,"Illuminati" , "May move money freely at end of turn" , 7, 7, 12, true, true, true, true );
        this.deck.add(temp);
        temp = new IlluminatiCard("The Bavarian Illuminati" , ImageIO.read(new File("Bavarian.png") ) , ImageIO.read(new File("Back.png")) ,"Illuminati" , "May take one privileged attack each turn at a cost of 5MB" , 10, 10, 9, true, true, true, true );
        this.deck.add(temp);
        temp = new IlluminatiCard("The Bermuda Triangle" , ImageIO.read(new File("BermudaTriangle.png") ) , ImageIO.read(new File("Back.png")) ,"Illuminati" , "May reorganize groups freely at end of turn" , 8, 8, 9, true, true, true, true );
        this.deck.add(temp);



        SpecialCard sTemp = new SpecialCard("Assassination" , ImageIO.read(new File( "Assassination.png")), ImageIO.read(new File("RegBack.png")) ,"Play this card immediately after the dice are rolled on any attempt (by any plare) to destroy, control, or neutralize. That roll is immediately changed, retroactivity, to a 2.") ;
        this.deck.add(sTemp);
        sTemp = new SpecialCard("Bribery" , ImageIO.read(new File("Bribery.png")) , ImageIO.read(new File("RegBack.png")),"Play this card during your turn to automatically take control of any one uncontrolled group. Playing this card counts as an action." ) ;
        this.deck.add(sTemp);
        sTemp = new SpecialCard( "Computer Espionage" , ImageIO.read(new File("ComputerEspionage.png")) , ImageIO.read(new File("RegBack.png")),"Play this card at any time to either count the money on any one group card OR examie all of one player's special cards") ;
        this.deck.add(sTemp);
        sTemp = new SpecialCard( "Deep Agent" , ImageIO.read( new File("DeepAgent.png")) , ImageIO.read(new File("RegBack.png")),"Play this card after privilege has been invoked. The privilege is totally abolished. That attack cannot be made privileged. ");
        this.deck.add(sTemp);
        sTemp = new SpecialCard( "Interference" , ImageIO.read( new File("Interference1.png")) , ImageIO.read(new File("RegBack.png")),"You may interfere with one privileged attack. No other players may interfere.") ;
        this.deck.add(sTemp);
        sTemp = new SpecialCard("Interference" , ImageIO.read( new File("Interference2.png")) , ImageIO.read(new File("RegBack.png")),"You may interfere with one privileged attack. No other players may interfere.") ;
        this.deck.add(sTemp);
        sTemp = new SpecialCard("Market Manipulation" , ImageIO.read(new File( "MarketManipulation.png")) , ImageIO.read(new File("RegBack.png")),"Play this card during your income phase to double all your groups' incomes, for that turn only.\nThis card does not allow the I.R.S. to collect twice, or require the Post Office to pay twice.");
        this.deck.add(sTemp);
        sTemp = new SpecialCard("Media Campaign" , ImageIO.read( new File ("MediaCampaign.png")) , ImageIO.read(new File("RegBack.png")),"Play this card at any time to revive a group from the \"dead\" pile. It becomes uncontrolled. (If the Servants of Cthulhu destroyed the group, it still counts as a destroyed group for victory. If they destroy it again, it counts again!)"  );
        this.deck.add(sTemp);
        sTemp = new SpecialCard("Murphy's Law", ImageIO.read( new File ("MurphysLaw.png")), ImageIO.read(new File("RegBack.png")),"Play this card immediately after the dice are rolled on any attempt (by any player)to destroy, control, or neutralize that roll is immediately changed, retroactively, to a 12.");
        this.deck.add(sTemp);
        sTemp = new SpecialCard("Secrets Man Was Not Meant To Know" ,  ImageIO.read(new File("SecretsManWasNotMeantToKnow.png")) , ImageIO.read(new File("RegBack.png")),"Play this card when any other special card is played, for ANY purpose. That card is immediately neutralized, it has no effect. Both cards are disabled");
        this.deck.add(sTemp);
        sTemp = new SpecialCard( "Senate Investigating Committe" , ImageIO.read(new File("SenateInvestigatingCommittee.png")), ImageIO.read(new File("RegBack.png")),"Play this card at the beginning of any other player's turn. That player loses his turn completely.") ;
        this.deck.add(sTemp);
        sTemp = new SpecialCard("Slush Fund" , ImageIO.read( new File("SlushFund.png")) , ImageIO.read(new File("RegBack.png")),"Exchange this card, at any time, for 15MB to be placed in your illuminati treasury.");
        this.deck.add(sTemp);
        sTemp = new SpecialCard("Swiss Bank Account" , ImageIO.read( new File("SwissBankAccount.png")), ImageIO.read(new File("RegBack.png")),"Exchange this card, at any time, for 25MB to be placed in your illuminati treaury" );
        this.deck.add(sTemp);
        sTemp = new SpecialCard("Whispering Campaign" , ImageIO.read( new File("WhisperingCampaign.png")) , ImageIO.read(new File("RegBack.png")),"You may destroy a single group with Power 0. Roll attacking power vs. defending resistance, but a successful attack destroys the target.");
        this.deck.add(sTemp);
        sTemp = new SpecialCard("White Collar Crime" , ImageIO.read(new File("WhiteCollarCrime.png")) , ImageIO.read(new File("RegBack.png")),"Play this card at any time to reorganize all your money freely -- that is, any amount(s) may be moved between any groups. You also get an extra 5MB which may be placed anywere");
        this.deck.add(sTemp);

        ArrayList<String> align = new ArrayList<String>();
        align.add("Violent");
        align.add("Weird");
        otherGroups  oTemp =  new otherGroups("American Autoduel Association",ImageIO.read(new File("AmericanAutoDuelAssociation.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups","none",1,0,5,1,true,false,false,true,false,false,align);
        this.deck.add(oTemp);
        ArrayList<String> align2 = new ArrayList<String>();
        align2.add("Libera;");
        oTemp =  new otherGroups("Anti-Nuclear Activists",ImageIO.read(new File("AntiNuclearActivist.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups","+2 on any attempt to destroy Nuclear Power Companies.",2,0,5,1,true,false,false,false,true,false,align2);
        this.deck.add(oTemp);
        ArrayList<String> align3 = new ArrayList<String>();
        align3.add("Peaceful");
        align3.add("Liberal");
        oTemp =  new otherGroups("Antiwar Activists",ImageIO.read(new File("AntiwarActivist.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups","none",0,0,3,1,true,false,false,false,false,false,align3);
        this.deck.add(oTemp);
        ArrayList<String> align4 = new ArrayList<String>();
        align4.add("Liberal");
        align4.add("Straight");
        oTemp =  new otherGroups("Big Media",ImageIO.read(new File("bigMedia.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups","none",4,3,6,3,false,true,true,false,true,true,align4);
        this.deck.add(oTemp);
        ArrayList<String> align5 = new ArrayList<String>();
        align5.add("Straight");
        align5.add("Peaceful");
        oTemp =  new otherGroups("Boy Sprouts",ImageIO.read(new File("boySprouts.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups","none",0,0,3,1,true,false,false,false,false,false,align5);
        this.deck.add(oTemp);
        ArrayList<String> align6 = new ArrayList<String>();
        align6.add("Liberal");
        align6.add("Weird");
        align6.add("Government");
        oTemp =  new otherGroups("California",ImageIO.read(new File("california.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups","none",5,0,4,5,true,false,false,false,true,true,align6);
        this.deck.add(oTemp);


    }
}
