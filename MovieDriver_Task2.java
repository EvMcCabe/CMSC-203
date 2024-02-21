import java.util.Scanner; //import Scanner
public class MovieDriver_Task2 {

	/**
	 * Given a class called Movie.java: Used to create a driver.
	 * Ask user input: Movie name(string), rating(string), and soldTickets(int).
	 * Uses Movie.java setter and getter methods.
	 * Pass information gained into newly created movie object: usermov.
	 * Print all gained information using Movie.Java toString() method.
	 * Asks the user if they wish to repeat the process.
	 * Loops as many times as the user inputs 'Y'.
	 * @param args String array object
	 */
	public static void main(String[] args)
	{
		
		// Object creations: Scanner & Movie 
		Scanner input = new Scanner(System.in);
		Movie usermov = new Movie();
		
		char repeatCondition;
		
		do
		{
			String userMovName;
			String userMovRating = "";
			int userMovTickSales = 0;
			
			System.out.println("Enter the name of a movie"); // Ask for user input: Title
			userMovName = input.nextLine();
			
			usermov.setTitle(userMovName); //setTitle
			//System.out.print(usermov.getTitle()); //Test
			
			System.out.println("Enter the rating of the movie");  // Ask for user input: Rating
			userMovRating = input.nextLine();
			
			usermov.setRating(userMovRating);
			//System.out.print(usermov.getRating()); //Test
			
			System.out.println("Enter the number of tickets sold for this movie");  // Ask for user input: Rating
			userMovTickSales = input.nextInt();
			
			usermov.setSoldTickets(userMovTickSales);
			//System.out.print(usermov.getSoldTickets()); //Test
			
			System.out.println(usermov.toString()); //print out info 
			
			input.nextLine(); // Consume newline character
			
			System.out.println("Do You want to enter another movie? (Y/N): "); //Ask to repeat process
			repeatCondition = input.nextLine().charAt(0); //only grab 'y' or 'n'
			
		//use Character class (similar to String class) to optimize input
		} while(Character.toUpperCase(repeatCondition) == 'Y'); //end do-while
		
		
		System.out.print("Thank You, Goodbye!"); //exit statement
		input.close(); //Close scanner
		
		
	}

}
