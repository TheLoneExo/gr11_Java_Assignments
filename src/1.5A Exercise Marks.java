import java.util.Scanner;
class Exercise1_5A {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        // Prompt the user to enter a mark
        System.out.print("Enter the mark: ");
        double mark = console.nextDouble();

        // Determine the level based on the mark
        String level;
        if (mark >= 80) {
            level = "Level 4";
        } else if (mark >= 70) {
            level = "Level 3";
        } else if (mark >= 60) {
            level = "Level 2";
        } else if (mark >= 50) {
            level = "Level 1";
        } else {
            level = "Level 0";
        }

        System.out.println(level);

    }
}

