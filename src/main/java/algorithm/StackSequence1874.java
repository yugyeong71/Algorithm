package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackSequence1874 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt(br.readLine());

		int[] sequence = new int[count];
		for (int i = 0; i < count; i++) {
			sequence[i] = Integer.parseInt(br.readLine());
		}

		stackSequence(sequence);
	}

	public static void stackSequence(int[] sequence) {
		Stack<Integer> integerStack = new Stack<>();
		StringBuilder result = new StringBuilder();

		int current = 1;

		for (int num : sequence) {
			while (current <= num) {
				integerStack.push(current++);
				result.append("+\n");
			}

			if (!integerStack.isEmpty() && integerStack.peek() == num) {
				integerStack.pop();
				result.append("-\n");
			} else {
				System.out.println("NO");
				return;
			}
		}

		System.out.println(result);
	}

}
