
import java.util.Scanner;

class Exercise1_3_Arithmetic {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Please enter a number from 1-6 below to choose a program:");
        int programNumber = console.nextInt();
        if (programNumber == 1) {
            System.out.println("Enter your first number below:");
            int firstNumber = console.nextInt();
            System.out.println("Now enter your second number below:");
            int secondNumber = console.nextInt();
            System.out.println(firstNumber + " + " + secondNumber + " is " + (firstNumber + secondNumber));
            System.out.println(firstNumber + " - " + secondNumber + " is " + (firstNumber - secondNumber));
            System.out.println(firstNumber + "/" + secondNumber + " is " + (firstNumber / secondNumber) + " with integer division");
            System.out.println("and " + (float) firstNumber / secondNumber + " with floating division.");
            System.out.println(firstNumber + " mod " + secondNumber + " is " + (firstNumber % secondNumber));
        } else if (programNumber == 2) {
            System.out.println("Enter your temperature in Celsius below:");
            double userTemperature = console.nextDouble();
            userTemperature = (userTemperature * 9/5 + 32);
            System.out.println("Your temperature in Fahrenheit is: " + (float)userTemperature);


        } else if (programNumber == 3) {



        } else {
            System.out.println("Error, you did not enter a number between 1-6, restart the code to try again.");

        }

    }
}
