import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
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
			int K = Integer.parseInt(st.nextToken());

			int[] time = new int[N];

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				time[i] = Integer.parseInt(st.nextToken());
			}

			Arrays.sort(time);

			boolean possible = true;

			for (int i = 0; i < N; i++) {
				int made = (time[i] / M) * K;
				int people = i + 1;

				if (made < people) {
					possible = false;
					break;
				}
			}

			sb.append("#").append(tc).append(" ");

			if (possible) {
				sb.append("Possible");
			} else {
				sb.append("Impossible");
			}

			sb.append("\n");
		}

		System.out.println(sb);
	}
}