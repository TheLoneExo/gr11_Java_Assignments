import java.util.Scanner;

class Exercise1_5D {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int num1 = console.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = console.nextInt();
        if (num1 > num2) {
            System.out.println(num1 + " is larger than " + num2);
        } else if (num2 > num1){
            System.out.println(num2 + " is larger than " + num1);
        } else {
            System.out.println("Both numbers are the same");
        }
    }
}