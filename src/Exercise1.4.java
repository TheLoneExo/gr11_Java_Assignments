
import java.util.Scanner;

class Exercise1_4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("What is y2?");
        double y2 = console.nextDouble();
        System.out.println("What is x2?");
        double x2 = console.nextDouble();
        System.out.println("What is y1?");
        double y1 = console.nextDouble();
        System.out.println("What is x1?");
        double x1 = console.nextDouble();
        double m = ((y2 - y1)/(x2 - x1));
        double b = (y2 - (m * x2));
        System.out.println("y = " + m + "x + " + b);
    }
}
