package Programmers;

import java.util.Arrays;

public class PhoneBook {
	public static void main(String[] args) {
		
//		{"123","456","789"}
		String[] arr = {"119", "97674223", "1195524421"};
		System.out.println(solution(arr));
	}
	
	
	public static boolean solution(String[] phone_book) {
		boolean answer = true;
		
		System.out.println(Arrays.toString(phone_book));
		Arrays.sort(phone_book);
		System.out.println(Arrays.toString(phone_book));
		
		for (int i = 0; i < phone_book.length - 1; i++) {
            // 앞의 번호가 뒤의 번호의 접두어인지 확인
            if (phone_book[i + 1].startsWith(phone_book[i])) {
                return false; // 접두어 관계가 있으면 false 반환
            }
        }
        return answer;
    }
	
	public static int factorial(int num) {
		
		for(int i =num; i<= 1 ; i--) {
			num = num *i;
		}
		
		
		return num;
	}
}
