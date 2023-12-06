package CodeByRakesh;

import java.util.Scanner;

public class NStoneGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input
		int N = scanner.nextInt();

		// Output
		String winner = findWinner(N);
		System.out.println(winner);
	}

	public static String findWinner(int N) {
		// Create a boolean array to store the winning status for each number of stones.
		// Initialize all values to false.
		boolean[] dp = new boolean[N + 1];

		// Initialize base cases
		dp[0] = false; // Alice loses when there are 0 stones
		dp[1] = true; // Alice wins when there is 1 stone
		dp[2] = true; // Alice wins when there are 2 stones
		dp[3] = true; // Alice wins when there are 3 stones
		dp[4] = false; // Alice loses when there are 4 stones
		dp[5] = true; // Alice wins when there are 5 stones

		// Calculate the winning status for each number of stones from 6 to N.
		for (int i = 6; i <= N; i++) {
			dp[i] = !(dp[i - 2] && dp[i - 3] && dp[i - 5]);
		}

		// Return the winner based on the final status of N
		return dp[N] ? "Alice" : "Bob";
	}
}
