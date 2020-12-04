package _03_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class GopMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("---Enter element for arr1---");
        int[] arr1 = new int[5];
        for(int i=0; i<arr1.length; i++){
            System.out.print("Enter arr1["+i+"]: ");
            int x = scanner.nextInt();
            arr1[i] = x;
        }

        System.out.println();

        System.out.println("---Enter element for arr2---");
        int[] arr2 = new int[6];
        for(int i=0; i<arr2.length; i++){
            System.out.print("Enter arr2["+i+"]: ");
            int x = scanner.nextInt();
            arr2[i] = x;
        }

        System.out.println();

        System.out.println("Arr1: ");
        for(int i=0; i<arr1.length; i++){
            System.out.print(" "+arr1[i]);
        }

        System.out.println();

        System.out.println("Arr2: ");
        for(int i=0; i<arr2.length; i++){
            System.out.print(" "+arr2[i]);
        }

        int[] arr3 = new int[arr1.length+arr2.length];

        for(int i=0; i<arr1.length; i++){
            arr3[i] = arr1[i];
        }

        for(int i=0; i<arr2.length; i++){
            arr3[arr1.length + i] = arr2[i];
        }

        System.out.println();

        System.out.println("---After merge arr1 and arr2---");
        System.out.println("Arr3: ");
        for(int i=0; i<arr3.length; i++){
            System.out.print(" "+arr3[i]);
        }
    }
}
