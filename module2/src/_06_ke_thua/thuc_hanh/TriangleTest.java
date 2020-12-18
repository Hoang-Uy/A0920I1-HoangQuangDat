package _06_ke_thua.thuc_hanh;

import java.util.Scanner;

public class TriangleTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter side1: ");
        double a = scanner.nextDouble();
        System.out.print("Enter side2: ");
        double b = scanner.nextDouble();
        System.out.print("Enter side3: ");
        double c = scanner.nextDouble();

        System.out.print("Enter color: ");
        String s = scanner.next();


        Triangle t = new Triangle(s, false, a, b, c);
        System.out.println(t.toString());
        System.out.println("Area = "+t.getArea());
        System.out.println("Perimeter = "+t.getPerimeter());

    }
}
