import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution { // 1219. 길찾기

	static int[] arr1;
	static int[] arr2;
	static int result;
	static boolean[] visit;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		for (int T = 1; T <= 10; T++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int tc = Integer.parseInt(st.nextToken());
			int N = Integer.parseInt(st.nextToken());

			arr1 = new int[100];
			Arrays.fill(arr1, -1);
			arr2 = new int[100];
			Arrays.fill(arr2, -1);

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());

				if (arr1[a] == -1) {
					arr1[a] = b;
				} else {
					arr2[a] = b;
				}
			}

			visit = new boolean[100];
			result = 0;

			dfs(0);

			sb.append("#").append(tc).append(" ").append(result).append("\n");
		}

		System.out.println(sb);

	}

	static void dfs(int now) {

		if (now == 99) {
			result = 1;
			return;
		}

		visit[now] = true;

		int next1 = arr1[now];
		if (next1 != -1 && !visit[next1]) {
			dfs(next1);
		}

		if (result == 1) {
			return;
		}

		int next2 = arr2[now];
		if (next2 != -1 && !visit[next2]) {
			dfs(next2);
		}
	}

}
