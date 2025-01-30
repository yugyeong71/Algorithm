package com.company.src.algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class Queue10845 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Deque<Integer> queue = new LinkedList<>();

		int N = Integer.parseInt(br.readLine());

		for (int i = 0; i < N; i++) {
			String[] command = br.readLine().split(" ");
			queue(queue, command);
		}
	}

	private static void queue(Deque<Integer> queue, String[] command) {
		switch (command[0]) {
			case "push":
				int number = Integer.parseInt(command[1]);
				queue.add(number);
				break;
			case "pop":
				System.out.println(queue.isEmpty() ? "-1" : queue.poll());
				break;
			case "size":
				System.out.println(queue.size());
				break;
			case "empty":
				System.out.println(queue.isEmpty() ? "1" : "0");
				break;
			case "front":
				System.out.println(queue.isEmpty() ? "-1" : queue.peekFirst());
				break;
			case "back":
				System.out.println(queue.isEmpty() ? "-1" : queue.peekLast());
				break;
		}
	}

}
