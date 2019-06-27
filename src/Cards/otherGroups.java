package Cards;

import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class otherGroups extends Card {
    private String type;
    private String ability;
    private int power;
    private int tpower;
    private int resistance;
    private int income;
    private boolean leftIn;
    private boolean leftOut;
    private boolean rightIn;
    private boolean rightOut;
    private boolean top;
    private boolean bottom;
    private ArrayList<String> alignment;

    public otherGroups(String name, BufferedImage frontCardImage, BufferedImage backCardImage, String type, String ability,
                int power, int tpower, int resistance, int income,boolean leftIn, boolean leftOut, boolean rightIn,
                boolean rightOut, boolean top, boolean bottom, ArrayList<String> alignment){
        super(name, frontCardImage, backCardImage );
        this.type = type;
        this.ability = ability;
        this.power = power;
        this.tpower = tpower;
        this.resistance = resistance;
        this.income = income;
        this.leftIn = leftIn;
        this.leftOut = leftOut;
        this.rightIn = rightIn;
        this.leftIn = leftIn;
        this.leftOut = leftOut;
        this.top = top;
        this.bottom = bottom;
        this.alignment = alignment;

    }


    public String getAbility() {
        return ability;
    }

    public void setAbility(String ability) {
        this.ability = ability;
    }

    public int getPower() {

        return power;
    }

    public void setPower(int power) {

        this.power = power;
    }

    public int gettPower()
    {
        return tpower;
    }

    public void settPower(int tPower) {
        this.tpower = tpower;
    }


    public void setIncome(int income) {

        this.income = income;
    }


    public boolean isLeftIn() {

        return leftIn;
    }
    public boolean isLeftOut() {

        return leftOut;
    }


    public void setLeftIn(boolean leftIn) {

        this.leftIn = leftIn;
    }

    public void setLeftOut(boolean leftOut) {

        this.leftOut = leftOut;
    }
    public boolean isRightIn() {

        return rightIn;
    }

    public void setRightIn(boolean rightIn) {

        this.rightIn = rightIn;
    }

    public boolean isRightOut() {

        return rightOut;
    }

    public void setRightOut(boolean rightOut) {

        this.rightOut = rightOut;
    }

    public boolean isTop() {

        return top;
    }

    public void setTop(boolean top) {

        this.top = top;
    }


    public boolean isBottom() {

        return bottom;
    }

    public void setBottom(boolean bottom) {

        this.bottom = bottom;
    }
    public void setAlignment(String alig){
        this.alignment.add(alig);
    }

    public String getAlignments() {
        String alignt = "";
        for (String e : alignment) {
           alignt+= e;
        }return alignt;
    }

    @Override
    public String toString() {
        return "Cards.otherGroups name= " + super.toString() + "type = " + type + ", ability = " + ability + ", power = " + power + ", tPower = " + tpower
                + ", income = " + income +  ", leftIn= " + leftIn + ", leftOut = " + leftOut +
                ", rightIn = " + rightIn + ", rightOut = " + rightOut + ", top = " + top + ", bottom = " + bottom
                + " ,alignment = " + alignment + "";

    }

}
