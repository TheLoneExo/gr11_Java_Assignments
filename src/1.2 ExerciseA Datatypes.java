//Variables
class Exercise1_2_Datatypes {
    public static void main(String[] args) {

        /*  ~~~~~ Lesson ~~~~~ */
        int age = 16; //declares (makes) a variable called age and initializes the value of 16 to age
        System.out.print("Your age is: "); //Prints the message in the brackets
        System.out.print(age); //Prints the value 16

        //The lines above print on one line. To print on different lines use:
        System.out.println(); // This goes to the next line. Note: this is letter l not #1.
        System.out.println("Your age is: "); //Prints the message on a New Line
        System.out.println(age); //Prints the value 16 on a New Line

        //We can make lots of different types of variables. Examples:
        /*  ~~~~~ Practice ~~~~~ */

        //Question 1
        //a) Declare a variable for a name and initialize to Joe Smith.
        String name = "Joe Smith";
        //b) Print the variable on a new line.
        System.out.println(name);

        //Question 2
        //a) Declare a variable for birthyear, and initialize it to 2004.
        int birthyear = 2004;
        //b) Print the variable on a new line.
        System.out.println(birthyear);

        //Question 3
        //a) Declare a variable for weight and initialize it to 45.6 (kg).
        double weight = 45.6;
        //b) Print the variable on a new line.
        System.out.println(weight);

    }
}
