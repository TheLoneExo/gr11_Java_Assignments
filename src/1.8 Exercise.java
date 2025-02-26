
import java.util.Scanner;

class Exercise1_8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Please type the program you want to run : ");
        int input = console.nextInt();
        if (input == 1) {
            for (int i = 1; i < 21; i++) {
                System.out.print(i + " ");
            }
        } else if (input == 2) {
//      Write a for loop to print out the multiples of 5 up to 200, on the same line with a comma between each. Every 10 numbers, go to a new line.
//      Sample output:
//      5,10,15,20,25,30,35,40,45,50,
//      55,60,65,70,75,80,85,90,95,100,
//      105,110,115,120,125,130,135,140,145,150,
//      155,160,165,170,175,180,185,190,195,200,
            for (int i = 5; i < 201; i += 5) {
                if (i % 50 == 0) {
                    System.out.println(i + ", ");
                } else if (i % 5 == 0) {
                    System.out.print(i + ", ");
                }

            }
        } else if (input == 3) {
            for (int i = 1; i < 21; i++) {
                System.out.print(i + " ");
            }

        }
    }
}






