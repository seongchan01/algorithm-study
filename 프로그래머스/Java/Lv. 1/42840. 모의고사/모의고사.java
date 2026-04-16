import java.util.ArrayList;

class Solution {
    public int[] solution(int[] answers) {

        int[][] patterns = {
                { 1, 2, 3, 4, 5 },
                { 2, 1, 2, 3, 2, 4, 2, 5 },
                { 3, 3, 1, 1, 2, 2, 4, 4, 5, 5 }
        };

        int[] scores = new int[3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < answers.length; j++) {
                if (answers[j] == patterns[i][j % patterns[i].length]) {
                    scores[i]++;
                }
            }
        }

        int max = scores[0];
        for (int i = 0; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            if (scores[i] == max) {
                list.add(i + 1);
            }
        }

        int[] result = list.stream().mapToInt(Integer::intValue).toArray();

        return result;
    }
}
