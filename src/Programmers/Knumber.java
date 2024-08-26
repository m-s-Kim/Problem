package Programmers;

import java.util.Arrays;

public class Knumber {
	public static void main(String[] args) {
		int[] array = {1, 5, 2, 6, 3, 7, 4};
		
		int[][] command = {{2, 5, 3}, {4, 4, 1},{1, 7, 3}};
		
		
//		solution(array, command);
		System.out.println(Arrays.toString(solution(array, command)));
		
	}
	
	
	 public static int[] solution(int[] array, int[][] commands) {
		 int[] answer = new int[commands.length]; 
		 
		 for(int i = 0 ; i< commands.length; i++) {
			 int start = commands[i][0];
			 int end   = commands[i][1];
			 int target = commands[i][2];
			 
			 
			 int size = end -start + 1;
			 int[] arr = new int[size];
			 
			 for(int j = 0 ; j < size; j ++) {
				arr[j]  = array[start-1];
				start++;
			 }
			 Arrays.sort(arr);
			 
			 answer[i] = arr[target-1];
		 }
		 
		 return answer;
	 }
}
