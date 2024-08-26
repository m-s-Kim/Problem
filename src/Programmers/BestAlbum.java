package Programmers;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

public class BestAlbum {
	
//	속한 노래가 많이 재생된 장르를 먼저 수록합니다.
//	장르 내에서 많이 재생된 노래를 먼저 수록합니다.
//	장르 내에서 재생 횟수가 같은 노래 중에서는 고유 번호가 낮은 노래를 먼저 수록합니다.
	
//	genres[i]는 고유번호가 i인 노래의 장르입니다.
//	plays[i]는 고유번호가 i인 노래가 재생된 횟수입니다.
//	genres와 plays의 길이는 같으며, 이는 1 이상 10,000 이하입니다.
//	장르 종류는 100개 미만입니다.
//	장르에 속한 곡이 하나라면, 하나의 곡만 선택합니다.
//	모든 장르는 재생된 횟수가 다릅니다.
	
	public static void main(String[] args) {
		String[] a= {"classic", "pop", "classic", "classic", "pop"};
		int[] b= {500, 600, 150, 800, 2500};
		solution(a,b);
//		System.out.println(solution(a,b));
	}
	
	public static int[] solution(String[] genres, int[] plays) {
		 Map<String, Integer> map = new HashMap<>();
		 
		 Map<String,Integer> order = new HashMap<>();
		 PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		 
		 for(int i =0; i< genres.length; i++) {
			 map.put(genres[i], map.getOrDefault(genres[i], 0)+plays[i]);
			 order.put(genres[i], order.getOrDefault(genres[i], 0)+1);
		 }
		 
		 for(int ord : order.values()) {
			 queue.offer(ord);
		 }
		 
		 
		 
		 
		 map.entrySet().forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
		 order.entrySet().forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
		 
		
        int[] answer = {};
        return answer;
    }
}
