import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

class Solution {
	static int N;
	static char[] arr;
	static int answer;
	static HashSet<String> visited;

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			String str = st.nextToken();
			N = Integer.parseInt(st.nextToken());

			arr = str.toCharArray();
			answer = 0;
			visited = new HashSet<String>();

			dfs(0);

			sb.append("#").append(tc).append(" ").append(answer).append("\n");
		}

		System.out.print(sb);
	}

	static void dfs(int cnt) {
		String state = new String(arr) + " " + cnt;

		if (visited.contains(state)) {
			return;
		}

		visited.add(state);

		if (cnt == N) {
			int num = Integer.parseInt(new String(arr));
			answer = Math.max(answer, num);
			return;
		}

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				swap(i, j);
				dfs(cnt + 1);
				swap(i, j);
			}
		}
	}

	static void swap(int i, int j) {
		char temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}