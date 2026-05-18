import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

class Solution {
	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		for (int tc = 1; tc <= 10; tc++) {
			int N = Integer.parseInt(br.readLine());

			ArrayList<String> list = new ArrayList<>();

			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				list.add(st.nextToken());
			}

			int R = Integer.parseInt(br.readLine());

			StringTokenizer st2 = new StringTokenizer(br.readLine());
			for (int i = 0; i < R; i++) {
				String command = st2.nextToken();

				if (command.equals("I")) {
					int x = Integer.parseInt(st2.nextToken());
					int y = Integer.parseInt(st2.nextToken());

					for (int j = 0; j < y; j++) {
						list.add(x + j, st2.nextToken());
					}

				} else if (command.equals("D")) {
					int x = Integer.parseInt(st2.nextToken());
					int y = Integer.parseInt(st2.nextToken());

					for (int j = 0; j < y; j++) {
						list.remove(x);
					}

				} else {
					int y = Integer.parseInt(st2.nextToken());

					for (int j = 0; j < y; j++) {
						list.add(st2.nextToken());
					}
				}
			}

			sb.append("#").append(tc).append(" ");

			for (int i = 0; i < 10; i++) {
				sb.append(list.get(i)).append(" ");
			}

			sb.append("\n");
		}

		System.out.println(sb);
	}
}