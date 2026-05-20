import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

class Solution {
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();

		String[] grade = { "A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0" };

		int T = Integer.parseInt(br.readLine());

		for (int tc = 1; tc <= T; tc++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int N = Integer.parseInt(st.nextToken());
			int K = Integer.parseInt(st.nextToken());

			int target = 0;
			Integer[] arr = new Integer[N];
			for (int i = 0; i < N; i++) {
				StringTokenizer st2 = new StringTokenizer(br.readLine());

				int midExam = Integer.parseInt(st2.nextToken());
				int finalExam = Integer.parseInt(st2.nextToken());
				int project = Integer.parseInt(st2.nextToken());

				arr[i] = midExam * 35 + finalExam * 45 + project * 20;

				if (i == K - 1) {
					target = arr[i];
				}
			}

			Arrays.sort(arr, Collections.reverseOrder());

			int rank = 0;
			for (int i = 0; i < N; i++) {
				if (arr[i] == target) {
					rank = i;
					break;
				}
			}

			int groupSize = N / 10;
			int gradeIndex = rank / groupSize;

			sb.append("#").append(tc).append(" ").append(grade[gradeIndex]).append("\n");
		}

		System.out.println(sb);

	}

}
