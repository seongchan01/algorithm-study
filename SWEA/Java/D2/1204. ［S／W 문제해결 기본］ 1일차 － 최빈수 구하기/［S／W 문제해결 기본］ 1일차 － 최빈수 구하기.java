import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			int t = Integer.parseInt(br.readLine());

			int[] score = new int[101];

			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 1000; i++) {
				int n = Integer.parseInt(st.nextToken());

				score[n]++;
			}

			int max = 0;
			int answer = 0;

			for (int i = 0; i < 100; i++) {
				if (max <= score[i]) {
					max = score[i];
					answer = i;
				}
			}

			sb.append("#").append(t).append(" ").append(answer).append("\n");
		}

		System.out.print(sb);
	}
}