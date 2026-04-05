import java.util.*;

public class Guesser {

	public static void main(String[] args) {
		boolean keepGoing = true;
		Scanner input = new Scanner(System.in);
		while (keepGoing) {
			System.out.print("0) quit \n1) human guesser \n2) computer guesser \n\nPlease select 0-2: ");
			try {
				int selection = Integer.parseInt(input.nextLine());
				if (selection == 0) {
					keepGoing = false;
				} else if (selection == 1) {
					System.out.println("human guesser");
					humanGuesser();
				} else if (selection == 2) {
					System.out.println("computer guesser");
					computerGuesser();
				} else {
					System.out.println("Please enter a valid option.");
				}
			} catch (NumberFormatException e) {
				System.out.println("That's not a number, try again.");
			} catch (Exception e) {
				System.out.println("Something went wrong.");
			}
		}
	}

	public static void humanGuesser() {
		double randNum = Math.random();
		double d = randNum * 100;
		int correct = (int)d + 1;
		int turns = 1;
		
		boolean guessCorrect = false;
		Scanner input = new Scanner(System.in);
		while (!guessCorrect) {
			System.out.print(turns + ") Guess a number from 1-100: ");
			try {
				String strGuess = input.nextLine();
				int guess = Integer.parseInt(strGuess);
				if (guess == correct) {
                        	        System.out.println("You got it right! Good job!");
                                	guessCorrect = true;
                        	} else if (guess > correct) {
                                	System.out.println("lower");
					turns += 1;
                        	} else if (guess < correct) {
                        	        System.out.println("higher");
					turns += 1;
                        	}
			} catch(NumberFormatException e) {
				System.out.println("That's not a number, try again.");
			} catch(Exception e) {
				System.out.println("Something went wrong.");
			}
		}
	}

	public static void computerGuesser() {
		int turns = 1;
		int guess = 50;
		int interval = 25;
		boolean keepGoing = true;
		String answer;
		Scanner input = new Scanner(System.in);

		while (keepGoing) {
			System.out.println(turns + ") My guess is " + guess);
			System.out.print("Too (H)igh, too (L)ow, or (C)orrect? ");
			answer = input.nextLine();

			if (answer.equalsIgnoreCase("H")) {
				guess -= interval;
				turns += 1;
				interval = Math.floorDiv(interval, 2);
			} else if (answer.equalsIgnoreCase("L")) {
				guess += interval;
				turns += 1;
				interval = Math.floorDiv(interval, 2);
			} else if (answer.equalsIgnoreCase("C")) {
				System.out.println("Hooray! I got it right!");
				keepGoing = false;
			} else {
				System.out.println("Please enter a valid response.");
			}
			if (interval < 1) {
				interval = 1;
			}
		}
	}
}
