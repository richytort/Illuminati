package Game;
import Cards.Card;
import Cards.IlluminatiCard;
import Cards.SpecialCard;
import Cards.otherGroups;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList ;
import java.util.Collections;
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
        ArrayList<String> align7 = new ArrayList<String>();
        align7.add("Liberal");
        oTemp =  new otherGroups("CFL-AIO",ImageIO.read(new File("CFLAio.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups","none",6,0,5,3,false,true,true,false,true,true,align7);
        this.deck.add(oTemp);
        ArrayList<String> align8 = new ArrayList<String>();
        align8.add("Communist");
        oTemp =  new otherGroups("Chinese Campaign Donors",ImageIO.read(new File("chineseCampaignDonors.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups","Treat this group as Government when it attempts to control a Government group.",3,0,2,3,false,false,true,false,true,true,align8);
        this.deck.add(oTemp);
        ArrayList<String> align9 = new ArrayList<String>();
        align9.add("Government");
        align9.add("Violent");
        oTemp =  new otherGroups("CIA",ImageIO.read(new File("CIA.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups","none",6,4,5,0,false,true,true,false,true,true,align9);
        this.deck.add(oTemp);
        ArrayList<String> align10 = new ArrayList<String>();
        align10.add("Violent");
        align10.add("Communist");
        align10.add("Criminal");
        oTemp =  new otherGroups("Clone Arrangers",ImageIO.read(new File("CloneArragers.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups"," +3 on any attempt to destroy any group",6,2,6,1,true,false,false,true,false,true,align10);
        this.deck.add(oTemp);
        ArrayList<String> align11 = new ArrayList<String>();
        align10.add("Weird");
        align10.add("Violent");
        oTemp =  new otherGroups("Comic Book",ImageIO.read(new File("ComicBooks.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups"," none",1,0,1,2,true,false,false,false,true,false,align11);
        this.deck.add(oTemp);
        ArrayList<String> align12 = new ArrayList<String>();
        align12.add("Conservative");
        align12.add("Straight");
        oTemp =  new otherGroups("Congressional Wives",ImageIO.read(new File("CongressionalWives.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups","none",1,0,4,1,true,false,false,true,false,false,align12);
        this.deck.add(oTemp);
        ArrayList<String> align13 = new ArrayList<String>();
        align13.add("Straight");
        oTemp =  new otherGroups("Convenience Stores",ImageIO.read(new File("ConvenienceStore.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups","none",1,0,4,3,true,false,false,false,false,true,align13);
        this.deck.add(oTemp);
        ArrayList<String> align14 = new ArrayList<String>();
        align10.add("Peaceful");
        oTemp =  new otherGroups("Copy Shops",ImageIO.read(new File("copyShops.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups","none",1,0,3,4,false,true,true,false,false,false,align14);
        this.deck.add(oTemp);
        ArrayList<String> align15 = new ArrayList<String>();
        align15.add("Violent");
        align15.add("Weird");
        oTemp =  new otherGroups("Cycle Gangs",ImageIO.read(new File("cycleGang.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups"," +2 on any attempt to destroy any group",0,0,4,0,true,false,false,false,false,false,align15);
        this.deck.add(oTemp);
        ArrayList<String> align16 = new ArrayList<String>();
        align16.add("Liberal");
        oTemp =  new otherGroups("Democrats",ImageIO.read(new File("democrats.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups"," none",5,0,4,3,false,true,true,false,false,true,align16);
        this.deck.add(oTemp);
        ArrayList<String> align17 = new ArrayList<String>();
        align17.add("Liberal");
        align17.add("Violent");
        align17.add("Communist");
        oTemp =  new otherGroups("Eco-Guerrillas",ImageIO.read(new File("eco-Guerillas.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups"," none",0,0,6,1,false,false,true,false,false,false,align17);
        this.deck.add(oTemp);
        ArrayList<String> align18 = new ArrayList<String>();
        oTemp =  new otherGroups("Empty Vee",ImageIO.read(new File("empty-Vee.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups","none",3,0,3,4,false,true,true,false,false,true,align18);
        this.deck.add(oTemp);
        ArrayList<String> align19 = new ArrayList<String>();
        align19.add("Violent");
        align19.add("Weird");
        oTemp =  new otherGroups("Evil Geniuses for a Better Tomorrow",ImageIO.read(new File("evilGeniusForABetterTomorrow.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups"," +4 for any attempt to control, neutralized, or destroy the Orbital Mind Control Laser ",0,2,6,3,
                false,false,true,false,false,false, align19);
        this.deck.add(oTemp);
        ArrayList<String> align20 = new ArrayList<String>();
        align20.add("Straight");
        oTemp =  new otherGroups("Fast Food Chains",ImageIO.read(new File("fastFoodChains.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups","none",2,0,4,3,true,false,false,false,false,true,align20);
        this.deck.add(oTemp);
        ArrayList<String> align21 = new ArrayList<String>();
        align21.add("Government");
        align21.add("Straight");
        oTemp =  new otherGroups("F.B.I",ImageIO.read(new File("FBI.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups","none",4,2,6,1,false,false,true,false,true,true,align21);
        this.deck.add(oTemp);
        ArrayList<String> align22 = new ArrayList<String>();
        align22.add("Government");
        oTemp =  new otherGroups("Federal Reserve",ImageIO.read(new File("federalReserve.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups","when it transfer money, that money can go to any group in the same power structure",
                5,3,7,6,true,false,false,true,true,false,align22);
        this.deck.add(oTemp);
        ArrayList<String> align23 = new ArrayList<String>();
        align23.add("Liberal");
        oTemp =  new otherGroups("Feminism",ImageIO.read(new File("feminist.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups","+3 on any attempt to control any Liberal Group.",2,4,4,3,
                true,false,false,false,false,true,align23);
        this.deck.add(oTemp);
        ArrayList<String> align24 = new ArrayList<String>();
        align24.add("Communist");
        align24.add("Fanatic");
        oTemp =  new otherGroups("Fiendish Fluoridators",ImageIO.read(new File("fiendishFluoridators.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups"," none",3,0,5,1,
                true,false,false,true,false,false,align24);
        this.deck.add(oTemp);
        ArrayList<String> align25 = new ArrayList<String>();
        align25.add("Weird");
        align25.add("Conservative");
        oTemp =  new otherGroups("Flat Earthers",ImageIO.read(new File("flatEarthers.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups"," none",1,0,2,1,false,true,true,false,false,false,align25);
        this.deck.add(oTemp);
        ArrayList<String> align26 = new ArrayList<String>();
        align26.add("Peaceful");
        oTemp =  new otherGroups("Fnord Motor Company",ImageIO.read(new File("fnordMotorCompany.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups"," none",2,0,4,2,true,false,false,true,false,false, align26);
        this.deck.add(oTemp);
        ArrayList<String> align27 = new ArrayList<String>();
        align27.add("Conservative");
        oTemp =  new otherGroups("Fraternal Orders",ImageIO.read(new File("fraternalOrders.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups"," none",3,0,5,2,false,false,true,false,true,false,align27);
        this.deck.add(oTemp);
        ArrayList<String> align28 = new ArrayList<String>();
        align28.add("Liberal");
        oTemp =  new otherGroups("Girlie Magazines",ImageIO.read(new File("girlieMagazines.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups"," none",2,0,2,3,false,false,true,false,false,true,align28);
        this.deck.add(oTemp);
        ArrayList<String> align29 = new ArrayList<String>();
        align29.add("Peaceful");
        align29.add("Fanatic");
        oTemp =  new otherGroups("Goldfish Fanciers",ImageIO.read(new File("goldfishFanciers.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups"," none",0,0,4,1,
                true,false,false,false,false,false,align29);
        this.deck.add(oTemp);
        ArrayList<String> align30 = new ArrayList<String>();
        align30.add("Conservative");
        align30.add("Violent");
        oTemp =  new otherGroups("Gun Lobby",ImageIO.read(new File("gunLobby.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups","Normal resistance 3; against any Liberal, Communist, or Weird group, resistance 10.",1,0,3,1,
                false,true,true,false,false,true,align30);
        this.deck.add(oTemp);
        ArrayList<String> align31 = new ArrayList<String>();
        align31.add("Weird");
        align31.add("Fanatic");
        oTemp =  new otherGroups("Hackers",ImageIO.read(new File("hackers.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups","+3 on any attempt to neutralize any group.",1,1,4,2,
                false,false,true,false,true,false,align31);
        this.deck.add(oTemp);
        ArrayList<String> align32 = new ArrayList<String>();
        align32.add("Liberal");
        oTemp =  new otherGroups("Health Food Stores",ImageIO.read(new File("healthFoodStores.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups"," +2 on any attempt to control Anti-Nuclear Activists",1,0,3,2,
                true,false,false,false,false,true,align32);
        this.deck.add(oTemp);
        ArrayList<String> align33 = new ArrayList<String>();
        align33.add("Liberal");
        oTemp =  new otherGroups("Hollywood",ImageIO.read(new File("hollywood.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups"," none",5,0,4,3,
                true,false,false,false,false,true,align33);
        this.deck.add(oTemp);
        ArrayList<String> align34 = new ArrayList<String>();
        align34.add("Weird");
        align34.add("Fanatic");
        oTemp =  new otherGroups("Intellectuals",ImageIO.read(new File("intellectuals.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups"," none",0,0,3,1,
                true,false,false,false,false,false,align34);
        this.deck.add(oTemp);
        ArrayList<String> align35 = new ArrayList<String>();
        align35.add("Criminal");
        oTemp =  new otherGroups("International Cocaine Smugglers",ImageIO.read(new File("internationalCocaineSmugglers.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups"," +4 on any attempt tp control Punk Rockers, Cycle Gangs, or Hollywood",3,0,5,5,
                true,false,false,true,true,true,align35);
        this.deck.add(oTemp);
        ArrayList<String> align36 = new ArrayList<String>();
        align36.add("Communist");
        oTemp =  new otherGroups("International Communist Conspiracy",ImageIO.read(new File("internationCommunistConspiracy.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups","+3 on any attempt to control any Communist group.",7,0,8,6,
                false,true,true,false,true,true,align36);
        this.deck.add(oTemp);
        ArrayList<String> align37 = new ArrayList<String>();
        align37.add("Criminal");
        align37.add("Government");
        oTemp =  new otherGroups("I.R.S",ImageIO.read(new File("IRS.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups","Owning player may tax each opponent 2MB on his own income phase. Tax may come from any group. If a player has no money, he owes no tax",
                5,3,5,2,
                false,false,true,false,true,true,align37);
        this.deck.add(oTemp);
        ArrayList<String> align38 = new ArrayList<String>();
        align38.add("Criminal");
        oTemp =  new otherGroups("Junk Mail",ImageIO.read(new File("junkMail.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups","+4 on any attempt to control the Post Office",1,0,3,2,
                false,false,true,false,true,false,align38);
        this.deck.add(oTemp);
        ArrayList<String> align39 = new ArrayList<String>();
        align39.add("Communist");
        align39.add("Violent");
        oTemp =  new otherGroups("KGB",ImageIO.read(new File("KGB.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups","+2 on any attempt to destroy any group.",2,2,6,0,
                false,false,true,false,false,true,align39);
        this.deck.add(oTemp);
        ArrayList<String> align40 = new ArrayList<String>();
        align40.add("Conservative");
        align40.add("Violent");
        oTemp =  new otherGroups("KKK",ImageIO.read(new File("KKK.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups"," none",2,0,5,1,
                false,false,true,false,false,true,align40);
        this.deck.add(oTemp);
        ArrayList<String> align41 = new ArrayList<String>();
        align41.add("Weird");
        oTemp =  new otherGroups("L-4 Society",ImageIO.read(new File("L4Society.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups","+4 for direct control, neutralization or destruction of Orbital Mind Control Laser.",1,0,2,0,
                false,true,true,false,false,false,align41);
        this.deck.add(oTemp);
        ArrayList<String> align42 = new ArrayList<String>();
        align42.add("Fanatic");
        oTemp =  new otherGroups("Libertarians",ImageIO.read(new File("libertarians.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups"," none",1,0,4,1,
                true,false,false,false,true,false,align42);
        this.deck.add(oTemp);
        ArrayList<String> align43 = new ArrayList<String>();
        align43.add("Criminal");
        align43.add("Violent");
        oTemp =  new otherGroups("Loan Sharks",ImageIO.read(new File("loanShark.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups"," none",5,0,5,6,
                true,false,false,true,false,false,align43);
        this.deck.add(oTemp);
        ArrayList<String> align44 = new ArrayList<String>();
        align44.add("Conservative");
        align44.add("Straight");
        align44.add("Violent");
        oTemp =  new otherGroups("Local Police Departments",ImageIO.read(new File("LocalPoliceDeparment.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups"," none",0,0,4,1,
                true,false,false,false,false,false,align44);
        this.deck.add(oTemp);
        ArrayList<String> align45 = new ArrayList<String>();
        oTemp =  new otherGroups("Madison Avenue",ImageIO.read(new File("madisonAvenue.png")) , ImageIO.read(new File("RegBack.png")),
                "other groups","+5 on any attempt to control Big Media or Empty VEE",3,3,3,2,
                false,true,true,false,true,false,align45);
        this.deck.add(oTemp);

        this.deck.add(oTemp);
        ArrayList<String> align46 = new ArrayList<String>();
        align46.add("Criminal");
        align46.add("Violent");
        oTemp = new otherGroups( "Mafia", ImageIO.read(new File( "Madia.png")), ImageIO.read(new File ("RegBack.png" )), "other groups", "+3 for direct control of any criminal group",
                7, 0, 7, 6, false, true, true, false, true, true, align46);

        this.deck.add(oTemp);
        ArrayList<String> align47 = new ArrayList<String>();
        oTemp= new otherGroups("Men In Black", ImageIO.read(new File("MenInBlack.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "none",
                0, 2, 6, 1, true, false, false, false, false, false, align47);

        this.deck.add(oTemp);
        ArrayList<String> align48 = new ArrayList<String>();
        oTemp= new otherGroups("Militia", ImageIO.read(new File( "Militia.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "+6 on any attempt to destroy any communist group",
                2, 0, 4, 2, false,true, true, false, true, false, align48);

        this.deck.add(oTemp);
        ArrayList<String> align49 = new ArrayList<String>();
        align49.add("Peaceful");
        align49.add("Fanatic");
        oTemp = new otherGroups ("Moonies", ImageIO.read(new File( "Moonies.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "none",
                2, 0, 4, 3, true, false, false, false, true, false, align49);

        this.deck.add(oTemp);
        ArrayList<String> align50 = new ArrayList<String>();
        align50.add("Conservative");
        align50.add("Straight");
        align50.add("Fanatic");
        oTemp= new otherGroups("Moral Minority", ImageIO.read(new File("MoralMinority.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "none",
                2, 0, 1, 2, false, false, true, false, false, true,align50);


        this.deck.add(oTemp);
        ArrayList<String> align51 = new ArrayList<String>();
        align51.add("Straight");
        align51.add("Peaceful");
        oTemp= new otherGroups("Morticians", ImageIO.read(new File("Morticians.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "none",
                0, 0, 4, 1, false, false, true, false, false, false,align51);

        this.deck.add(oTemp);
        ArrayList<String> align52 = new ArrayList<String>();
        oTemp= new otherGroups("Multinational Oil Companies", ImageIO.read(new File("MultinationalOilCompanies.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "none",
                6, 0, 4, 8, true, false, false, true, false, false,align52);



        this.deck.add(oTemp);
        ArrayList<String> align53 = new ArrayList<String>();
        align53.add("Conservative");
        align53.add("Fanatic");
        oTemp= new otherGroups("Nephews of God", ImageIO.read(new File("NephewsOfGod.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "none",
                0, 0, 4, 2, false, false, true, false, false, false,align53);

        this.deck.add(oTemp);
        ArrayList<String> align54 = new ArrayList<String>();
        align54.add("Violent");
        align54.add("Criminal");
        align54.add("Government");
        oTemp= new otherGroups("New York", ImageIO.read(new File("NewYork.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "none",
                7, 0, 8, 3, false, true, true, false, true, true,align54);


        this.deck.add(oTemp);
        ArrayList<String> align55 = new ArrayList<String>();
        align55.add("Conservative");
        oTemp= new otherGroups("Nuclear Power Companies", ImageIO.read(new File("NuclearPowerCompanies.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "none",
                4, 0, 4, 3, false, true, true, false, false, false,align55);

        this.deck.add(oTemp);
        ArrayList<String> align56 = new ArrayList<String>();
        align56.add("Communists");
        oTemp= new otherGroups("Orbital Mind Control Lasers", ImageIO.read(new File("OrbitalMindControlLasers.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "on his turn, owner can add, remove, or reverse an alignment of any one group in play; change lasts for that turn only",
                4, 2, 5, 0, true, false, false, true, true, false,align56);

        this.deck.add(oTemp);
        ArrayList<String> align57 = new ArrayList<String>();
        align57.add("Conservative");
        align57.add("Straight");
        align57.add("Peaceful");
        oTemp= new otherGroups("Parent/Teacher Agglomeration", ImageIO.read(new File("ParentTeacherAgglomeration.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "none",
                0, 0, 5, 1, true, false, false, false, false, false, align57);


        this.deck.add(oTemp);
        ArrayList<String> align58 = new ArrayList<String>();
        align58.add("Government");
        align58.add("Violent");
        align58.add("Straight");
        oTemp= new otherGroups("Pentagon", ImageIO.read(new File("Pentagon.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "none",
                6, 0, 6, 2, false, true, true, false, true, true, align58);

        this.deck.add(oTemp);
        ArrayList<String> align59 = new ArrayList<String>();
        align59.add("Criminal");
        align59.add("Liberal");
        oTemp= new otherGroups("Phone Breaks ", ImageIO.read(new File("PhoneBreaks.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "+3 on any attempt to control, neutralize, or destroy the phone company ",
                0, 1, 1, 1,true, false, false, false, false, false ,align59);


        this.deck.add(oTemp);
        ArrayList<String> align60 = new ArrayList<String>();
        align60.add("Government");
        oTemp= new otherGroups("Government", ImageIO.read(new File("Government.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "none ",
                4, 3, 3, 1,false, true, false, false, false, true ,align60);

        this.deck.add(oTemp);
        ArrayList<String> align61 = new ArrayList<String>();
        align61.add("Violent");
        align61.add("Fanatic");
        oTemp= new otherGroups("Professional Sports ", ImageIO.read(new File("ProfessionalSports.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "none ",
                2, 0, 4, 3,true, false, false, true, false, true ,align61);

        this.deck.add(oTemp);
        ArrayList<String> align62 = new ArrayList<String>();
        align62.add("Weird");
        oTemp= new otherGroups(" Psychiatrists ", ImageIO.read(new File("Psychiatrists.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "none ",
                0, 0, 6, 2,false, false, true, false, false, false ,align62);

        this.deck.add(oTemp);
        ArrayList<String> align63 = new ArrayList<String>();
        align63.add("Weird");
        oTemp= new otherGroups("Punk Rockers ", ImageIO.read(new File("PunkRockers.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "none ",
                0, 0, 4, 1,true, false, false, false, false, false ,align63);

        this.deck.add(oTemp);
        ArrayList<String> align64 = new ArrayList<String>();
        align64.add("Liberal");
        oTemp= new otherGroups("Recyclers ", ImageIO.read(new File("Recyclers.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "Pay 5 MB from this group to draw an extra card on your turn. This is not an action ",
                2, 0, 2, 3,false, true, true, false, false, false, align64);

        this.deck.add(oTemp);
        ArrayList<String> align65 = new ArrayList<String>();
        align65.add("Conservative");
        oTemp= new otherGroups("Republicans ", ImageIO.read(new File("Republicans.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "none",
                4, 0, 4, 4,false, true, true, false, true, true, align65);

        this.deck.add(oTemp);
        ArrayList<String> align66 = new ArrayList<String>();
        align66.add("Violent");
        align66.add("Communist");
        oTemp= new otherGroups("Robot Sea Monsters ", ImageIO.read(new File("RobotSeaMonsters.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "none",
                0, 0, 6, 2,false, false, true, false, false, false , align66);

        this.deck.add(oTemp);
        ArrayList<String> align67 = new ArrayList<String>();
        align67.add("Weird");
        oTemp= new otherGroups("Science Fiction Fans ", ImageIO.read(new File("ScienceFictionFans.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "+2 on any attempt to control any Weird group",
                0, 0, 5, 1,true, false, false, false, false, false , align67);

        this.deck.add(oTemp);
        ArrayList<String> align68 = new ArrayList<String>();
        align68.add("Criminal");
        align68.add("Violent");
        align68.add("Liberal");
        align68.add("Weird");
        align68.add("Communist");
        oTemp= new otherGroups("Semiconscious Liberation Army ", ImageIO.read(new File("SemiconsciousLiberationArmy.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "+1 on any attempt to destroy any group",
                0, 0, 8, 0,true, false, false, false, false, false , align68);

        this.deck.add(oTemp);
        ArrayList<String> align69 = new ArrayList<String>();
        align69.add("Weird");
        oTemp= new otherGroups("S.M.O.F. ", ImageIO.read(new File("SMOF.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "+5 for direct control of S.F. Fans. +2 for direct control of Trekkies",
                1, 0, 1, 0,false, false, true, false, false, false , align69);

        this.deck.add(oTemp);
        ArrayList<String> align70 = new ArrayList<String>();
        align70.add("Violent");
        align70.add("Weird");
        oTemp= new otherGroups("Society for Creative Anarchism ", ImageIO.read(new File("SocietyforCreativeAnarchism.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "none",
                0, 0, 4, 1,false, false, true, false, false, false , align66);

        this.deck.add(oTemp);
        ArrayList<String> align71 = new ArrayList<String>();
        align71.add("Conservative");
        align71.add("Violent");
        oTemp= new otherGroups("South American Nazis ", ImageIO.read(new File("SouthAmericanNazis.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "none",
                4, 0, 6, 2,false, false, true, false, true, true , align71);

        this.deck.add(oTemp);
        ArrayList<String> align72 = new ArrayList<String>();
        align72.add("Conservative");
        align72.add("Violent");
        align72.add("Fanatic");
        oTemp= new otherGroups("Survivalists ", ImageIO.read(new File("Survivalists.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "+2 Resistance to all owner's other groups",
                0, 0, 6, 2,false, false, true, false, false, false , align72);

        this.deck.add(oTemp);
        ArrayList<String> align73 = new ArrayList<String>();
        align73.add("Weird");
        oTemp= new otherGroups("Tabloids", ImageIO.read(new File("Tabloids.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "+3 for direct control of Convenience stores",
                2, 0, 3, 3,false, false, true, false,  true, false , align73);

        this.deck.add(oTemp);
        ArrayList<String> align74 = new ArrayList<String>();
        align74.add("Violent");
        align74.add("Conservative");
        align74.add("Government");
        oTemp= new otherGroups("Texas ", ImageIO.read(new File("Texas.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "none",
                6, 0, 6, 4,true, false, false, true, true, false , align74);

        this.deck.add(oTemp);
        ArrayList<String> align75 = new ArrayList<String>();
        oTemp= new otherGroups("The Phone Company ", ImageIO.read(new File("The Phone Company.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "none",
                5, 2, 6, 3,true, false, true, true, false, true , align75);

        this.deck.add(oTemp);
        ArrayList<String> align76 = new ArrayList<String>();
        align76.add("Liberal");
        oTemp= new otherGroups("The United Nations ", ImageIO.read(new File("TheUnitedNations.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "none",
                1, 0, 3, 3,true, false, false, false, false, true , align76);

        this.deck.add(oTemp);
        ArrayList<String> align77 = new ArrayList<String>();
        align77.add("Straight");
        oTemp= new otherGroups("Tobacco & Liquor Companies", ImageIO.read(new File("Tobacco&LiquorCompanies.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "none",
                4, 0, 3, 3,false, true, true, false, true, false , align77);

        this.deck.add(oTemp);
        ArrayList<String> align78 = new ArrayList<String>();
        align78.add("Weird");
        align78.add("Fanatic");
        oTemp= new otherGroups("Trekkies", ImageIO.read(new File("Trekkies.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "none",
                0, 0, 4, 3,false, false, true, false, false, false , align78);

        this.deck.add(oTemp);
        ArrayList<String> align79 = new ArrayList<String>();
        align79.add("Liberal");
        align79.add("Straight");
        oTemp= new otherGroups("Triliberal Commision ", ImageIO.read(new File("TriliberalComision.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "none",
                5, 0, 6, 3,false, false, true, false, true, true , align79);

        this.deck.add(oTemp);
        ArrayList<String> align80 = new ArrayList<String>();
        align80.add("Straight");
        align80.add("Fanatic");
        oTemp= new otherGroups("TV Preachers", ImageIO.read(new File("TVPreachers.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "+3 for direct control of the Moral Minority",
                3, 0, 6, 4,false, true, true, false, false, true , align80);


        this.deck.add(oTemp);
        ArrayList<String> align81 = new ArrayList<String>();
        align81.add("Communist");
        align81.add("Liberal");
        oTemp= new otherGroups("Underground Newspapers ", ImageIO.read(new File("UndergroundNewspapers.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "none",
                1, 1, 5, 0,false, false, true, false, true, false , align81);

        this.deck.add(oTemp);
        ArrayList<String> align82 = new ArrayList<String>();
        oTemp= new otherGroups("Video Games ", ImageIO.read(new File("VideoGames.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "+3 for direct control of Convenience Stores",
                2, 0, 3, 7,false, false, true, false, false, true , align82);

        this.deck.add(oTemp);
        ArrayList<String> align83 = new ArrayList<String>();
        align83.add("Conservative");
        oTemp= new otherGroups("Yuppies", ImageIO.read(new File("Yuppies.png")), ImageIO.read(new File ("RegBack.png")), "other groups", "none",
                1, 1, 4, 5,false, false, true, false, false, true, align83);
    }

    public void shuffle(){
        Collections.shuffle(deck);
    }

    public void drawCard(){
        deck.get(0);
        deck.remove(0);
    }
    public ArrayList<Card> getDeck(){
        return deck;
    }

    public void drawIlluminati(){
        deck.get(0);
        deck.remove(0);
        for(int i = 0; i <deck.size();i++){
            if(deck.get(i).getType() == "Illuminati"){
                deck.remove(i);
            }
        }
    }
}