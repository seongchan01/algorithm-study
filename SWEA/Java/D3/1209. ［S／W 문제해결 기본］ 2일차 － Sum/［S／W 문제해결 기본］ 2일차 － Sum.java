import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		for (int tc = 1; tc <= 10; tc++) {
			int T = Integer.parseInt(br.readLine());

			int[][] arr = new int[100][100];

			for (int i = 0; i < 100; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < 100; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			int answer = 0;

			for (int i = 0; i < 100; i++) {
				int xSum = 0;
				int ySum = 0;

				for (int j = 0; j < 100; j++) {
					xSum += arr[i][j];
					ySum += arr[j][i];
				}

				answer = Math.max(answer, xSum);
				answer = Math.max(answer, ySum);
			}

			int diag1 = 0;
			int diag2 = 0;
			for (int i = 0; i < 100; i++) {

				diag1 += arr[i][i];
				diag2 += arr[i][99 - i];
			}

			answer = Math.max(answer, diag1);
			answer = Math.max(answer, diag2);

			sb.append("#").append(tc).append(" ").append(answer).append("\n");
		}

		System.out.println(sb);
	}

}