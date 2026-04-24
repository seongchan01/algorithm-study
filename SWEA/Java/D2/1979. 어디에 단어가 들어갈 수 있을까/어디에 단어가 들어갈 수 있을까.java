import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());

            int[][] arr = new int[N][N];

            for (int i = 0; i < N; i++) {
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                for (int j = 0; j < N; j++) {
                    arr[i][j] = Integer.parseInt(st1.nextToken());
                }
            }

            int answer = 0;

            // 가로
            for (int i = 0; i < N; i++) {
                int cnt = 0;

                for (int j = 0; j < N; j++) {
                    if (arr[i][j] == 1) {
                        cnt++;
                    } else {
                        if (cnt == K) {
                            answer++;
                        }
                        cnt = 0;
                    }
                }

                if (cnt == K) {
                    answer++;
                }
            }

            // 세로
            for (int j = 0; j < N; j++) {
                int cnt = 0;

                for (int i = 0; i < N; i++) {
                    if (arr[i][j] == 1) {
                        cnt++;
                    } else {
                        if (cnt == K) {
                            answer++;
                        }
                        cnt = 0;
                    }
                }

                if (cnt == K) {
                    answer++;
                }
            }

            sb.append("#").append(tc).append(" ").append(answer).append("\n");
        }

        System.out.println(sb);
    }
}
