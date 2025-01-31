package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class KeyLogger5397 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int count = Integer.parseInt(br.readLine());

		for (int i = 1; i <= count; i++) {
			System.out.println(keyLogger(br.readLine()));
		}
	}

	public static String keyLogger(String input) {
		LinkedList<String> linkedList = new LinkedList<>();
		ListIterator<String> list = linkedList.listIterator();

		String[] chars = input.split("");
		for (String s : chars) {
			switch (s) {
				case "-" -> {
					if (list.hasPrevious()) {
						list.previous();
						list.remove();
					}
				}
				case "<" -> {
					if (list.hasPrevious()) {
						list.previous();
					}
				}
				case ">" -> {
					if (list.hasNext()) {
						list.next();
					}
				}
				default -> list.add(s);
			}
		}

		StringBuilder sb = new StringBuilder();
		for (String s : linkedList) {
			sb.append(s);
		}

		return sb.toString();
	}

}
