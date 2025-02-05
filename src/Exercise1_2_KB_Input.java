import java.util.Scanner;

class Exercise1_2_KB_Input {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in); //#2
        System.out.println("What is your name?");
        String name = console.nextLine(); //#3 input
        System.out.println("Hi "+name);

        System.out.println("Number?");
        int num = console.nextInt();
        System.out.println(num*10 + " is 10 times better");

    }
}
