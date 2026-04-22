import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int i = 1; i <= T; i++) {
            int[] arr = new int[101];
            int tc = Integer.parseInt(br.readLine());

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < 1000; j++) {
                arr[Integer.parseInt(st.nextToken())]++;
            }

            int max = 0;
            int result = 0;
            for (int k = 0; k < arr.length; k++) {
                if (arr[k] >= max) {
                    max = arr[k];
                    result = k;
                }
            }

            sb.append("#").append(tc).append(" ").append(result).append("\n");
        }
        System.out.println(sb);
    }
}
