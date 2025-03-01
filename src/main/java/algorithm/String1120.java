package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class String1120 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String[] input = br.readLine().split(" ");
		String A = input[0];
		String B = input[1];

		System.out.println(stringMin(A, B));
	}

	private static int stringMin(String A, String B) {
		int min = Integer.MAX_VALUE;
		int aLength = A.length();
		int bLength = B.length();

		for (int i = 0; i <= bLength - aLength; i++) {
			int count = 0;
			for (int j = 0; j < aLength; j++) {
				if (A.charAt(j) != B.charAt(i + j)) {
					count++;
				}
			}

			min = Math.min(min, count);
		}

		return min;
	}
}
