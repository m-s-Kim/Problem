package Programmers;

public class TargetNumber {
	public static int count =0;
	public static void main(String[] args) {
		int[] numbers = {4,1,2,1};
		System.out.println(solution(numbers,4));
	}
	
	
	public static int solution(int[] numbers, int target) {
		
		 return dfs(numbers, target, 0, 0);
	}
	
	
	
	
	public static int dfs(int numbers[], int target, int sum, int idx ) {
		// 배열의값 더할지 뺄지 
		if(idx == numbers.length) {
			if(sum == target ) {
				count++;
				return count;
			}
		}else {
//			System.out.println("idx : "+idx );
			dfs(numbers, target, sum + numbers[idx], idx+1);
			dfs(numbers, target, sum - numbers[idx], idx+1);
		}
		return count;
		
	}
}
