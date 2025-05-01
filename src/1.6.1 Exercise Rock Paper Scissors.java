import java.util.Scanner;

class   Exercise1_6_1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Welcome to Rock Paper Scissors!");
        System.out.println("Type your choice:\n\t 1 for Rock \n\t 2 for Paper \n\t 3 for Scissors");
        int choice = console.nextInt(); // COMPLETE:Get user input and store to a variable called choice

        int comChoice = (int)(Math.random()*3+1); //Generates a number from the computer between 1 and 3
        console.close(); //closes console since we are done with user input

        if(choice == 1){
            System.out.println("Player chooses Rock");
        } else if (choice == 2) {
            System.out.println("Player chooses Paper");//COMPLETE: Print out for player choosing 2 or 3
        } else if (choice == 3) {
            System.out.println("Player chooses Scissors");//COMPLETE: Print out for player choosing 2 or 3
        }
        //COMPLETE: Print out the Computer's choice
        if(comChoice == 1){
            System.out.println("Computer chooses Rock");
        } else if (comChoice == 2) {
            System.out.println("Computer chooses Paper");//COMPLETE: Print out for player choosing 2 or 3
        } else if (comChoice == 3) {
            System.out.println("Computer chooses Scissors");//COMPLETE: Print out for player choosing 2 or 3
        }
        //Find the winner then print the winner
        if(choice == comChoice){
            System.out.println("It's a Tie!");
            System.exit(0); //closes program because the game is over
        } else if (comChoice == 1 && choice == 2) {
            System.out.println("You Win!");
        } else if (comChoice == 1 && choice == 3) {
            System.out.println("Computer Wins!");
        } else if (comChoice == 2 && choice == 1) {
            System.out.println("Computer Wins!");
        } else if (comChoice == 2 && choice == 3) {
            System.out.println("You Win!");
        } else if (comChoice == 3 && choice == 1) {
            System.out.println("You Win!");
        } else if (comChoice == 3 && choice == 2) {
            System.out.println("Computer Wins!");
        }
    }
}

