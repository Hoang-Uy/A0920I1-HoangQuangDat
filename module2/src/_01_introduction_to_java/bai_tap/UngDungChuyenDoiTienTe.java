package _01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        double usd = scanner.nextDouble();

        double rate = 23000;

        double vnd = usd*rate;

        System.out.println(usd+" USD = "+vnd+" VND");

    }
}
