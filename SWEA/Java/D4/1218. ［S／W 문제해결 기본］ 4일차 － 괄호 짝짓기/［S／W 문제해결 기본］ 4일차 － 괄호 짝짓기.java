import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

/**
 * [문제 해석]
 * 4 종류의 괄호문자들 '()', '[]', '{}', '<>' 의 문자열
 * 이 문자열에 사용된 괄호들의 짝이 맞는지 판단
 * ex) ({[]}) (O)
 * 	   (({{[])) (X)
 * 
 * 유효성 여부를 1과 0으로 출력하라
 * 
 * [풀이]
 * Stack으로 가장 위에 있는 괄호와 다음 괄호 비교
 */

public class Solution { // D4. 괄호 짝짓기

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		for (int tc = 1; tc <= 10; tc++) {
			Deque<Character> stack = new ArrayDeque<>();

			int N = Integer.parseInt(br.readLine());
			String line = br.readLine();

			for (int i = 0; i < N; i++) {
				char c = line.charAt(i);

				if (!stack.isEmpty()) {
					char now = stack.peek();

					if ((now == '(' && c == ')') || (now == '[' && c == ']') || (now == '{' && c == '}')
							|| (now == '<' && c == '>')) {
						stack.pop();
						continue;
					}
				}

				stack.push(c);
			}

			int answer;

			if (stack.isEmpty()) {
				answer = 1;
			} else {
				answer = 0;
			}

			sb.append("#").append(tc).append(" ").append(answer).append("\n");
		}

		System.out.println(sb);
	}
}