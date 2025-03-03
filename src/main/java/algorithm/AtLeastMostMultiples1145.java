package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AtLeastMostMultiples1145 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");

		int[] numbers = new int[5];

		for (int i = 0; i < 5; i++) {
			numbers[i] = Integer.parseInt(input[i]);
		}

		System.out.println(atLeastMostMultiples(numbers));
	}

	private static int atLeastMostMultiples(int[] numbers) {
		int n = 1;

		while (true) {
			int count = 0;

			for (int num : numbers) {
				if (n % num == 0) {
					count++;
				}
			}

			if (count >= 3) {
				return n;
			}

			n++;
		}
	}
}
