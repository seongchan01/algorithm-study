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

            int h1 = Integer.parseInt(st.nextToken());
            int m1 = Integer.parseInt(st.nextToken());
            int h2 = Integer.parseInt(st.nextToken());
            int m2 = Integer.parseInt(st.nextToken());

            int h = h1 + h2;
            int m = m1 + m2;

            if (m >= 60) {
                m -= 60;
                h += 1;
            }

            if (h > 12) {
                h %= 12;

                if (h == 0) {
                    h = 12;
                }
            }

            sb.append("#").append(tc).append(" ").append(h).append(" ").append(m).append("\n");
        }

        System.out.print(sb);
    }
}