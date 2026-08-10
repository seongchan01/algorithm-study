import java.util.HashSet;

public class Solution { // Lv1. 폰켓몬

	public int solution(int[] nums) {

		HashSet<Integer> set = new HashSet<>();

		for (int num : nums) {
			set.add(num);
		}

		return Math.min(set.size(), nums.length / 2);

	}
}
