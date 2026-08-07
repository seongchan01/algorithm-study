class Solution { // Lv1. 실패율

	public int[] solution(int N, int[] stages) {

		int[] stage = new int[N + 2];

		for (int s : stages) {
			stage[s]++;
		}

		double[] fail = new double[N + 1];

		int member = stages.length;

		for (int i = 1; i <= N; i++) {
			if (member == 0) {
				fail[i] = 0;
			} else {
				fail[i] = (double) stage[i] / member;
			}

			member -= stage[i];
		}

		int[] answer = new int[N];

		for (int i = 0; i < N; i++) {

			double maxFail = -1;
			int max = 0;

			for (int j = 1; j <= N; j++) {
				if (fail[j] > maxFail) {
					maxFail = fail[j];
					max = j;
				}
			}

			answer[i] = max;
			fail[max] = -1;
		}

		return answer;
	}
}