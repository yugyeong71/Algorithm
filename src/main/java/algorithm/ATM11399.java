package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ATM11399 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int N = Integer.parseInt(br.readLine());
		int[] time = new int[N];

		String[] input = br.readLine().split(" ");
		for (int i = 0; i < N; i++) {
			time[i] = Integer.parseInt(input[i]);
		}

		System.out.println(atm(time));

	}

	public static int atm(int[] time) {
		Arrays.sort(time);

		int sum = 0;
		int totalTime = 0;

		for (int count : time) {
			sum += count;
			totalTime += sum;
		}

		return totalTime;
	}
}
