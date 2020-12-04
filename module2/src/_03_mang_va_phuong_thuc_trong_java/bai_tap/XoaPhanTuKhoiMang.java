package _03_mang_va_phuong_thuc_trong_java.bai_tap;

import java.util.Scanner;

public class XoaPhanTuKhoiMang {
    public static void main(String[] args) {
        int[] arr = {10,4,6,7,8,6,0,0,0,0};

        System.out.println("Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }
        System.out.println();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter X: ");
        int x = scanner.nextInt();

        int index_del = -1;
        for(int i=0; i<arr.length; i++){
            if(x == arr[i]){
                index_del = i;
            }
        }
        System.out.println("Index of X in array: "+index_del);

        for(int i=index_del; i<arr.length-1; i++){
            arr[i] = arr[i+1];
        }

        System.out.println("Array after deleting X: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(" "+arr[i]);
        }
    }
}
