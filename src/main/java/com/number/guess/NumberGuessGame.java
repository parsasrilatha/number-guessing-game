/**
 * 
 */
package com.number.guess;

import java.util.Scanner;

/**
 * The user chooses a number in his mind and types “ready” to indicate to the
 * computer that he is ready to begin playing.
 * 
 * The program asks a series of questions to arrive at the number the user has
 * in mind. The user can only respond with “higher”, “lower” or “yes”.
 * 
 * The game ends when the user responds with “yes” or “end”.
 * 
 * @author Srilatha
 *
 */
public class NumberGuessGame {
	static Scanner sc = new Scanner(System.in);

	public void play() {
		System.out.println("*******  Welcome to Number Guess Game *********");
		System.out.println("Computer: Are you ready to play game?. If you are ready, type - ready");
		String input = sc.next();
		if (isUserReady(input)) {
			getNumberOfAttemps(getMin(), getMax(), input);
		} else {
			System.out.println("You have choosen to end the game. Am exiting now...");
			System.exit(0);
		}
	}

	/**
	 * Returns number of attempts that Computer has asked for user input.
	 * 
	 * @param min
	 * @param max
	 * @param input
	 * @return number of attempts
	 */
	public int getNumberOfAttemps(int min, int max, String input) {
		int mid = 0;
		int numOfAttempts = 0;
		while (IsGameContinued(input)) {
			mid = (min + max) / 2;
			++numOfAttempts;
			System.out.println("Computer: Is the number " + mid + "?");
			input = sc.next();
			System.out.println("User: " + input);
			if (input.equalsIgnoreCase(Response.LOWER.respCode)) {
				max = mid - 1;
				continue;
			}
			if (input.equalsIgnoreCase(Response.HIGHER.respCode)) {
				min = mid + 1;
				continue;
			}
			if (input.equalsIgnoreCase(Response.YES.respCode)) {
				System.out.println("Computer : I have guessed your number successfully in "
						+ numOfAttempts + " attempts.");
				return numOfAttempts;
			} else {
				System.out.println("Computer: Am exiting now...");
			}
		}

		return numOfAttempts;
	}

	/**
	 * @param input
	 * @return whether user is Ready to input
	 */
	public boolean isUserReady(String input) {
		return input != null && input.equalsIgnoreCase(Response.READY.respCode);
	}

	/**
	 * @param input
	 *            user response
	 * @return whether game should continue
	 */
	public boolean IsGameContinued(String input) {
		return !input.equalsIgnoreCase(Response.END.respCode)
				&& !input.equalsIgnoreCase(Response.YES.respCode);
	}

	/**
	 * 
	 * @return max
	 */
	private int getMax() {
		return 100;
	}

	/**
	 * 
	 * @return min
	 */
	private int getMin() {
		return 0;
	}
}
