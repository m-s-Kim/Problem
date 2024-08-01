import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.StringTokenizer;

public class a6 {
	
	static final int MAX_SIZE = 20;
	static final int MIN_SIZE = 1;
	static final int MAX_NUM = 1024;
	static final int MIN_NUM = 2;
	
	public static void main(String[] args) throws IOException {
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		
		//보드의 크기
		int input = Integer.parseInt(br.readLine());
		
		int gameBoard[][] = new int[input][input];
		
		List<Integer> randNum = new ArrayList<>();
		
		for(int i =2; i<=1024; i*=2) {
			randNum.add(i);
		}
		
		//split은 정규식 기반으로 자르는 로직
		//StringTokenizer 는 단순히 공백 자리를 땡겨 채우는 것
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}
		
//		System.out.println("===========Game Start ===============");
	
		
		/*
		 * for(int i = 0; i < input; i++) { for(int j = 0; j < input; j++) {
		 * gameBoard[i][j]=randNum.get(rand.nextInt(randNum.size())); }
		 * 
		 * }
		 */		
		for(int i = 0; i < input; i++) {
			for(int j = 0; j < input; j++) {
				System.out.print(gameBoard[i][j]+ " ");
			}
			System.out.println();
		}
		
		
		


	}
}
