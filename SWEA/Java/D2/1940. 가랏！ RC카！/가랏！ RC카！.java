import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        for (int tc = 1; tc <= T; tc++) {
            int N = Integer.parseInt(br.readLine());

            int speed = 0;
            int distance = 0;

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                int command = Integer.parseInt(st.nextToken());

                if (command == 1) {
                    int acc = Integer.parseInt(st.nextToken());
                    speed += acc;
                } else if (command == 2) {
                    int acc = Integer.parseInt(st.nextToken());
                    speed -= acc;

                    if (speed < 0) {
                        speed = 0;
                    }
                }

                distance += speed;
            }

            sb.append("#").append(tc).append(" ").append(distance).append("\n");
        }

        System.out.print(sb);
    }
}