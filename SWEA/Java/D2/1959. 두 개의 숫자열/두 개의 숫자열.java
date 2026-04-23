import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int ts = 1; ts <= T; ts++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[] arr1 = new int[N];
            int[] arr2 = new int[M];

            StringTokenizer st1 = new StringTokenizer(br.readLine());
            for (int i = 0; i < N; i++) {
                arr1[i] = Integer.parseInt(st1.nextToken());
            }

            StringTokenizer st2 = new StringTokenizer(br.readLine());
            for (int i = 0; i < M; i++) {
                arr2[i] = Integer.parseInt(st2.nextToken());
            }

            int max = Integer.MIN_VALUE;

            if (N <= M) {
                for (int i = 0; i <= M - N; i++) {
                    int sum = 0;

                    for (int j = 0; j < N; j++) {
                        sum += arr1[j] * arr2[j + i];
                    }

                    if (sum > max) {
                        max = sum;
                    }
                }
            } else {
                for (int i = 0; i <= N - M; i++) {
                    int sum = 0;

                    for (int j = 0; j < M; j++) {
                        sum += arr1[j + i] * arr2[j];
                    }

                    if (sum > max) {
                        max = sum;
                    }
                }
            }

            sb.append("#").append(ts).append(" ").append(max).append("\n");
        }
        System.out.println(sb);
    }
}
