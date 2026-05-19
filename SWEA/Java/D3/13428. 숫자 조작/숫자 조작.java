import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
	static int[] arr;

	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder answer = new StringBuilder();

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			String str = br.readLine();

			arr = new int[str.length()];

			for (int i = 0; i < str.length(); i++) {
				arr[i] = str.charAt(i) - '0';
			}

			int original = Integer.parseInt(str);
			int max = original;
			int min = original;

			for (int i = 0; i < arr.length; i++) {
				for (int j = i + 1; j < arr.length; j++) {
					swap(i, j);

					if (arr[0] != 0) {
						int num = 0;

						for (int k = 0; k < arr.length; k++) {
							num = num * 10 + arr[k];
						}

						max = Math.max(max, num);
						min = Math.min(min, num);
					}

					swap(i, j);
				}
			}

			answer.append("#").append(tc).append(" ").append(min).append(" ").append(max).append("\n");
		}

		System.out.print(answer);
	}

	static void swap(int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}