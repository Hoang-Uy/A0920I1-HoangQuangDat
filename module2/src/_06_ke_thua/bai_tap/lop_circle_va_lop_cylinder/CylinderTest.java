package _06_ke_thua.bai_tap.lop_circle_va_lop_cylinder;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder();
        System.out.println(cylinder);
        System.out.println("Area = "+cylinder.getArea());
        System.out.println("Perimeter = "+cylinder.getPerimeter());
        System.out.println("Volume = "+cylinder.getVolume());

        cylinder = new Cylinder(3.5,"red",5);
        System.out.println(cylinder);
        System.out.println("Area = "+cylinder.getArea());
        System.out.println("Perimeter = "+cylinder.getPerimeter());
        System.out.println("Volume = "+cylinder.getVolume());

        Circle c = new Cylinder(3.5,"blue", 5);
        System.out.println(c.toString());
        System.out.println("Area = "+c.getArea());
        System.out.println("Perimeter = "+c.getPerimeter());

    }
}
