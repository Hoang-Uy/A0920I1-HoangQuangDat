package _03_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class ThemPhanTuVaoMang {
    public static void main(String[] args) {
        int[] arr = {10,4,6,7,8,0,0,0,0,0};

        System.out.println("Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter X: ");
        int x = scanner.nextInt();
        System.out.print("Enter index: ");
        int index = scanner.nextInt();

        if(index<0 || index>arr.length-1){
            System.out.println("Can't add element into array!");
            System.exit(0);
        }


        for(int i=arr.length-1; i>=index+1; i--){
            arr[i] = arr[i-1];
        }

        arr[index] = x;

        System.out.println("Array after adding "+x+" at index "+index+": ");
        for(int i=0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }
    }
}
