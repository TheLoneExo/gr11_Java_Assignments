import java.util.Scanner;

class Exercise1_5E {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.println("Hello and welcome to my winner game!");
        System.out.print("Please enter your first number: ");
        int num1 = console.nextInt();
        System.out.print("Please enter your second number: ");
        int num2 = console.nextInt();
        System.out.print("Please enter your third number: ");
        int num3 = console.nextInt();
        if (num1 + num2 == num3) {
            System.out.println("Congratulations! " + num1 + " + " + num2 + " = " + num3 + ", you won!");
        } else if (num1 - num2 == num3) {
            System.out.println("Congratulations! " + num1 + " - " + num2 + " = " + num3 + ", you won!");
        } else if (num2 - num1 == num3) {
            System.out.println("Congratulations! " + num2 + " - " + num1 + " = " + num3 + ", you won!");
        } else if (num1 * num2 == num3) {
            System.out.println("Congratulations! " + num1 + " * " + num2 + " = " + num3 + ", you won!");
        } else if (num2 != 0 && num1 / num2 == num3) {
            System.out.println("Congratulations! " + num1 + " / " + num2 + " = " + num3 + ", you won!");
        } else if (num1 != 0 && num2 / num1 == num3) {
            System.out.println("Congratulations! " + num2 + " / " + num1 + " = " + num3 + ", you won!");
        } else {
            System.out.println("Sorry, better luck next time.");
        }
    }
}
