import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {

	public static void main(String args[]) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		for (int tc = 1; tc <= 10; tc++) {
			int N = Integer.parseInt(br.readLine());

			char[][] arr = new char[8][8];

			for (int i = 0; i < 8; i++) {
				String str = br.readLine();
				for (int j = 0; j < 8; j++) {
					arr[i][j] = str.charAt(j);
				}
			}

			int answer = 0;

			for (int i = 0; i < 8; i++) {
				for (int j = 0; j <= 8 - N; j++) {
					StringBuilder sb1 = new StringBuilder();
					StringBuilder sb2 = new StringBuilder();

					for (int k = 0; k < N; k++) {
						sb1.append(arr[i][j + k]);
					}

					for (int k = N - 1; k >= 0; k--) {
						sb2.append(arr[i][j + k]);
					}

					if (sb1.toString().equals(sb2.toString())) {
						answer++;
					}
				}
			}

			for (int i = 0; i < 8; i++) {
				for (int j = 0; j <= 8 - N; j++) {
					StringBuilder sb1 = new StringBuilder();
					StringBuilder sb2 = new StringBuilder();

					for (int k = 0; k < N; k++) {
						sb1.append(arr[j+k][i]);
					}

					for (int k = N - 1; k >= 0; k--) {
						sb2.append(arr[j+k][i]);
					}

					if (sb1.toString().equals(sb2.toString())) {
						answer++;
					}
				}
			}

			sb.append("#").append(tc).append(" ").append(answer).append("\n");
		}

		System.out.print(sb);
	}

}