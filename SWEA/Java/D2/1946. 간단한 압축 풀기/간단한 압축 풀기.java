import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());

			sb.append("#").append(tc).append("\n");

			int count = 0;

			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());

				char C = st.nextToken().charAt(0);
				int K = Integer.parseInt(st.nextToken());

				for (int j = 0; j < K; j++) {
					sb.append(C);
					count++;

					if (count % 10 == 0) {
						sb.append("\n");
					}
				}
			}

			if (count % 10 != 0) {
				sb.append("\n");
			}
		}

		System.out.println(sb);
	}
}