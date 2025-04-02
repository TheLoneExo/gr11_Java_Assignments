
import java.util.Scanner;

class Exercise2_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Please type the program you want to run : ");
        int input = console.nextInt();
        if (input == 1) {


            for (int i = 1; i < 21; i++) {
                System.out.print(i + " ");
            }
        } else if (input == 2) {

            for (int i = 5; i < 201; i += 5) {
                if (i % 50 == 0) {
                    System.out.println(i + ", ");
                } else if (i % 5 == 0) {
                    System.out.print(i + ", ");
                }

            }
        } else if (input == 3) {
//          Write a program to ask the user for a positive integer, and print all of the factors of that number.
//          Sample input:
//          24
//          Sample output:
//          1 2 3 4 6 8 12 24
            System.out.print("Enter a positive integer: ");
            int input_3 = console.nextInt();
            for (int i = input_3; i > 0; i--) {
                if (input_3 % i == 0) {
                    System.out.print(i + " ");
                }
            }

        } else if (input == 4) {
//         Use a for loop to check if a number is a palindrome (the same forwards and backwards):
//         Sample input:
//         727
//         Sample output:
//         727 is a palindrome
            System.out.print("Enter a positive integer: ");
            int input_4 = console.nextInt();
            for (int i = 1; i < 21; i++) {
                System.out.print(i + " ");
            }
        } else if (input == 5) {
//        Write a program to get user input of two integers, and print all of the numbers between the numbers.
//        Sample input:
//        6 13
//        Sample output:
//        6 7 8 9 10 11 12 13

            System.out.print("Enter your first integer: ");
            int input_5_1 = console.nextInt();
            System.out.print("Enter your second integer: ");
            int input_5_2 = console.nextInt();
            for (int i = input_5_1; i <= input_5_2; i++) {
                System.out.print(i + " ");
            }
        } else if (input == 6) {
//        Use a for loop to print the following pattern [HINT: use a for loop inside a for loop]:
//        Sample output:
//        1
//        1 2
//        1 2 3
//        1 2 3 4
//        1 2 3 4 5
//        1 2 3 4 5 6
//        1 2 3 4 5 6 7
//        1 2 3 4 5 6 7 8
//        1 2 3 4 5 6 7 8 9
            for (int i = 1; i <= 9; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
}






