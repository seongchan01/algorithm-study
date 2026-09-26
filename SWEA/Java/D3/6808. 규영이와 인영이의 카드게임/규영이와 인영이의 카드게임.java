import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * [문제 분석]
 * 규영이와 인영이는 1~18까지의 수가 적힌 18개의 카드로 게임중
 * 9장씩 카드를 나눠 갖고, 9라운드동안 게임 진행
 * 한 라운드에는 한 장씩 카드를 내고 두 사람이 낸 카드에 적힌 수를 비교해서 점수 계산
 * 높은 수가 적힌 카드를 낸 사람은 두 카드에 적힌 수의 합만큼 점수 얻고, 낮은 수가 적힌 카드를 낸 사람은 0점
 * 9라운드가 끝나고 총점이 높은 사람이 승자, 총점이 같으면 무승부
 * 규영이가 받은 카드 9장이 주어지고, 주어지는 대로 카드를 낸다고 했을 때, 인영이가 카드를 어떻게 내는지에 따라 승패가 달라짐
 * 규영이가 이기는 경우와 지는 경우가 몇가지인지 구해야 함
 * 
 * [풀이]
 * 규영이가 가지지 않은 9장의 카드를 인영이의 카드로 저장한다.
 * DFS로 인영이가 내는 카드의 모든 경우의 수 확인
 * 각 라운드마다 두 카드의 크기를 비교해서 이긴 사람에게 두 카드의 합을 더함
 * 모든 라운드가 끝나면 최종 점수 비교
 */

public class Solution { // D3. 규영이와 인영이의 카드 게임

	static int[] gyu;
	static int[] in;
	static boolean[] card;

	static int win;
	static int lose;
	static boolean[] visit;

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			gyu = new int[9];
			in = new int[9];
			card = new boolean[19];

			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 9; i++) {
				int c = Integer.parseInt(st.nextToken());
				card[c] = true;

				gyu[i] = c;
			}

			// 인영이 카드
			int index = 0;
			for (int i = 1; i <= 18; i++) {
				if (!card[i]) {
					in[index++] = i;
				}
			}

			win = 0;
			lose = 0;
			visit = new boolean[9];

			dfs(0, 0, 0);

			sb.append("#").append(tc).append(" ").append(win).append(" ").append(lose).append("\n");
		}

		System.out.println(sb);
	}

	static void dfs(int depth, int gyuScore, int inScore) {

		if (depth == 9) {
			if (gyuScore > inScore) {
				win++;
			} else if (gyuScore < inScore) {
				lose++;
			}

			return;
		}

		for (int i = 0; i < 9; i++) {

			if (visit[i]) {
				continue;
			}

			visit[i] = true;

			int sum = gyu[depth] + in[i];

			if (gyu[depth] > in[i]) {
				dfs(depth + 1, gyuScore + sum, inScore);

			} else {
				dfs(depth + 1, gyuScore, inScore + sum);
			}

			visit[i] = false;
		}
	}
}
