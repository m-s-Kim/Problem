package Programmers;

import java.util.LinkedList;
import java.util.Queue;

public class TargetNumber2 {
	public static int count =0;
	public static void main(String[] args) {
		int[] numbers = {4,1,2,1};
		System.out.println(solution(numbers,4));
	}
	
	
	public static int solution(int[] numbers, int target) {
		
		 return bfs(numbers, target, 0, 0);
	}
	
	public static int bfs(int numbers[], int target, int sum, int idx ) {
		Queue<Integer> q = new LinkedList<>();
		q.offer(sum);
		for(int i = 0 ; i< numbers.length; i++) {
			int size = q.size();
			System.out.println(q.size());
			for(int j = 0; j< size; j++) {
				sum = q.poll();
				q.offer(sum+numbers[i]);
				q.offer(sum-numbers[i]);
			}
		}
		
		
		
		while(!q.isEmpty()) {
			if(q.poll() == target) {
				count++;
			}
		}
		return count;
	}
}
