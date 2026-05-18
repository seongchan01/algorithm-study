import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		for (int tc = 1; tc <= 10; tc++) {
			int T = Integer.parseInt(br.readLine());

			String word = br.readLine();
			String sentence = br.readLine();

			int n = word.length();

			int answer = 0;

			for (int i = 0; i <= sentence.length() - n; i++) {
				String str = sentence.substring(i, i + n);

				if (word.equals(str)) {
					answer++;
				}
			}

			sb.append("#").append(T).append(" ").append(answer).append("\n");
		}

		System.out.println(sb);
	}
}