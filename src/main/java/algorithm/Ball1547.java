package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Ball1547 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int M = Integer.parseInt(br.readLine());
		int ball = 1;

		for (int i = 0; i < M; i++) {
			String[] input = br.readLine().split(" ");
			int X = Integer.parseInt(input[0]);
			int Y = Integer.parseInt(input[1]);

			if (ball == X) {
				ball = Y;
			} else if (ball == Y) {
				ball = X;
			}
		}

		System.out.println(ball);
	}
}
