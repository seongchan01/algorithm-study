import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        for (int ts = 1; ts <= T; ts++) {
            String str = br.readLine();

            for (int i = 1; i < 11; i++) {

                String word = str.substring(0, i);
                String word2 = str.substring(i, i * 2);
                if (word.equals(word2)) {
                    sb.append("#").append(ts).append(" ").append(word.length()).append("\n");
                    break;
                }
            }
        }

        System.out.println(sb);
    }
}
