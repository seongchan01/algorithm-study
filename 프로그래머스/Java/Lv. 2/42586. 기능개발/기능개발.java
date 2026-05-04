import java.util.ArrayDeque;
import java.util.ArrayList;

class Solution {
	public int[] solution(int[] progresses, int[] speeds) {
		ArrayList<Integer> result = new ArrayList<Integer>();

		ArrayDeque<Integer> day = new ArrayDeque<>();

		for (int i = 0; i < progresses.length; i++) {
			int d = (int) Math.ceil((100 - progresses[i]) / (double) speeds[i]);
			day.addLast(d);
		}

		while (!day.isEmpty()) {
			int now = day.pollFirst();
			int count = 1;

			while (!day.isEmpty() && day.peekFirst() <= now) {
				day.pollFirst();
				count++;
			}

			result.add(count);
		}

		int[] answer = new int[result.size()];

		for (int i = 0; i < answer.length; i++) {
			answer[i] = result.get(i);
		}

		return answer;
	}
}