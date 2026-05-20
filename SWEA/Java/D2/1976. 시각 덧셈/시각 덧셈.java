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

			int h1 = Integer.parseInt(st.nextToken());
			int m1 = Integer.parseInt(st.nextToken());
			int h2 = Integer.parseInt(st.nextToken());
			int m2 = Integer.parseInt(st.nextToken());

			int hour = h1 + h2;
			int minute = m1 + m2;

			if (minute >= 60) {
				hour++;
				minute %= 60;
			}

			if (hour > 12) {
				hour -= 12;
			}

			sb.append("#").append(tc).append(" ").append(hour).append(" ").append(minute).append("\n");
		}

		System.out.print(sb);
	}
}