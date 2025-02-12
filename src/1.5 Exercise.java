import java.util.Scanner;
class Exercise1_5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter your first number below:");
        int num1 = console.nextInt();
        System.out.println("Now enter your second number below:");
        int num2 = console.nextInt();
        System.out.print("This is the sum of your two numbers: " + (num1 + num2));
    }
}
