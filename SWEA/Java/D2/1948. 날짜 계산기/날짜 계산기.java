import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int M1 = Integer.parseInt(st.nextToken());
			int D1 = Integer.parseInt(st.nextToken());
			int M2 = Integer.parseInt(st.nextToken());
			int D2 = Integer.parseInt(st.nextToken());

			int day1 = 0;
			int day2 = 0;

			for (int i = 0; i < M1 - 1; i++) {
				day1 += days[i];
			}
			day1 += D1;

			for (int i = 0; i < M2 - 1; i++) {
				day2 += days[i];
			}
			day2 += D2;

			int answer = day2 - day1 + 1;

			sb.append("#").append(tc).append(" ").append(answer).append("\n");
		}

		System.out.print(sb);
	}
}