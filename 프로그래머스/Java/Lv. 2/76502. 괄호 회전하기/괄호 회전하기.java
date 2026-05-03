import java.util.ArrayDeque;

class Solution {
	public int solution(String s) {
		int answer = 0;
		int n = s.length();

		for (int i = 0; i < n; i++) {
			ArrayDeque<Character> stack = new ArrayDeque<>();
			boolean isValid = true;

			for (int j = 0; j < n; j++) {
				char c = s.charAt((i + j) % n);

				if (!stack.isEmpty() && ((stack.peek() == '(' && c == ')') || (stack.peek() == '{' && c == '}')
						|| (stack.peek() == '[' && c == ']'))) {
					stack.pop();
				} else if (c == ')' || c == '}' || c == ']') {
					isValid = false;
					break;
				} else {
					stack.push(c);
				}
			}

			if (isValid && stack.isEmpty()) {
				answer++;
			}
		}

		return answer;
	}
}