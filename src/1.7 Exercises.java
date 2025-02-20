import java.util.Scanner;

class Exercise1_7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Welcome to my programs for exercise 1.7!\nEnter a number below to choose the question:");
        int choice = console.nextInt(); // COMPLETE:Get user input and store to a variable called choice

        if (choice == 1) {
            int even_num = 0;
            while (even_num < 101) {
                System.out.print(even_num + " ");
                even_num += 2;
            }
        } else if (choice == 2) {
            int even_num = 1;
            while (even_num < 101) {
                if ((even_num % 10) == 0) {
                    System.out.print(even_num + " \n");
                } else {
                    System.out.print(even_num + " ");
                }
                even_num++;
            }
        } else if (choice == 3) {
            int even_num = 0;
            while (even_num < 101) {
                System.out.print(even_num + " ");
                even_num += 2;
            }
    }
}

}



