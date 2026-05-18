import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

class Solution {

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		for (int tc = 1; tc <= 10; tc++) {
			int T = Integer.parseInt(br.readLine());

			Queue<Integer> queue = new ArrayDeque<>();

			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 8; i++) {
				queue.add(Integer.parseInt(st.nextToken()));
			}

			boolean cycle = true;

			while (cycle) {
				for (int i = 1; i <= 5; i++) {
					int num = queue.poll() - i;

					if (num < 1) {
						num = 0;
						queue.add(num);
						cycle = false;
						break;
					} else {
						queue.add(num);
					}
				}

				if (!cycle) {
					break;
				}
			}

			sb.append("#").append(T).append(" ");

			while (!queue.isEmpty()) {
				sb.append(queue.poll()).append(" ");
			}

			sb.append("\n");
		}

		System.out.print(sb);
	}
}