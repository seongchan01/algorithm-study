import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			String memory = br.readLine();

			int answer = 0;

			boolean isZero = true;
			for (int i = 0; i < memory.length(); i++) {
				int bit = memory.charAt(i) - '0';

				if (isZero && bit == 1) {
					answer += 1;
					isZero = false;
				}

				if (!isZero && bit == 0) {
					answer += 1;
					isZero = true;
				}
			}

			sb.append("#").append(tc).append(" ").append(answer).append("\n");
		}

		System.out.println(sb);
	}

}