package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class ACM11531 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Map<String, Integer> success = new HashMap<>();
		Map<String, Integer> fail = new HashMap<>();

		String log;
		while ((log = br.readLine()) != null) {
			String[] parts = log.split(" ");
			if (parts[0].equals("-1")) break;

			int time = Integer.parseInt(parts[0]);
			String problem = parts[1];
			String result = parts[2];

			if (!success.containsKey(problem)) {
				if (result.equals("right")) {
					success.put(problem, time);
				} else {
					fail.put(problem, fail.getOrDefault(problem, 0) + 1);
				}
			}
		}

		int totalCount = success.size();
		int totalPenalty = success.entrySet().stream()
			.mapToInt(e -> e.getValue() + fail.getOrDefault(e.getKey(), 0) * 20)
			.sum();

		System.out.println(totalCount + " " + totalPenalty);
	}
}
