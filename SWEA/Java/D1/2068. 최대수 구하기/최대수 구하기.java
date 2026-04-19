import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int test_case = 1; test_case <= T; test_case++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int max = 0;
            for (int i = 0; i < 10; i++) {
                int num = Integer.parseInt(st.nextToken());

                if (num > max) {
                    max = num;
                }
            }

            sb.append("#").append(test_case).append(" ").append(max).append("\n");
        }

        System.out.println(sb);
    }
}
