import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int sum = 0;
            int n = Integer.parseInt(br.readLine());

            for (int i = 1; i <= n; i++) {
                if (i % 2 == 0) {
                    sum -= i;
                } else {
                    sum += i;
                }
            }
            sb.append("#").append(tc).append(" ").append(sum);
            sb.append("\n");
        }

        System.out.print(sb);
    }
}
