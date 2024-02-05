
/* 

 * Class: CMSC203  

 * Instructor: 

 * Description: (ESPGame class generates a random color and asks a player to guess the color for a number of rounds) 

 * Due: 02/04/2024 

 * Platform/compiler: Eclipse IDE

 * I pledge that I have completed the programming assignment  

* independently. I have not copied the code from a student or   * any source. I have not given my code to any student. 

 * Print your Name here: Evan McCabe 

*/ 

//import statements
import java.util.Scanner;
import java.util.Random;

public class ESPGame 
{

	public static void main(String[] args) 
	{
		//Constants for string literals.
		final String COLOR_RED = "Red";
		final String COLOR_GREEN = "Green";
		final String COLOR_BLUE = "Blue";
		final String COLOR_ORANGE = "Orange";
		final String COLOR_YELLOW = "Yellow";
		final int MAX_ROUNDS = 11; //Player can guess a max of 11 times
		
		//Random integer generator for numbers 1-5.
		Random RColor = new Random();
		
		//declarations
		String playerName;
		String playerDesc;
	
		Scanner stdin = new Scanner(System.in); //scanner declaration and opening
		
		System.out.print("Enter your name: ");
		playerName = stdin.nextLine();
		
		System.out.print("Describe yourself: ");
		playerDesc = stdin.nextLine();
		
		System.out.print("Due Date: 02/05/24\n");
		System.out.print("CMSC203 Assignment1: Test your ESP skills!\n");
		
		/* Initial setup complete
		 * Asked for name and description
		 * Setup player guess string and score integer
		 * then begin the guessing game
		 */
		
		String playerGuess; //The color the player guessed
		String thinkingOfColor = "";; //This is the declaration of the color players need to guess.
		int score = 0; //Amount the player has guessed out of 11.
		int rounds = 0; //declaration of the amount of rounds the player has played
		
		
		//The do while loop will execute until the player has guessed 11 times.
		do
		{
			int randomNum = RColor.nextInt(5) + 1; //randomNum generator
			//System.out.print(randomNum + "\n"); 
			
			/* switch statement uses randomNum generator
			 * Each case 1-5 represents a different color
			 * default case catches colors outside of range
			 */
			switch(randomNum)
			{
			case 1:
				thinkingOfColor = COLOR_RED;
			break;
			case 2:
				thinkingOfColor = COLOR_GREEN;
			break;
			case 3:
				thinkingOfColor = COLOR_BLUE;
			break;
			case 4:
				thinkingOfColor = COLOR_ORANGE;
			break;
			case 5:
				thinkingOfColor = COLOR_YELLOW;
			break;
			default:
				System.out.print("ERROR: Invalid Number.");
			} 
			
			//Each round will repeat this segment
			System.out.println("Round " + (rounds + 1));
            System.out.println("\nI am thinking of a color.");
            System.out.println("Is it Red, Green, Blue, Orange, or Yellow?");
            System.out.print("Enter your guess: ");
            playerGuess = stdin.next();
            
            /* Embedded if-else statements for playerGuess
             * Check for invalid color before moving forward.
             * if it isn't invalid, Check for accuracy
             * If player guess is accurate, add to score and continue
             */
            if (!(playerGuess.equalsIgnoreCase(COLOR_RED) || playerGuess.equalsIgnoreCase(COLOR_GREEN)
                    || playerGuess.equalsIgnoreCase(COLOR_BLUE) || playerGuess.equalsIgnoreCase(COLOR_ORANGE)
                    || playerGuess.equalsIgnoreCase(COLOR_YELLOW))) 
            {
                System.out.println("Invalid color entered. Please choose Red, Green, Blue, Orange, or Yellow.");
            }
            else
            {
            	
    			if (playerGuess.equalsIgnoreCase(thinkingOfColor)) {
                    System.out.println("\nI was thinking of " + thinkingOfColor + ". You got it!");
                    score++;
                } else {
                    System.out.println("\nI was thinking of " + thinkingOfColor + ". Sorry.");
                }

                rounds++;
            }
		} while (rounds < MAX_ROUNDS); //End of do while loop
            
			//Ending statements. GAME OVER
            System.out.println("\nGame Over\n");
            System.out.println("You guessed " + score + " out of " + MAX_ROUNDS + " colors correctly.");
            System.out.println("Student Name: " + playerName);
            System.out.println("User Description: " + playerDesc);
            System.out.println("Due Date: 06/19/23");
            stdin.close(); //Close the scanner
    		
		}

	}
