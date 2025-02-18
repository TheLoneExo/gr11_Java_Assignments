import java.util.Scanner;

class Exercise1_5B {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = console.nextInt();
        if (num % 2 == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }

    }
}

