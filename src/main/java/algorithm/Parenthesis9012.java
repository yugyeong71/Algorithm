package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Parenthesis9012 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int t = Integer.parseInt(br.readLine());

		for (int i = 0; i < t; i++) {
			System.out.println(parenthesis(br.readLine()));
		}
	}

	public static String parenthesis(String str) {
		Stack<String> stack = new Stack<>();

		String[] chars = str.split("");

		for (int i = 0; i < str.length(); i++) {
			if (chars[i].equals("(")) {
				stack.push(chars[i]);
			} else if (chars[i].equals(")")) {
				if (stack.isEmpty()) {
					return "NO";
				}
				stack.pop();
			}
		}

		return stack.isEmpty() ? "YES" : "NO";
	}

}
