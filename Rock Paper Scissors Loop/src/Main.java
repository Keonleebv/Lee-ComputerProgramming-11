import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String choice = ""; // User's choice ( r, p or s) //
        String userChoice = ""; // Outputs User's choice as rock, paper, scissors //
        String computerChoice = ""; // Computer's choice ( rock, paper or scissors) //
        int computerRandom; // Random number generated for computer's choice //
        int userPoint = 0; // Points awarded to User //
        int computerPoint = 0; // Points awarded to Computer //

        Scanner scan = new Scanner(System.in);

        System.out.println("Choose rock, paper or scissors.   " + "'r' for rock, 'p' for paper and 's' for scissors. Choose 'x' to exit.");
        // Loops the game //
        do {
            System.out.println("*************************************************************");
            // Prints out points for user and computer //
            System.out.println("Wins: " + userPoint + "\t" + "Losses: " + computerPoint);
            // Prints out user's choice //
            System.out.println("Players Choice:");
            // Scans user input //
            choice = (scan.next());
            // Generates random number between 1 - 3 //
            computerRandom = (int) ((Math.random() * 3) + 1);

            // Translates user input to rock,paper and scissors using if statements//
            if (choice.equals("r")) {
                userChoice = "rock";
            } else if (choice.equals("p")) {
                userChoice = "paper";
            } else if (choice.equals("s")) {
                userChoice = "scissors";
            }

            // Translates computer's randomly generated numbers into strings using if statements//
            if (computerRandom == 1) {
                computerChoice = "rock";
            } else if (computerRandom == 2) {
                computerChoice = "paper";
            } else if (computerRandom == 3) {
                computerChoice = "scissors";
            }


            // Prints out the result of the game ( who won/lost ) using if statements //
            if (choice.equals("x")) {
                System.out.println("Thank you for playing!");
            }
            // Handles invalid inputs //
            else if (!choice.equals("r") && !choice.equals("p") && !choice.equals("s") && !choice.equals("x")) {
                System.out.println("Invalid selection please play again.");
            }
            else if (userChoice.equals(computerChoice)) {
                System.out.println("Draw!");
            }
            else if (userChoice.equals("rock")) {
                if (computerChoice.equals("scissors")) {
                    System.out.println("You Win!");
                    userPoint++;
                } else if (computerChoice.equals("paper")) {
                    System.out.println("You Lose!");
                    computerPoint++;
                }
            } else if (userChoice.equals("paper")) {
                if (computerChoice.equals("scissors")) {
                    System.out.println("You Lose!");
                    computerPoint++;
                } else if (computerChoice.equals("rock")) {
                    System.out.println("You Win!");
                    userPoint++;
                }
            } else if (userChoice.equals("scissors")) {
                if (computerChoice.equals("paper")) {
                    System.out.println("You Win!");
                    userPoint++;
                } else if (computerChoice.equals("rock")) {
                    System.out.println("You Lose!");
                    computerPoint++;
                }
            }
            //  Prints out the Computer's and User's choice //
            if (choice.equals("r") || choice.equals("p") || choice.equals("s")) {
                System.out.println("Computer Choice: " + computerChoice + "\t" + "Player Choice: " + userChoice);
            }
        }
        // Condition to end loop //
        while ( !(choice.equals("x")));
    }

}
