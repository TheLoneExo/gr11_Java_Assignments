
import java.util.Scanner;

class Exercise1_3B_Arithmetic {
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
            System.out.println("This program calculates the area of a trapezoid");
            System.out.println("Enter your 'a' value for the trapezoid below:");
            double avalue = console.nextDouble();
            System.out.println("Now enter your 'b' value below:");
            double bvalue = console.nextDouble();
            System.out.println("Now enter your 'h' value :D");
            double hvalue = console.nextDouble();
            avalue = (((avalue+bvalue)/2)*hvalue);
            System.out.println("Your trapezoid's area is: " + ((float)avalue) );


        } else if (programNumber == 4) {
            System.out.println("Enter a 4 digit integer below to calculate the sum of the digits:");
            int fourdigitnumber = console.nextInt();
            int digit1 = (fourdigitnumber % 10);
            fourdigitnumber = (fourdigitnumber/10);
            int digit2 = (fourdigitnumber % 10);
            fourdigitnumber = (fourdigitnumber/10);
            int digit3 = (fourdigitnumber % 10);
            fourdigitnumber = (fourdigitnumber/10);
            int digit4 = (fourdigitnumber % 10);
            int sumofdigits = (digit1 + digit2 + digit3 + digit4);
            System.out.println("The sum of the digits in your number is: " + sumofdigits);
        } else if (programNumber == 5) {
            int age = 14;
            System.out.println(age + 1);

        } else if (programNumber == 6) {
            int length = 5;
            double width = 3.5;
            int area = (int) (length * width);
            System.out.println("The area is " + area);
            double perimeter = (length + width);
            System.out.println("The perimeter is " + perimeter);

        } else {
            System.out.println("Error, you did not enter a number between 1-6, restart the code to try again.");

        }

    }
}
