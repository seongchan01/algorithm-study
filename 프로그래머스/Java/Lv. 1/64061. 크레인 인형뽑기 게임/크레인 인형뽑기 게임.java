import java.util.ArrayDeque;

class Solution {
	public int solution(int[][] board, int[] moves) {
		int answer = 0;

		ArrayDeque<Integer> basket = new ArrayDeque<Integer>();

		a: for (int i = 0; i < moves.length; i++) {
			int n = moves[i];

			for (int j = 0; j < board.length; j++) {
				int doll = board[j][n - 1];
				if (doll != 0) {
					if (!basket.isEmpty() && basket.peek() == doll) {
						basket.pop();
						answer += 2;
					} else {
						basket.push(doll);
					}

					board[j][n - 1] = 0;
					continue a;
				}
			}
		}

		return answer;
	}
}
