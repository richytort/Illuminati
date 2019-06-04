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
    protected ArrayList<String> alingment;

    otherGroups(String name, BufferedImage frontCardImage, BufferedImage backCardImage, String type, String ability,
                int power, int tpower, int resistance, int income,boolean leftIn, boolean leftOut, boolean rightIn,
                boolean rightOut, boolean top, boolean bottom){
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
    }
    public String getType() {

        return type;
    }

    public void setType(String type) {

        this.type = type;
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

    public int getIncome() {

        return income;
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

}