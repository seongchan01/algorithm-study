import java.util.HashSet;
import java.util.Set;

class Solution {  // Lv2. 방문 길이
    
	public int solution(String dirs) {
		int answer = 0;

		Set<String> set = new HashSet<>();

		int[] dx = { -1, 1, 0, 0 };
		int[] dy = { 0, 0, 1, -1 };

		int x = 5;
		int y = 5;

		for (int i = 0; i < dirs.length(); i++) {
			char dir = dirs.charAt(i);

			int nx, ny;
			if (dir == 'U') {
				nx = x + dx[0];
				ny = y + dy[0];

			} else if (dir == 'D') {
				nx = x + dx[1];
				ny = y + dy[1];

			} else if (dir == 'R') {
				nx = x + dx[2];
				ny = y + dy[2];

			} else {
				nx = x + dx[3];
				ny = y + dy[3];
			}

			if (nx >= 0 && ny >= 0 && nx < 11 && ny < 11) {

				String path1 = x + "," + y + "," + nx + "," + ny;
				String path2 = nx + "," + ny + "," + x + "," + y;

				if (!set.contains(path1) && !set.contains(path2)) {
					set.add(path1);
					set.add(path2);
					answer++;
				}

				x = nx;
				y = ny;

			} else {
				continue;
			}

		}

		return answer;
	}
}