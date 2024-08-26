import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class LRUD {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int size = Integer.parseInt(br.readLine());
		int[][] matrix = new int[size][size];
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
	     // L, R, U, D에 따른 이동 방향 
        int[] dx = {0, 0, -1, 1};
        int[] dy = {-1, 1, 0, 0};
        char[] moveTypes = {'L', 'R', 'U', 'D'};
		int x = 1;
		int y = 1;
		while(stk.hasMoreElements()) {
			String s = stk.nextToken();
			int nx = -1, ny =-1;
			
			for(int i =0; i<moveTypes.length; i++ ) {
				if(moveTypes[i] == s.charAt(0)) {
					nx = x+dx[i];
					ny = y+dy[i];
				}
			}
			
			
//			switch (s) {
//			case "L":
//				y--;
//			case "R":
//				y++;
//			case "U":
//				x--;
//			case "D":
//				x++;
//			}
			if (nx < 1 || ny < 1 || nx > size || ny > size) continue;
			x= nx;
			y= ny;
			System.out.println("nx : "+ nx+ " ny: "+ ny);
			
		}
		
		System.out.println(x+", "+ y);
        
		
		br.close();
		
	}
}
