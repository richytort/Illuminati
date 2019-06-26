package Cards;

import java.awt.image.BufferedImage;

public class IlluminatiCard extends Card {
    //instances
    private String type ;
    private String ability ;
    private int power ;
    private int tPower ;
    private int income ;
    private boolean top ;
    private boolean left ;
    private boolean right ;
    private boolean bottom ;

    public IlluminatiCard(String name , BufferedImage frontCardImage , BufferedImage backCardImage ,  String type, String ability, int power, int tPower, int income, boolean top, boolean left,
                          boolean right, boolean bottom) {
        super(name, frontCardImage, backCardImage );
        this.type = type;
        this.ability = ability;
        this.power = power;
        this.tPower = tPower;
        this.income = income;
        this.top = top;
        this.left = left;
        this.right = right;
        this.bottom = bottom;
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

    public int gettPower() {
        return tPower;
    }

    public void settPower(int tPower) {
        this.tPower = tPower;
    }

    public int getIncome() {
        return income;
    }

    public void setIncome(int income) {
        this.income = income;
    }

    public boolean getTop() {
        return top;
    }

    public void setTop(boolean top) {
        this.top = top;
    }

    public boolean getLeft() {
        return left;
    }

    public void setLeft(boolean left) {
        this.left = left;
    }

    public boolean getRight() {
        return right;
    }

    public void setRight(boolean right) {
        this.right = right;
    }

    public boolean getBottom() {
        return bottom;
    }

    public void setBottom(boolean bottom) {
        this.bottom = bottom;
    }

    @Override
    public String toString() {
        return "Cards.IlluminatiCard [name=" + super.toString() + "type= " + type + ", ability=" + ability + ", power=" + power + ", tPower=" + tPower
                + ", income=" + income + ", top=" + top + ", left=" + left + ", right=" + right + ", bottom=" + bottom
                +  "]";
    }



}
