import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

        for (int tc = 1; tc <= T; tc++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int m1 = Integer.parseInt(st.nextToken());
            int d1 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());
            int d2 = Integer.parseInt(st.nextToken());

            int result = 0;

            if (m1 == m2) {
                result = d2 - d1 + 1;
            } else {
                for (int i = m1; i <= m2; i++) {
                    if (i == m1) {
                        result += (days[m1 - 1] - d1 + 1);
                    } else if (i == m2) {
                        result += d2;
                    } else {
                        result += days[i - 1];
                    }
                }
            }

            sb.append("#").append(tc).append(" ").append(result).append("\n");
        }

        System.out.println(sb);
    }
}
