import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GameDev {
	
	public static int[] dir = {0,1,2,3};
	public static int direction = 0;
	
	public static void main(String[] args) throws IOException {
		
//		4 4
//		1 1 0
//		1 1 1 1
//		1 0 0 1
//		1 1 0 1
//		1 1 1 1
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer stk = new StringTokenizer(br.readLine());
		int size1 = 0;
		int size2 = 0;
		while(stk.hasMoreTokens()) {
			size1 = Integer.parseInt(stk.nextToken());
			size2 = Integer.parseInt(stk.nextToken());
		}
		int[][] matrix = new int[size1][size2];
		int[][] d = new int[size1][size2];
		
		stk = new StringTokenizer(br.readLine());
		int x = 0,y=0;
		
		
	
		
		while(stk.hasMoreTokens()) {
			x =  Integer.parseInt(stk.nextToken());
			y =  Integer.parseInt(stk.nextToken());
			direction = Integer.parseInt(stk.nextToken());
		}
		
//		System.out.println(x);
//		System.out.println(y);
		
		// 전체 맵 정보를 입력 받기
		
		for (int i = 0; i < size1; i++) {
			stk = new StringTokenizer(br.readLine());
            for (int j = 0; j < size2; j++) {
            	matrix[i][j] = Integer.parseInt(stk.nextToken());
            }
        }
		
		d[x][y] = 1; // 현재 좌표 방문 처리
		
		br.close();
		
		// 북 동 남 서
		int[] dx = {-1, 0, 1, 0};  
		int[] dy = {0, 1, 0, -1};
		
		int nx = 0;
		int ny = 0;
		int cnt = 1;
		int seaCheck = 0 ;
		while(true) {
			turn();
			nx = x+dx[direction];
			ny = y+dy[direction];
			
			// 가보지 않은 칸이 존재하는 경우
			if(d[nx][ny] == 0 && matrix[nx][ny] == 0) {
				d[nx][ny] = 1;
				cnt++;
				x = nx;
				y = ny;
				seaCheck = 0;
				continue;
			}else {
				seaCheck++;
			}
			
			if(seaCheck == 4) {
				nx = x-dx[direction];
				ny = y-dy[direction];
				
                // 뒤로 갈 수 있다면 이동하기
                if (matrix[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                }else {
                	break;
                }
                // 뒤가 바다로 막혀있는 경우
                seaCheck = 0;
			}
		}
		System.out.println("cnt "+cnt);
	}
	
	// 왼족 으로 돌리기 
	public static int turn() {
		direction--;
		if(direction == -1) direction =3;
		return direction;
	}
}

	
	
	
