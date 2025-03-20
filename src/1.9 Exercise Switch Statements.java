
import java.util.Scanner;

class Exercise1_9 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Type program number to run:");
        int choice = console.nextInt();
        //Write a program that asks the user for a level (ex. 1, 2, 3, 4) and then output the appropriate percent range using a switch case.
        //
        //Sample Output and Input:
        //Enter the level you got on an Assignment: 3
        //Your mark as a percent is between 70-79%.
        if (choice == 1) {
            System.out.println("Enter your level:");
            int level = console.nextInt();
            switch (level){
                case 0 -> System.out.println("Your mark as a percent is below 50%");
                case 1 -> System.out.println("Your mark as a percent is between 50-59%");
                case 2 -> System.out.println("Your mark as a percent is between 60-69%");
                case 3 -> System.out.println("Your mark as a percent is between 70-79%");
                case 4 -> System.out.println("Your mark as a percent is between 80-89%");
                default -> System.out.println("Invalid level");
            }
        }
//      Convert the 1.5 Marks Exercise code from if statements to a switch statement.
        if (choice == 2) {
            System.out.println("Enter your grade:");
            double mark = console.nextDouble();
            int grade = (int) (mark / 10);
            switch (grade){
                case 9, 8 -> System.out.println("Level 4");
                case 7 -> System.out.println("Level 3");
                case 6 -> System.out.println("Level 2");
                case 5 -> System.out.println("Level 1");
                default -> System.out.println("Level 0");
            }
        }
//      Make a simple calculator. Ask the user for two numbers and an operator (+, -, *, /, %)
//      and output the result. Use a switch statement to do the operation.
//      Extension: add additional operations to your options (^ exponents, anything else?).
        if (choice == 3) {
            System.out.println("Enter your first number: ");
            double num1 = console.nextDouble();
            System.out.println("Enter your second number: ");
            double num2 = console.nextDouble();
            System.out.println("Enter your operator: ");
            String operator = console.next();
            switch (operator){
                case "+" -> System.out.println((num1) + " + " + (num2) + " = " + (num1 + num2));
                case "-" -> System.out.println((num1) + " - " + (num2) + " = " + (num1 - num2));
                case "*" -> System.out.println((num1) + " * " + (num2) + " = " + (num1 * num2));
                case "/" -> System.out.println((num1) + " / " + (num2) + " = " + (num1 / num2));
                case "%" -> System.out.println((num1) + " % " + (num2) + " = " + (num1 % num2));
                default -> System.out.println("Invalid operator");
            }
        }
        }
    }








