import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());

			int[][] arr = new int[N][N];

			int[] dx = { 0, 1, 0, -1 };
			int[] dy = { 1, 0, -1, 0 };

			int x = 0;
			int y = 0;
			int dir = 0;

			for (int num = 1; num <= N * N; num++) {
				arr[x][y] = num;

				if (num == N * N) {
					break;
				}

				int nx = x + dx[dir];
				int ny = y + dy[dir];

				if (nx < 0 || ny < 0 || nx >= N || ny >= N || arr[nx][ny] != 0) {
					dir = (dir + 1) % 4;

					nx = x + dx[dir];
					ny = y + dy[dir];
				}

				x = nx;
				y = ny;
			}

			sb.append("#").append(tc).append("\n");

			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					sb.append(arr[i][j]).append(" ");
				}
				sb.append("\n");
			}
		}

		System.out.println(sb);
	}

}
