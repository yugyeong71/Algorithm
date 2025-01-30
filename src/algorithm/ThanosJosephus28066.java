package com.company.src.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class ThanosJosephus28066 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		System.out.println(thanosJosephus(N, K));
	}

	private static int thanosJosephus(int N, int K) {
		Queue<Integer> queue = new LinkedList<>();

		for (int i = 1; i <= N; i++) {
			queue.add(i);
		}

		while (queue.size() > 1) {
			int first = queue.poll();

			int removeCount = Math.min(K - 1, queue.size());

			for (int i = 0; i < removeCount; i++) {
				queue.poll();
			}

			queue.add(first);
		}

		return queue.peek();
	}
}
