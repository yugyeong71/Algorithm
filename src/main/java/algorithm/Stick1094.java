package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Stick1094 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int X = Integer.parseInt(br.readLine());
		int stick = 64;
		int count = 0;

		System.out.println(stick(X, stick, count));
	}

	private static int stick(int X, int stick, int count) {
		while (X > 0) {
			if (stick > X) {
				stick /= 2;
			} else {
				X -= stick;
				count++;
			}
		}
		return count;
	}
}
