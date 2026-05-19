import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		for (int tc = 1; tc <= 10; tc++) {
			int N = Integer.parseInt(br.readLine());

			int[][] arr = new int[N][N];

			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			int answer = 0;

			for (int j = 0; j < N; j++) {
				boolean isN = false;

				for (int i = 0; i < N; i++) {
					if (arr[i][j] == 1) {
						isN = true;
					}

					if (isN && arr[i][j] == 2) {
						answer++;
						isN = false;
					}
				}
			}

			sb.append("#").append(tc).append(" ").append(answer).append("\n");
		}

		System.out.println(sb);
	}

}