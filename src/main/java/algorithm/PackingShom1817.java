package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PackingShom1817 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		if (N == 0) {
			System.out.println(0);
			return;
		}

		st = new StringTokenizer(br.readLine());

		int boxWeight = 0, boxCount = 1;

		for (int i = 0; i < N; i++) {
			int weight = Integer.parseInt(st.nextToken());
			if (boxWeight + weight > M) {
				boxCount++;
				boxWeight = 0;
			}
			boxWeight += weight;
		}

		System.out.println(boxCount);
	}

}
