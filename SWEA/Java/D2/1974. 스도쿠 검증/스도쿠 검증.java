import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int[][] arr = new int[9][9];

            for (int i = 0; i < 9; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                for (int j = 0; j < 9; j++) {
                    arr[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            int answer = 1;

            for (int i = 0; i < 9; i++) {
                boolean[] visited = new boolean[10];

                for (int j = 0; j < 9; j++) {
                    int num = arr[i][j];

                    if (visited[num]) {
                        answer = 0;
                        break;
                    }

                    visited[num] = true;
                }
            }

            for (int j = 0; j < 9; j++) {
                boolean[] visited = new boolean[10];

                for (int i = 0; i < 9; i++) {
                    int num = arr[i][j];

                    if (visited[num]) {
                        answer = 0;
                        break;
                    }

                    visited[num] = true;
                }
            }

            for (int i = 0; i < 9; i += 3) {
                for (int j = 0; j < 9; j += 3) {
                    boolean[] visited = new boolean[10];

                    for (int r = i; r < i + 3; r++) {
                        for (int c = j; c < j + 3; c++) {
                            int num = arr[r][c];

                            if (visited[num]) {
                                answer = 0;
                                break;
                            }

                            visited[num] = true;
                        }
                    }
                }
            }

            sb.append("#").append(tc).append(" ").append(answer).append("\n");
        }

        System.out.print(sb);
    }
}
