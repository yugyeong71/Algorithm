package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PalindromeNumber1259 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			int number = Integer.parseInt(br.readLine());

			if (number == 0) {
				break;
			}

			System.out.println(palindromeNumber(number) ? "yes" : "no");
		}
	}

	private static boolean palindromeNumber(int number) {
		int originNumber = number;
		int reverseNumber = 0;

		while (number > 0) {
			reverseNumber = reverseNumber * 10 + number % 10;
			number /= 10;
		}

		return originNumber == reverseNumber;
	}
}
