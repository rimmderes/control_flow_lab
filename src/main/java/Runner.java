import java.util.Scanner;

public class Runner {

    //function implements the game

    public static void main(String[] args) {

        // what will be presented to user
        System.out.println("Guess the number in my head?");

        Scanner reader = new Scanner(System.in);
        int guessTheNumber = reader.nextInt();

        System.out.println("The number you are guessing is: " + guessTheNumber);

        //if number is right, they are correct
        //if number is wrong, they are a loser

        if(guessTheNumber == 4) {
            System.out.println("That is Correct");
        } else {
            System.out.println("That is Incorrect"); }




    }

}
