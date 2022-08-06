package guessNumber;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		Scanner sc;
		Random random = new Random();

		int answer = random.nextInt(100) + 1;
		int userGuess = 0;
		int countTurns = 0;

		// Checks for initial non-numbers
		boolean run = true;
		while (run) {
			sc = new Scanner(System.in);
			System.out.println("Guess a number between 1 and 100");
			if (sc.hasNextInt()) {
				userGuess = sc.nextInt();
				run = false;
				countTurns++;
			} else {
				System.out.println("That is not a number. Try again.");
			}
		}

		// Compares the user guess with the answer
		boolean correct = false;
		while (correct == false) {
			sc = new Scanner(System.in);
			if (userGuess > answer) {
				System.out.println("Wrong. Guess a number smaller than " + userGuess);
				if (sc.hasNextInt()) {
					userGuess = sc.nextInt();
					countTurns++;
				} else {
					System.out.println("Thats not a number. Enter a number.");
				}
			} else if (userGuess < answer) {
				System.out.println("Incorrect. Guess a number larger than " + userGuess);
				if (sc.hasNextInt()) {
					userGuess = sc.nextInt();
					countTurns++;
				} else {
					System.out.println("Thats not a number. Enter a number.");
				}
			} else {
				System.out.println("You guessed correctly!");
				System.out.println("The number is " + answer);
				System.out.println("It took you " + countTurns + " turns to guess correctly!");
				correct = true;
				sc.close();
			}
		}

	}

}
