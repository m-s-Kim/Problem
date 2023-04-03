import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.Arrays;
import java.util.StringTokenizer;

public class a3 {
	final static int MAX_MONEY =100000000;
	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer stk = new StringTokenizer(br.readLine());
		
		// 사용가능 화폐 갯수
		int moneyCnt = Integer.parseInt(stk.nextToken());
		
		int money = Integer.parseInt(stk.nextToken());
		
		System.out.println("moneyCnt : "+ moneyCnt);
		System.out.println("money :"+ money);
		int[] arr = new int[moneyCnt];
		
		// 입력받은값만큼 반복 돌리기
		for(int i = 0; i < moneyCnt; i++) {
			arr[i]= Integer.parseInt(br.readLine());
		}
		//오름차순으로 정렬 : 
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		int cnt =0;
		for(int i =arr.length-1; i>=0; i--) {
			//돈이 동전보다 크면 안됌
			if(arr[i]>money) {
				continue;
			}else {
				cnt += money/arr[i];
				money%=arr[i];
			}
			// 돈이 동전보다 작아질때까지 빼주기
			/*
			 * while(money>=arr[i]){ money = money-arr[i]; cnt++; }
			 */
		}
		System.out.println("================");
		System.out.println(cnt);
		br.close();
		
	}
}
