package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.StringTokenizer;

public class RotatingQueue1021 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());

		List<Integer> list = new ArrayList<>();
		st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}

		System.out.println(rotatingQueue(N, list));
	}

	private static int rotatingQueue(int N, List<Integer> targets) {
		Deque<Integer> deque = new LinkedList<>();

		for (int i = 1; i <= N; i++) {
			deque.add(i);
		}

		int total = 0;

		for (int target : targets) {
			int index = 0;

			for (int num : deque) {
				if (num == target) break;
				index++;
			}

			int left = index;
			int right = deque.size() - index;

			if (left <= right) {
				for (int i = 0; i < left; i++) {
					deque.addLast(deque.pollFirst());
					total++;
				}
			} else {
				for (int i = 0; i < right; i++) {
					deque.addFirst(deque.pollLast());
					total++;
				}
			}

			deque.pollFirst();
		}

		return total;
	}

}
