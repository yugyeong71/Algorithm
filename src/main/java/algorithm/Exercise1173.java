package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Exercise1173 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");

		int N = Integer.parseInt(input[0]);
		int m = Integer.parseInt(input[1]);
		int M = Integer.parseInt(input[2]);
		int T = Integer.parseInt(input[3]);
		int R = Integer.parseInt(input[4]);

		System.out.println(exercise(N, m, M, T, R));
	}

	private static int exercise(int N, int m, int M, int T, int R) {
		if (m + T > M) return -1;

		int totalTime = 0;
		int exerciseTime = 0;
		int currentPulse = m;

		while (exerciseTime < N) {
			if (currentPulse + T <= M) {
				currentPulse += T;
				exerciseTime++;
			} else {
				if (currentPulse == m) {
					return -1;
				}
				currentPulse = Math.max(currentPulse - R, m);
			}

			totalTime++;
		}

		return totalTime;
	}
}
