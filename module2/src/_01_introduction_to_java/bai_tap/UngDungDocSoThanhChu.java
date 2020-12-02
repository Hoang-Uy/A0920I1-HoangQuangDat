package _01_introduction_to_java.bai_tap;

import java.util.Scanner;

public class UngDungDocSoThanhChu {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number: ");
        int number = scanner.nextInt();

        if(number<10 && number>=0){
            switch (number) {
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
        }
        else if(number<20){
            int ones = number%10;
            switch (ones) {
                case 0:
                    System.out.println("ten");
                    break;
                case 1:
                    System.out.println("eleven");
                    break;
                case 2:
                    System.out.println("twelve");
                    break;
                case 3:
                    System.out.println("thirteen");
                    break;
                case 4:
                    System.out.println("fourteen");
                    break;
                case 5:
                    System.out.println("fifteen");
                    break;
                case 6:
                    System.out.println("sixteen");
                    break;
                case 7:
                    System.out.println("seventeen");
                    break;
                case 8:
                    System.out.println("eighteen");
                    break;
                case 9:
                    System.out.println("nineteen");
                    break;
            }

        }
        else if(number<100){
            int ones = number%10;
            int tens = number/10;
            switch (tens) {
                case 2:
                    System.out.print("twenty ");
                    break;
                case 3:
                    System.out.print("thirty ");
                    break;
                case 4:
                    System.out.print("forty ");
                    break;
                case 5:
                    System.out.print("fifty ");
                    break;
                case 6:
                    System.out.print("sixty ");
                    break;
                case 7:
                    System.out.print("seventy ");
                    break;
                case 8:
                    System.out.print("eighty ");
                    break;
                case 9:
                    System.out.print("ninety ");
                    break;
            }

            switch (ones) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
            }

        }
        else if(number < 1000){
            int hundreds = number/100;
            int tens = number%100/10;
            int ones = number%100%10;


            switch (hundreds) {
                case 1:
                    System.out.print("one hundred ");
                    break;
                case 2:
                    System.out.print("two hundred ");
                    break;
                case 3:
                    System.out.print("three hundred ");
                    break;
                case 4:
                    System.out.print("four hundred ");
                    break;
                case 5:
                    System.out.print("five hundred ");
                    break;
                case 6:
                    System.out.print("six hundred ");
                    break;
                case 7:
                    System.out.print("seven hundred ");
                    break;
                case 8:
                    System.out.print("eight hundred ");
                    break;
                case 9:
                    System.out.print("nine hundred ");
                    break;
            }

            if(tens >=2){
                switch (tens) {
                    case 2:
                        System.out.print("and twenty ");
                        break;
                    case 3:
                        System.out.print("and thirty ");
                        break;
                    case 4:
                        System.out.print("and forty ");
                        break;
                    case 5:
                        System.out.print("and fifty ");
                        break;
                    case 6:
                        System.out.print("and sixty ");
                        break;
                    case 7:
                        System.out.print("and seventy ");
                        break;
                    case 8:
                        System.out.print("and eighty ");
                        break;
                    case 9:
                        System.out.print("and ninety ");
                        break;
                }

                switch (ones) {
                    case 1:
                        System.out.println("one");
                        break;
                    case 2:
                        System.out.println("two");
                        break;
                    case 3:
                        System.out.println("three");
                        break;
                    case 4:
                        System.out.println("four");
                        break;
                    case 5:
                        System.out.println("five");
                        break;
                    case 6:
                        System.out.println("six");
                        break;
                    case 7:
                        System.out.println("seven");
                        break;
                    case 8:
                        System.out.println("eight");
                        break;
                    case 9:
                        System.out.println("nine");
                        break;
                }
            }
            else if(tens == 1){
                switch (ones) {
                    case 0:
                        System.out.println("and ten");
                        break;
                    case 1:
                        System.out.println("and eleven");
                        break;
                    case 2:
                        System.out.println("and twelve");
                        break;
                    case 3:
                        System.out.println("and thirteen");
                        break;
                    case 4:
                        System.out.println("and fourteen");
                        break;
                    case 5:
                        System.out.println("and fifteen");
                        break;
                    case 6:
                        System.out.println("and sixteen");
                        break;
                    case 7:
                        System.out.println("and seventeen");
                        break;
                    case 8:
                        System.out.println("and eighteen");
                        break;
                    case 9:
                        System.out.println("and nineteen");
                        break;
                }
            }
            else if(tens==0){
                switch (ones) {
                    case 1:
                        System.out.println("and one");
                        break;
                    case 2:
                        System.out.println("and two");
                        break;
                    case 3:
                        System.out.println("and three");
                        break;
                    case 4:
                        System.out.println("and four");
                        break;
                    case 5:
                        System.out.println("and five");
                        break;
                    case 6:
                        System.out.println("and six");
                        break;
                    case 7:
                        System.out.println("and seven");
                        break;
                    case 8:
                        System.out.println("and eight");
                        break;
                    case 9:
                        System.out.println("and nine");
                        break;
                }
            }

        }

    }
}
