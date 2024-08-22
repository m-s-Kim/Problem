package Programmers;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

public class Clothes {
	public static void main(String[] args) {
		
		
		String[][] a= {{"yellow_hat", "face"}, {"blue_sunglasses", "test"}, {"green_turban", "face"}};
		System.out.println(solution(a));
		
	}
	
	
	public static int solution(String[][] clothes) {
        int answer = 0;
        
        Map<String, Integer> map = new HashMap<>();
        int clothesCnt = 0;
        
        for(int i =0; i< clothes.length; i++) {
       		map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0)+1);
        }
        
        map.entrySet().forEach(entry -> System.out.println(entry.getKey() + " : " + entry.getValue()));
        	
        Iterator<Entry<String, Integer>> it = map.entrySet().iterator();
        
        int multiply = 1;
        
        while(it.hasNext()) {
        	Entry<String, Integer> s = it.next();
        	
        	multiply *= (s.getValue()+1);
        }
        
        System.out.println("multiple : " +multiply);
        
        answer =  multiply;
        
        // 아무것도 선택 안한  경우 빼기 
        return answer-1;
    }
}
