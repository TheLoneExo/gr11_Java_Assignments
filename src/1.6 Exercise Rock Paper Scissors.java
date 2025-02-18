class Exercise1_6 {
    public static void main(String[] args) {
        System.out.println("Welcome to Rock Paper Scissors!");

        System.out.println("Type your choice:\n\t 1 for Rock \n\t 2 for Paper \n\t 3 for Scissors");
        //COMPLETE: Scanner console =
        int choice = 1; // COMPLETE:Get user input and store to a variable called choice

        int comChoice = (int)(Math.random()*3+1); //Generates a number from the computer between 1 and 3

        //UNCOMMENT console.close(); //closes console since we are done with user input

        if(choice == 1){
            System.out.print("Player chooses Rock ");
        }
        //else if //COMPLETE: Print out for player choosing 2 or 3

        //COMPLETE: Print out the Computer's choice

        //Find the winner then print the winner
        if(choice == comChoice){
            System.out.println("It's a Tie!");
            System.exit(0); //closes program because the game is over
        }

        //COMPLETE if statements for the other 6 possible outcomes (ie rock and paper, paper and rock, scissors and rock, etc)
        // Tell the user whether “You Win” or the “Computer Wins”.


    }
}

