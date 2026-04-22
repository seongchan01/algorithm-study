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
            int P = Integer.parseInt(st.nextToken());
            int Q = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());

            int chargeA = P * W;
            int chargeB;
            if (W <= R) {
                chargeB = Q;
            } else {
                chargeB = Q + ((W - R) * S);
            }

            sb.append("#").append(tc).append(" ").append(chargeA < chargeB ? chargeA : chargeB).append("\n");
        }

        System.out.print(sb);
    }
}
