import java.util.Scanner;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        int numberStones;
        int counter1 = 0;
        int counter2 = 0;
        String player1;
        String player2;
        int numberPlayers;
        int stonesPlayer1;
        int stonesPlayer2;

        Scanner input = new Scanner(System.in);
        while (true) {

            try {
                //Displaying information about the game
                System.out.println("Welcome to the Stone Game!!!");
                System.out.println("The game involves two players picking a number of stones in turn from a pile of an odd number of stones. Enjoy!!!");

                System.out.println("What is the number of stones in the pile (positive and odd number): ");
                numberStones = input.nextInt();

                //Ensuring that the number entered is a digit


                //Keeps on asking user to enter correct value
                while (numberStones % 2 == 0 || numberStones <= 0) {
                    System.out.println("Error! Please enter a positive odd number: ");
                    numberStones = input.nextInt();

                }


                //Ensuring that there are two players
                System.out.println("Please enter the number of players: ");
                numberPlayers = input.nextInt();
                while (numberPlayers != 2) {
                    System.out.println("Only two players can play the game: ");
                    System.out.println("Enter the number of players: ");
                    numberPlayers = input.nextInt();
                }

                //Taking the name of the players
                System.out.println("Please enter the name of player1: ");
                player1 = input.next();
                System.out.println("Please enter the name of player2: ");
                player2 = input.next();


                //Displaying the information currently available
                System.out.println(player1 + " has " + counter1 + " number of stones.");
                System.out.println(player2 + " has " + counter2 + " number of stones.");
                System.out.println("The number of stones available is " + numberStones);


                //Playing the game (First Round)
                System.out.println(player1 + ", Please take a number between 1 and " + (int) numberStones / 2);
                stonesPlayer1 = input.nextInt();


                //Ensuring that player1 takes a valid amount of stones
                while (stonesPlayer1 <= 0 || stonesPlayer1 > (int) numberStones / 2) {
                    System.out.println("Error! Enter a valid number between 1 and " + (int) numberStones / 2);
                    stonesPlayer1 = input.nextInt();
                }

                numberStones = numberStones - stonesPlayer1;

                counter1 += stonesPlayer1;


                //Displaying the information at hand
                System.out.println(player1 + " has " + counter1 + " number of stones.");
                System.out.println(player2 + " has " + counter2 + " number of stones.");
                System.out.println("The number of stones left are " + numberStones);


                //player2 second round
                System.out.println(player2 + " please take a number between 1 and " + numberStones);
                stonesPlayer2 = input.nextInt();

                //Ensuring player2 takes a valid number
                while (stonesPlayer2 <= 0 || stonesPlayer2 > numberStones) {
                    System.out.println("Error! Please enter a number between 1 and " + numberStones);
                    stonesPlayer2 = input.nextInt();
                }

                counter2 += stonesPlayer2; //adding the total of stones  player2 has taken

                //Updating the number of stones
                numberStones = numberStones - stonesPlayer2;


                //Displaying the information at hand

                System.out.println(player1 + " has " + counter1 + " number of stones.");
                System.out.println(player2 + " has " + counter2 + " number of stones.");
                System.out.println("The number of stones left are " + numberStones);

                while (numberStones > 0) {


                    //Displaying the information at hand

                   // System.out.println(player1 + " has " + counter1 + " number of stones.");
                    //System.out.println(player2 + " has " + counter2 + " number of stones.");
                   // System.out.println("The number of stones left are " + numberStones);


                    //Taking information from player1
                    System.out.println(player1 + "  please take a number between 1 and " + 2 * stonesPlayer2 + " ,not more than " + numberStones);
                    stonesPlayer1 = input.nextInt();

                    while (stonesPlayer1 <= 0 || stonesPlayer1 > 2 * stonesPlayer2 || stonesPlayer1 > numberStones) {
                        System.out.println(player1 + " !Please enter a number between 1 and " + 2 * stonesPlayer2 + " ,not more than " + numberStones);
                        stonesPlayer1 = input.nextInt();
                    }

                    numberStones = numberStones - stonesPlayer1;
                    counter1 += stonesPlayer1;
                    if (numberStones == 0) {
                        break;
                    }



                    //Displaying the information at hand
                    System.out.println(player1 + " has " + counter1 + " number of stones.");
                    System.out.println(player2 + " has " + counter2 + " number of stones.");
                    System.out.println("The number of stones left are " + numberStones);

                    System.out.println(player2 + "  please take a number between 1 and " + 2 * stonesPlayer1 + " ,not more than " + numberStones);
                    stonesPlayer2 = input.nextInt();

                    while (stonesPlayer2 <= 0 || stonesPlayer2 > 2 * stonesPlayer1 || stonesPlayer2 > numberStones) {
                        System.out.println(player2 + " !Please enter a number between 1 and " + 2 * stonesPlayer1 + " ,not more than " + numberStones);
                        stonesPlayer2 = input.nextInt();
                    }

                    counter2 += stonesPlayer2;
                    numberStones = numberStones - stonesPlayer2; //Updating the number of stones



                    //Displaying the information at hand
                    System.out.println(player1 + " has " + counter1 + " number of stones.");
                    System.out.println(player2 + " has " + counter2 + " number of stones.");
                    System.out.println("The number of stones left are " + numberStones);





                }


                if (counter1 % 2 != 0) {
                    System.out.println(player1 + " has won the game with " + counter1 + " stones, Congratulations!!!");
                } else if (counter2 % 2 != 0) {
                    System.out.println(player2 + " has won the game with " + counter2 + " stones, Congratulations!!!");
                }

                    break;
            } catch (InputMismatchException e){
            System.out.println("Invalid input, please enter a number.");
                        input.nextLine();//clears the buffer
                 }

        }
    }
}








