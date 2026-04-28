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

			int[] arr = new int[10];

			for (int i = 0; i < 10; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			Arrays.sort(arr);

			int sum = 0;
			for (int i = 1; i < arr.length - 1; i++) {
				sum += arr[i];
			}

			sb.append("#").append(tc).append(" ").append(Math.round((double) sum / 8)).append("\n");
		}

		System.out.println(sb);
	}
}