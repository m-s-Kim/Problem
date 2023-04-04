import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class a5 {
    public static void main(String[] args) throws IOException {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int roomCnt = Integer.parseInt(br.readLine());
        
        int[][] meetTime = new int[roomCnt][2];
        
        for (int i = 0; i < roomCnt; i++) {
            String[] input = br.readLine().split(" ");
            meetTime[i][0] = Integer.parseInt(input[0]); // 시작시간
            meetTime[i][1] = Integer.parseInt(input[1]); // 끝나는 시간
        }
        
        // 끝나는 시간을 기준으로 오름차순 정렬
        Arrays.sort(meetTime, (o1, o2) -> o1[1] - o2[1]);
        int cnt = 1;
        int end = meetTime[0][1];
        
        for (int i = 1; i < roomCnt; i++) {
            if (meetTime[i][0] >= end) { 
                cnt++;
                end = meetTime[i][1];
            }
        }
        
        
        System.out.println(cnt);
    }
}