package Programmers;

import java.util.Arrays;

public class Exam {
	
	public static final int[] abdicant1 = {1,2,3,4,5};
	public static final int[] abdicant2 = {2,1,2,3,2,4,2,5};
	public static final int[] abdicant3 = {3,3,1,1,2,2,4,4,5,5};
	
	public static void main(String[] args) {
		
		int numbers[] =  {1,3,2,4,2};
		System.out.println(Arrays.toString(solution(numbers)));
		
		
	}
	
	
	public static int[] solution(int[] answers) {
		
		int abdicantCnt1 = 0;
		int abdicantCnt2 = 0;
		int abdicantCnt3 = 0;
		
		for(int i = 0; i< answers.length; i++) {
			if(answers[i] == abdicant1[i%abdicant1.length])  abdicantCnt1++;
			if(answers[i] == abdicant2[i%abdicant2.length])  abdicantCnt2++;
			if(answers[i] == abdicant3[i%abdicant3.length])  abdicantCnt3++;
		}
		
		int arr[] = new int[3];
		 
		arr[0] = abdicantCnt1;
		arr[1] = abdicantCnt2;
		arr[2] = abdicantCnt3;
		
		int max = Math.max(Math.max(abdicantCnt1,abdicantCnt3), Math.max(abdicantCnt2,abdicantCnt3));
		
		int cnt = 0; 
		for(int i =0; i<3; i++) {
			if(max==arr[i]) {
				cnt ++;
			}
		}
		
		int[] answer = new int[cnt];
		cnt =0;
		for(int i =0; i<3; i++) {
			if(max == arr[i]) {
				answer[cnt++] = i+1;
			}
		}
        return answer;
	}
}
