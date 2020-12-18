package _06_ke_thua.bai_tap.lop_point2d_va_lop_point3d;

public class Point2DTest {
    public static void main(String[] args) {
        Point2D p = new Point2D(3.5f,4);
        System.out.println(p.toString());
        p.setXY(5,6.2f);
        System.out.println(p.getXY());
        System.out.println(p.toString());
    }
}
