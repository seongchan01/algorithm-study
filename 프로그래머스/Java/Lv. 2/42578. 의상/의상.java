import java.util.HashMap;
import java.util.Map;

public class Solution { // Lv2. 의상

	public int solution(String[][] clothes) {

		Map<String, Integer> map = new HashMap<>();

		for (String[] c : clothes) {
			map.put(c[1], map.getOrDefault(c[1], 0) + 1);
		}

		int answer = 1;

		for (int n : map.values()) {
			answer = answer * (n + 1);
		}

		return answer - 1;
	}
}