package _04_lop_va_doi_tuong_trong_java.bai_tap;

public class Fan {
    private final int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";

    Fan(){

    }


    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String toString(){
        if(this.on){
            return "Speed = "+this.speed+" Color = "+this.color+" Radius = "+this.radius+"\n fan is on";
        }
        return "Color = "+this.color+" Radius = "+this.radius+"\n fan is off";
    }

    public static void main(String[] args) {
        Fan f1 = new Fan();
        f1.setSpeed(f1.getFAST());
        f1.setRadius(10);
        f1.setColor("yellow");
        f1.setOn(true);
        System.out.println(f1.toString());

        System.out.println();

        Fan f2 = new Fan();
        f2.setSpeed(f2.getMEDIUM());
        f2.setRadius(5);
        f2.setColor("blue");
        f2.setOn(false);
        System.out.println(f2.toString());
    }


}
