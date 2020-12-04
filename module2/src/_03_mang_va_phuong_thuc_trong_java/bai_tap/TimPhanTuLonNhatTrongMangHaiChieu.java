package _03_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TimPhanTuLonNhatTrongMangHaiChieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //int[][] arr = { {5,8,4,6,3,9} , {18,99,32,100,14,12}, {3,98,67,42,56,12}};

        int[][] arr;
        System.out.println("---Enter size(x,y) of arr---");
        System.out.print("Enter x: ");
        int x = scanner.nextInt();
        System.out.print("Enter y: ");
        int y = scanner.nextInt();
        arr = new int[x][y];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print("Enter arr["+i+"]["+j+"]: ");
                int temp = scanner.nextInt();
                arr[i][j] = temp;
            }
        }

        System.out.println();

        System.out.println("Arr: ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();

        int max = arr[0][0];
        int index1 = 0;
        int index2 = 0;
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                    index1 = i;
                    index2 = j;
                }
            }
        }

        System.out.println("Max = arr["+index1+"]["+index2+"] = "+max);
    }
}
