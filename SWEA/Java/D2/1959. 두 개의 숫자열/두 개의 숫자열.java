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

			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			int[] A = new int[N];
			int[] B = new int[M];

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				A[i] = Integer.parseInt(st.nextToken());
			}

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < M; i++) {
				B[i] = Integer.parseInt(st.nextToken());
			}

			int[] longArr;
			int[] shortArr;

			if (A.length >= B.length) {
				longArr = A;
				shortArr = B;
			} else {
				longArr = B;
				shortArr = A;
			}

			int answer = 0;

			for (int i = 0; i <= longArr.length - shortArr.length; i++) {
				int sum = 0;

				for (int j = 0; j < shortArr.length; j++) {
					sum += longArr[i + j] * shortArr[j];
				}

				answer = Math.max(answer, sum);
			}

			sb.append("#").append(tc).append(" ").append(answer).append("\n");
		}

		System.out.print(sb);
	}
}