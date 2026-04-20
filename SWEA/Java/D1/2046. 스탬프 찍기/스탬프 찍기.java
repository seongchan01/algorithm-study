import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        int num = Integer.parseInt(s);

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < num; i++) {
            sb.append("#");
        }

        System.out.println(sb);
    }
}
