package _06_ke_thua.bai_tap.lop_point2d_va_lop_point3d;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public Point3D() {

    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z){
        this.setX(x);
        this.setY(y);
        this.setZ(z);
    }

    public float[] getXYZ(){
        float[] array = {this.x, this.y, this.z};
        return array;
    }

    @Override
    public String toString(){
        return "("+this.x+","+this.y+","+this.z+")";
    }
}
