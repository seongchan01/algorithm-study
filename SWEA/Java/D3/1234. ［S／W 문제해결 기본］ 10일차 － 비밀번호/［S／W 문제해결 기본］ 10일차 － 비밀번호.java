import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.StringTokenizer;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = 10;

		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int N = Integer.parseInt(st.nextToken());

			String pw = st.nextToken();
			ArrayDeque<Integer> stack = new ArrayDeque<>();

			for (int i = 0; i < N; i++) {
				int n = pw.charAt(i) - '0';

				if (!stack.isEmpty() && stack.peek() == n) {
					stack.pop();
				} else {
					stack.push(n);
				}
			}

			sb.append("#").append(tc).append(" ");

			StringBuilder result = new StringBuilder();
			while (!stack.isEmpty()) {
				result.append(stack.pop());
			}

			sb.append(result.reverse()).append("\n");
		}

		System.out.print(sb);
	}
}