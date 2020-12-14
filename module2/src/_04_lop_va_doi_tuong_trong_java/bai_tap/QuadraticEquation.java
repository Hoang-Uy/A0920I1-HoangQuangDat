package _04_lop_va_doi_tuong_trong_java.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;

    public QuadraticEquation(){
    }

    public QuadraticEquation(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant(){
        double delta = b*b - 4*a*c;
        return delta;
    }

    public double  getRoot1(){
        double r1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        return r1;
    }

    public double  getRoot2(){
        double r2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
        return r2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = scanner.nextDouble();
        //System.out.print("Enter b:");
        double b = scanner.nextDouble();
        //System.out.print("Enter c:");
        double c = scanner.nextDouble();

        QuadraticEquation q = new QuadraticEquation(a,b,c);
        if(q.getDiscriminant()<0){
            System.out.println("The equation has no roots");
        }
        else if(q.getDiscriminant()==0){
            System.out.println("The equation has one root "+q.getRoot1());
        }
        else{
            System.out.println("The equation has two roots "+q.getRoot1()+" and "+q.getRoot2());
        }
    }
}
