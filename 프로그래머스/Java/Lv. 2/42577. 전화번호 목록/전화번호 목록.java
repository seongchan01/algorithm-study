import java.util.HashSet;
import java.util.Set;

public class Solution { // Lv2. 전화번호 목록

	public boolean solution(String[] phone_book) {

		boolean answer = true;

		Set<String> set = new HashSet<>();

		for (String num : phone_book) {
			set.add(num);
		}

		for (String num : phone_book) {

			int n = num.length();
			String str = "";

			for (int i = 0; i < n - 1; i++) {
				str += num.charAt(i);

				if (set.contains(str)) {
					answer = false;
					break;
				}
			}

			if (!answer) {
				break;
			}
		}

		return answer;
	}

}