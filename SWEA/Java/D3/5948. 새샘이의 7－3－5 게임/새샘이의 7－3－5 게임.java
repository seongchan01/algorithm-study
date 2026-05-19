import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

class Solution {
	static int[] arr;
	static HashSet<Integer> set;

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			arr = new int[7];

			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 7; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}

			set = new HashSet<>();

			dfs(0, 0, 0);

			ArrayList<Integer> list = new ArrayList<Integer>(set);

			Collections.sort(list, Collections.reverseOrder());

			sb.append("#").append(tc).append(" ").append(list.get(4)).append("\n");
		}

		System.out.println(sb);
	}

	static void dfs(int start, int depth, int sum) {

		if (depth == 3) {
			set.add(sum);
			return;
		}

		for (int i = start; i < 7; i++) {
			dfs(i + 1, depth + 1, sum + arr[i]);
		}
	}
}