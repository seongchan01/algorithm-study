import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution { // Lv1. 두 개 뽑아서 더하기
	public int[] solution(int[] numbers) {

		Set<Integer> set = new HashSet<>();

		for (int i = 0; i < numbers.length - 1; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				set.add(numbers[i] + numbers[j]);
			}
		}

		int[] answer = new int[set.size()];

		int index = 0;

		for (int sum : set) {
			answer[index++] = sum;
		}

		Arrays.sort(answer);

		return answer;
	}

}