package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Resistance1076 {

	private static final String[] COLORS = {
		"black", "brown", "red", "orange", "yellow",
		"green", "blue", "violet", "grey", "white"
	};

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String first = br.readLine();
		String second = br.readLine();
		String third = br.readLine();

		System.out.println(resistance(first, second, third));
	}

	private static long resistance(String first, String second, String third) {
		int firstValue = -1;
		int secondValue = -1;
		int thirdValue = -1;

		for (int i = 0; i < COLORS.length; i++) {
			if (COLORS[i].equals(first)) {
				firstValue = i;
			}

			if (COLORS[i].equals(second)) {
				secondValue = i;
			}

			if (COLORS[i].equals(third)) {
				thirdValue = i;
			}
		}

		return (long) (firstValue * 10 + secondValue) * (long) Math.pow(10, thirdValue);
	}

}
