import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        int value = 1;
        for (int i = 0; i <= n; i++) {
            sb.append(value).append(" ");
            value *= 2;
        }

        System.out.println(sb);
    }
}
