package _06_ke_thua.bai_tap.lop_point_va_movablepoint;

public class Point {
    protected float x = 0.0f;
    protected float y = 0.0f;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point(){

    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y){
        this.setX(x);
        this.setY(y);
    }

    public float[] getXY(){
        float[] array = {this.x, this.y};
        return array;
    }

    public String toString(){
        return "("+this.x+","+this.y+")";
    }
}
