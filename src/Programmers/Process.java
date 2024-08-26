package Programmers;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Process {
	public static void main(String[] args) {
		
		int[] priorities = {1, 1, 9, 1, 1, 1};
//		int[] priorities = {2,1,3,2};
		int location = 3;
		
		System.out.println("sol : "+solution(priorities, location));
	}
	
	public static int solution(int[] priorities, int location) {
		int answer = 0;
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
		for(int num : priorities) {
			queue.add(num);
		}
		
		
		while(!queue.isEmpty()) {
			for(int i=0; i<priorities.length; i++) {
				if(priorities[i] == queue.peek()) {
					queue.poll();
					answer++;
					if(i == location)
						return answer;
				}
			}
		}  
        return answer;
    }
}
