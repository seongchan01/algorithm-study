import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;

/**
 * [문제 분석]
 * 16*16 행렬의 미로에서 시작점에서 출발해서 도착점에 도착할 수 있는지 판별
 * 시작점: (2,2)
 * 도착점: (3,3)
 * 
 * [풀이]
 * 출발점에서 bfs
 */

public class Solution { // D4. 미로1

	static int[][] arr;
	static int[] dx = { 0, 0, 1, -1 };
	static int[] dy = { 1, -1, 0, 0 };

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		for (int tc = 1; tc <= 10; tc++) {
			int T = Integer.parseInt(br.readLine());

			arr = new int[16][16];
			int startX = 0;
			int startY = 0;

			for (int i = 0; i < 16; i++) {
				String line = br.readLine();

				for (int j = 0; j < 16; j++) {
					arr[i][j] = line.charAt(j) - '0';

					if (arr[i][j] == 2) {
						startX = i;
						startY = j;
					}
				}
			}

			int answer = bfs(startX, startY);

			sb.append("#").append(T).append(" ").append(answer).append("\n");
		}

		System.out.println(sb);
	}

	static int bfs(int startX, int startY) {
		boolean[][] visit = new boolean[16][16];

		ArrayDeque<int[]> queue = new ArrayDeque<int[]>();
		queue.offer(new int[] { startX, startY });
		visit[startX][startY] = true;

		while (!queue.isEmpty()) {
			int[] now = queue.poll();
			int x = now[0];
			int y = now[1];

			for (int i = 0; i < 4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];

				if (nx < 0 || nx >= 16 || ny < 0 || ny >= 16) {
					continue;
				}

				if (arr[nx][ny] == 3) {
					return 1;
				}

				if (arr[nx][ny] == 1 || visit[nx][ny]) {
					continue;
				}

				visit[nx][ny] = true;

				queue.offer(new int[] { nx, ny });

			}
		}

		return 0;
	}

}
