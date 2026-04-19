    import java.io.*;
    import java.util.*;

    class Solution {
        public static void main(String args[]) throws Exception {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringBuilder sb = new StringBuilder();

            int T = Integer.parseInt(br.readLine());

            for (int tc = 1; tc <= T; tc++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());

                if (a < b) {
                    sb.append("#").append(tc).append(" <\n");
                } else if (a == b) {
                    sb.append("#").append(tc).append(" =\n");
                } else {
                    sb.append("#").append(tc).append(" >\n");
                }
            }

            System.out.print(sb);
        }
    }
