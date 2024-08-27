import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class KnightOfKingdom {
	public static void main(String[] args) throws IOException  {
		// 나이트 이동가능한경로 체크
		int[] dx = {-2, -1, 1, 2, 2, 1, -1, -2};
        int[] dy = {-1, -2, -2, -1, 1, 2, 2, 1};
		
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int matrix[][] = new int [8][8];
		
//		StringTokenizer stk = new StringTokenizer(br.readLine());
		int x = 4, y =3;
		int count = 0 ; // 이동가능 경우의 수
		
		// 나이트 이동가능한 경로 넘어갈경우 카운트 안세기
		for(int i =0; i < dx.length; i ++) {
			
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			System.out.println("nx : "+ nx+ " ny: "+ ny);
			if(nx >= 0 && ny >= 0 ) {
				count++;
			}
		}
		System.out.println(count);
	}
}
