import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution { // 1238. Contact

	static ArrayList<Integer>[] list;
	static boolean[] visit;
	static int result;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		for (int t = 1; t <= 10; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int N = Integer.parseInt(st.nextToken());
			int start = Integer.parseInt(st.nextToken());

			list = new ArrayList[101];

			for (int i = 1; i <= 100; i++) {
				list[i] = new ArrayList<>();
			}

			st = new StringTokenizer(br.readLine());

			for (int i = 0; i < N / 2; i++) {
				int from = Integer.parseInt(st.nextToken());
				int to = Integer.parseInt(st.nextToken());

				list[from].add(to);
			}

			visit = new boolean[101];

			bfs(start);

			sb.append("#").append(t).append(" ").append(result).append("\n");
		}

		System.out.println(sb);

	}

	static void bfs(int start) {
		Queue<Integer> queue = new ArrayDeque<>();

		queue.offer(start);

		visit[start] = true;

		result = start;

		while (!queue.isEmpty()) {
			int max = 0;
			int size = queue.size();

			for (int i = 0; i < size; i++) {
				int now = queue.poll();

				max = Math.max(max, now);

				for (int next : list[now]) {
					if (!visit[next]) {
						visit[next] = true;
						queue.offer(next);
					}
				}
			}

			result = max;
		}

	}

}
