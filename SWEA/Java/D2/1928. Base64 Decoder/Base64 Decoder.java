import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Base64;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            String encoded = br.readLine();
            String decoded = new String(Base64.getDecoder().decode(encoded));

            sb.append("#").append(tc).append(" ").append(decoded).append("\n");
        }

        System.out.print(sb);
    }
}
