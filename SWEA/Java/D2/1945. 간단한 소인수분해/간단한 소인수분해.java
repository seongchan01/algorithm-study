import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());
        int[] arr = { 2, 3, 5, 7, 11 };

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());
            int[] result = new int[5];

            for (int i = 0; i < arr.length; i++) {
                while (N % arr[i] == 0) {
                    N /= arr[i];
                    result[i]++;
                }
            }

            sb.append("#").append(tc).append(" ");
            for (int i = 0; i < result.length; i++) {
                sb.append(result[i]).append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb);
    }
}
