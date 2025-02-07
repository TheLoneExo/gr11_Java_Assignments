
//Keyboard Input

import java.util.Scanner; //we need this line to be able to get input from the keyboard

class Exercise1_2_Keyboard_Input {
    public static void main(String[] args) {
        /* import java.util.Scanner;

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
 ~~~~~ Lesson ~~~~~ */
        String newline = System.lineSeparator();
        Scanner console = new Scanner(System.in); //makes a Scanner called console to listen to keyboard input
        System.out.println("Hi! What's your favourite animal? Type it down below :3"); //prints instructions to the user
        String animal = console.nextLine(); //saves the user's keyboard input to a variable message
        System.out.print("Your favourite animal is a " + animal + ", nice!");

        //You can also input integers and doubles
        System.out.println(newline + "Now what's 3+10?");
        console.nextInt(); //declare an int variable, get the user input and assign to the age
        System.out.print("It's 13.");

        console.nextLine(); //after using nextInt() or nextDouble(), write this line to clear the value and prepare for the next String


        /*  ~~~~~ Practice ~~~~~ */
        //Question 1: Ask the user for their favourite animal, save it to a variable, and print: Your favourite animal is <their animal>


        //Question 2: Ask the user to answer this skill testing question: "What is 3 + 10?"  (use an int)
    }
}
