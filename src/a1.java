import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class a1 {
	public final static int MAX_VALUE = 10000;
		
		public static void main(String[] args) throws IOException {
			int res = 0;
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			char[] A = st.nextToken().toCharArray();
			char[] B = st.nextToken().toCharArray();

			int length = B.length - A.length;
			for(int i=0;i<=length;i++) {
				int cnt = 0;
				for(int j=0;j<A.length;j++) {
					System.out.println("j+i : "+(j+i));
					if(A[j] != B[j+i])
						cnt++;
				}
			
				res = Math.min(MAX_VALUE, cnt);
			}
			
			
			
			System.out.println(res);
			
			
			
		}
		
		
		
}
