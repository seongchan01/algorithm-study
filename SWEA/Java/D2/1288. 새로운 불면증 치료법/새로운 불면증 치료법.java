import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
	static boolean check;

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			int N = Integer.parseInt(br.readLine());

			boolean[] allSee = new boolean[10];
			check = false;

			int idx = 1;

			while (!check) {
				int current = N * idx;

				String num = String.valueOf(current);

				for (int i = 0; i < num.length(); i++) {
					int n = num.charAt(i) - '0';
					allSee[n] = true;
				}

				test(allSee);

				if (check) {
					break;
				}

				idx++;
			}

			sb.append("#").append(tc).append(" ").append(N * idx).append("\n");
		}

		System.out.print(sb);
	}

	static void test(boolean[] allSee) {
		for (int i = 0; i < allSee.length; i++) {
			if (!allSee[i]) {
				check = false;
				return;
			}
		}

		check = true;
	}
}