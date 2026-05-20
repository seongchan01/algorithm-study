import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());

			int answer = 0;

			while (A <= N && B <= N) {
				if (A <= B) {
					A += B;
				} else {
					B += A;
				}
				answer++;
			}

			sb.append(answer).append("\n");
		}

		System.out.println(sb);
	}
}