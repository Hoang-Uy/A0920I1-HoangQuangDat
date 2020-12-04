package _02_vong_lap_trong_java.bai_tap;

import java.util.Scanner;

public class HienThi20SoNguyenToDauTien {
    public static void main(String[] args) {
        System.out.println("20 prime numbers: ");
        int temp = 0;
        int count;
        for (int x = 2; ; x++) {
            count = 0;
            for (int i = 1; i <= x; i++)
                if (x % i == 0)
                    count++;
            if (count == 2) {
                if (temp == 20) break;
                System.out.print(x+ " ");
                temp++;
            }
        }
    }
}
