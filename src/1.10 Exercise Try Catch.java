
import java.util.InputMismatchException;
import java.util.Scanner;

class Exercise1_10 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Enter an integer: ");

        int number;
        boolean notInteger = true;


        while (notInteger){
            try{
                number = console.nextInt();
                notInteger = false;
            }
            catch(InputMismatchException e) {
                // you need to tell the exception type
                // 'e' is just a variable. 'e' stands for exception, but you can rename it anything you want (ex. 'anyName').
                // the datatype has to be 'exception' type
                System.err.println("Not an int: " + e); // it is best practice to use system.err for error messages (it’s clear it’s an error message). Others can separate error messages from regular output.
                console.nextLine();
                System.out.println("Please enter a new int: ");
                // in CodeHS, the program runs as it should. ‘System.err’ runs in a different thread than ‘System.out’. ‘System.out’ is more efficient so sometimes it will print before the ‘System.err’.
            }
        }
        System.out.println("You entered an integer!");
    } // end main method
} // end class








