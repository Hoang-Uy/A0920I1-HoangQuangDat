package _06_ke_thua.bai_tap.lop_point2d_va_lop_point3d;

public class Point3DTest {
    public static void main(String[] args) {
        Point3D p = new Point3D(4.5f, 6, 3.2f);
        System.out.println(p.toString());
        p.setXY(5,6.2f);
        System.out.println(p.getXY());
        System.out.println(p.toString());
        p.setXYZ(9.8f, 4, 2.1f);
        System.out.println(p.getXYZ());
        System.out.println(p.toString());
    }
}
