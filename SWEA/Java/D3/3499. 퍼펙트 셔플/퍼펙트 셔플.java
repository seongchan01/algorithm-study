import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

/**
 * [문제 해석]
 * N개의 카드덱이 있을 때 카드 덱을 정확히 절반으로 나누고 교대로 카드 뽑는다.
 * 예) ABC / DEF -> A D B E C F
 * 어떤 순서가 되는지 최종 출력
 * 
 * [풀이]
 * 반으로 나눠서 두 개의 Queue에 담고 번갈아 가면서 출력한다.
 * N이 홀수이면, 교대로 놓을 때 먼저 놓는 쪽에 한 장이 더 들어가게 하면 된다 -> N+1/2
 */

public class Solution { // D3. 퍼펙트셔플

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			Queue<String> queue1 = new ArrayDeque<String>();
			Queue<String> queue2 = new ArrayDeque<String>();

			int N = Integer.parseInt(br.readLine());

			int half = (N + 1) / 2;

			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				if (i < half) {
					queue1.offer(st.nextToken());
				} else {
					queue2.offer(st.nextToken());
				}
			}

			sb.append("#").append(tc).append(" ");

			while (!queue1.isEmpty()) {

				sb.append(queue1.poll()).append(" ");

				if (!queue2.isEmpty()) {
					sb.append(queue2.poll()).append(" ");
				}
			}

			sb.append("\n");
		}

		System.out.println(sb);
	}

}
