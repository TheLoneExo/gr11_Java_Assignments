import java.util.Scanner;

class Exercise1_5C {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        System.out.print("Enter a five-digit lottery ticket number: ");
        String input = console.nextLine();
        if (input.matches("\\d{5}")) {
            if (input.equals("34567")) {
                System.out.println("You have won $1,000,000");
            } else {
                System.out.println("Better luck next time!");
            }
        } else {
            System.out.println("Your number is invalid");
        }
    }
}