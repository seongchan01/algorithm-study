import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            String word = br.readLine();

            StringBuilder sb = new StringBuilder();

            for (int i = word.length() - 1; i >= 0; i--) {
                sb.append(word.charAt(i));
            }

            if (sb.toString().equals(word)) {
                System.out.println("#" + tc + " " + 1);
            } else {
                System.out.println("#" + tc + " " + 0);
            }
        }
    }
}
