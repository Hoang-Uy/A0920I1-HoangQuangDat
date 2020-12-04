package _03_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class TimGiaTriNhoNhatTrongMang {
    public static void main(String[] args) {
        int[] arr;

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of arr: ");
        int size = scanner.nextInt();
        arr = new int[size];
        System.out.println();

        System.out.println("---Enter element of arr---");
        for(int i=0; i<arr.length; i++){
            System.out.print("Enter arr["+i+"]: ");
            int x = scanner.nextInt();
            arr[i] = x;
        }
        System.out.println();

        System.out.println("Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();

        int min = arr[0];
        int index = 0;
        for(int i=0; i<arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                index = i;
            }
        }

        System.out.println();
        System.out.println("Min = arr["+index+"] = "+min);


    }
}
