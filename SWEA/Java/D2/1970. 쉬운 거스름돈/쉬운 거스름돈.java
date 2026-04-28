import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		int[] arr = { 50000, 10000, 5000, 1000, 500, 100, 50, 10 };

		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());

			sb.append("#").append(tc).append("\n");
			for (int i = 0; i < arr.length; i++) {
				int cnt = N / arr[i];
				N %= arr[i];
				sb.append(cnt).append(" ");
			}
			sb.append("\n");
		}

		System.out.println(sb);
	}
}