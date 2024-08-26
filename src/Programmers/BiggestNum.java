package Programmers;

import java.util.Arrays;
import java.util.Comparator;

public class BiggestNum {
	public static void main(String[] args) {
		
		int numbers[] =  {6, 10, 2};
		
		System.out.println(solution(numbers));
	}
	
	
	
	public static String solution(int[] numbers) {
		// int 배열을 String 배열로 변환
        String[] strNumbers = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            strNumbers[i] = String.valueOf(numbers[i]);
        }

        // 문자열 배열을 정렬
        Arrays.sort(strNumbers, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                // 두 문자열을 합쳤을 때 더 큰 수가 되도록 정렬
                String order1 = o1 + o2;
                String order2 = o2 + o1;
                return order2.compareTo(order1);
            }
        });

        // 정렬된 배열을 하나의 문자열로 합침
        if (strNumbers[0].equals("0")) {
            return "0"; // 모든 값이 0인 경우
        }

        StringBuilder answer = new StringBuilder();
        for (String str : strNumbers) {
            answer.append(str);
        }

        return answer.toString();
    }
}
