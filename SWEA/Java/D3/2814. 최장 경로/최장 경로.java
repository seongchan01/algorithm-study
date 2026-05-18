import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
	private static boolean[] visit;
	private static boolean[][] graph;
	private static int N;
	private static int answer;

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());

			graph = new boolean[N + 1][N + 1];
			visit = new boolean[N + 1];
			answer = 0;

			for (int i = 0; i < M; i++) {
				StringTokenizer st2 = new StringTokenizer(br.readLine());

				int x = Integer.parseInt(st2.nextToken());
				int y = Integer.parseInt(st2.nextToken());

				graph[x][y] = true;
				graph[y][x] = true;
			}

			for (int i = 1; i <= N; i++) {
				dfs(i, 1);
			}

			sb.append("#").append(tc).append(" ").append(answer).append("\n");
		}

		System.out.print(sb);
	}

	static void dfs(int now, int length) {
		answer = Math.max(answer, length);

		visit[now] = true;

		for (int next = 1; next <= N; next++) {
			if (graph[now][next] && !visit[next]) {
				dfs(next, length + 1);
			}
		}

		visit[now] = false;
	}
}