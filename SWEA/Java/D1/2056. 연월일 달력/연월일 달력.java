import java.io.BufferedReader;
import java.io.InputStreamReader;

class Solution {
    public static void main(String args[]) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] days = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
        int T = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int ts = 1; ts <= T; ts++) {
            String s = br.readLine();

            String year = s.substring(0, 4);
            String monthStr = s.substring(4, 6);
            String dayStr = s.substring(6, 8);

            int month = Integer.parseInt(monthStr);
            int day = Integer.parseInt(dayStr);

            String result;

            if (month < 1 || month > 12) {
                result = "-1";
            } else {
                int lastDay = days[month - 1];

                if (day < 1 || day > lastDay) {
                    result = "-1";
                } else {
                    result = year + "/" + monthStr + "/" + dayStr;
                }
            }

            sb.append("#").append(ts).append(" ").append(result).append("\n");
        }

        System.out.print(sb);
    }
}
