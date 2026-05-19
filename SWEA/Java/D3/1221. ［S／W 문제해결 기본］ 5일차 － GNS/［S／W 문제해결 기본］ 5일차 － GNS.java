import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder answer = new StringBuilder();

		String[] nums = { "ZRO", "ONE", "TWO", "THR", "FOR", "FIV", "SIX", "SVN", "EGT", "NIN" };

		HashMap<String, Integer> map = new HashMap<>();

		for (int i = 0; i < nums.length; i++) {
			map.put(nums[i], i);
		}

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			String testcase = st.nextToken();
			int N = Integer.parseInt(st.nextToken());

			int[] count = new int[10];

			st = new StringTokenizer(br.readLine());

			for (int i = 0; i < N; i++) {
				String num = st.nextToken();

				int idx = map.get(num);
				count[idx]++;
			}

			answer.append(testcase).append("\n");

			for (int i = 0; i < 10; i++) {
				for (int j = 0; j < count[i]; j++) {
					answer.append(nums[i]).append(" ");
				}
			}

			answer.append("\n");
		}

		System.out.println(answer);
	}
}