package _02_vong_lap_trong_java.bai_tap;

public class HienThiCacSoNguyenToNhoHon100 {
    public static void main(String[] args) {
        System.out.println("Prime numbers < 100: ");
        int count;
        for (int x = 2; ; x++) {
            count = 0;
            for (int i = 1; i <= x; i++)
                if (x % i == 0)
                    count++;
            if (count == 2) {
                if (x >=100) break;
                System.out.print(x+ " ");
            }
        }
    }
}
