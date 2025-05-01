
import java.util.Scanner;

class Exercise2_1 {
    public static void main(String[] args) {
        System.out.println(calcArea(3.5, 4.6));
//note: calcArea needs two double values for parameters, and there is
//no print statement in the method, so I added one here

        displayMessage("There is school today!");
        //note: displayMessage needs one String as a parameter, and prints in
        //the method, so I did not add a print statement here. Also,
        //System.out.print(displayMessage("Hi")); ->ERROR: void return type
    }

    public static double calcArea(double height, double base) {
        return height * base;
    }

    public static void displayMessage(String str) {
        System.out.println("**IMPORTANT: " + str + " IMPORTANT!**");
    }
}








