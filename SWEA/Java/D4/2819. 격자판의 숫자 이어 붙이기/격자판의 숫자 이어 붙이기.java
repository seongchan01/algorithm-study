import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Solution { // 2819. 격자판의 숫자 이어 붙이기

	static int[][] arr;
	static int answer;
	static Set<String> set;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {

			arr = new int[4][4];

			for (int i = 0; i < 4; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());

				for (int j = 0; j < 4; j++) {
					arr[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			answer = 0;
			set = new HashSet<>();

			for (int i = 0; i < 4; i++) {
				for (int j = 0; j < 4; j++) {
					dfs(i, j, String.valueOf(arr[i][j]));
				}
			}

			sb.append("#").append(tc).append(" ").append(answer).append("\n");
		}

		System.out.println(sb);
	}

	static void dfs(int i, int j, String num) {

		if (num.length() == 7) {
			if (set.add(num)) {
				answer++;
			}

			return;
		}

		int[] dx = { 1, -1, 0, 0 };
		int[] dy = { 0, 0, 1, -1 };

		int dir = 0;

		for (int k = 0; k < 4; k++) {
			dir = (dir + k) % 4;

			int nx = i + dx[dir];
			int ny = j + dy[dir];

			if (nx < 0 || ny < 0 || nx >= 4 || ny >= 4) {
				continue;
			}

			dfs(nx, ny, num + String.valueOf(arr[nx][ny]));
		}

	}
}
