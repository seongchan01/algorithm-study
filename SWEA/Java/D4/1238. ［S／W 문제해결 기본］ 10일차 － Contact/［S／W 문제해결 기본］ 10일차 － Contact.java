import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * [문제 해석]
 * 비상연락망과 연락을 시작하는 당번에 대한 주소가 주어질 때, 가장 나중에 연락을 받게 되는 사람 중 가장 번호가 큰 사람을 구해라
 * 화살표로 이어진 사람한테만 단방향으로 연락이 가능하다.
 * 화살표가 2개 이상 이어진 경우 동시에 다자 간 연락도 가능
 * 이미 연락을 받은 상태면 다시 연락하지 않는다
 * 더 이상 연락을 할 수 없을 때 마지막에 동시에 연락을 받은 사람의 숫자가 큰 숫자를 출력
 * 
 * [풀이]
 * 동시에 연락이 퍼지므로 BFS를 사용한다.
 * queue.size()로 같은 단계의 사람들을 묶어서 탐색한다.
 * 각 단계의 최댓값을 갱신하고, 마지막 단계의 최댓값을 출력한다.
 */

public class Solution { // D4. Contact

	static int N, start;
	static ArrayList<Integer>[] list;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		for (int tc = 1; tc <= 10; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			N = Integer.parseInt(st.nextToken());
			start = Integer.parseInt(st.nextToken());

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

			int answer = bfs(start);

			sb.append("#").append(tc).append(" ").append(answer).append("\n");
		}

		System.out.println(sb);
	}

	static int bfs(int start) {
		boolean visit[] = new boolean[101];

		Queue<Integer> queue = new ArrayDeque<>();
		queue.offer(start);
		visit[start] = true;

		int result = start;

		while (!queue.isEmpty()) {
			int size = queue.size();

			int max = 0;

			for (int i = 0; i < size; i++) {

				int now = queue.poll();

				max = Math.max(max, now);

				for (int next : list[now]) {

					if (visit[next]) {
						continue;
					}

					visit[next] = true;
					queue.offer(next);
				}
			}

			result = max;
		}

		return result;

	}

}
