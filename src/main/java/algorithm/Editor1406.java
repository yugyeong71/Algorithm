package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;

public class Editor1406 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();
		int count = Integer.parseInt(br.readLine());

		String[] commands = new String[count];
		for (int i = 0; i < count; i++) {
			commands[i] = br.readLine();
		}

		System.out.println(editor(str, commands));
	}

	public static String editor(String str, String[] commands) {
		LinkedList<Character> linkedList = new LinkedList<>();

		for (int i = 0; i < str.length(); i++) {
			linkedList.add(str.charAt(i));
		}

		ListIterator<Character> list = linkedList.listIterator();

		while (list.hasNext()) {
			list.next();
		}

		for (String command : commands) {
			char c = command.charAt(0);
			switch (c) {
				case 'L' -> {
					if (list.hasPrevious()) {
						list.previous();
					}
				}
				case 'D' -> {
					if (list.hasNext()) {
						list.next();
					}
				}
				case 'B' -> {
					if (list.hasPrevious()) {
						list.previous();
						list.remove();
					}
				}
				case 'P' -> {
					char t = command.charAt(2);
					list.add(t);
				}
				default -> {
				}
			}
		}

		StringBuilder sb = new StringBuilder();
		for (Character c : linkedList) {
			sb.append(c);
		}

		return sb.toString();
	}
}
