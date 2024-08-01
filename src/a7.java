import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;

public class a7 {
	public static void main(String[] args) {
		
		int a[] = {-5,-4,-3,-2,-1};
		int b[] = {-2,-1,-23,-4,-1};
		Integer[] tmp = Arrays.stream(b).boxed().toArray(Integer[]::new);
		Arrays.sort(tmp, Collections.reverseOrder());
		System.out.println(Arrays.toString(tmp));
		
		Stack<String> dd = new Stack<String>();
		dd.add("ddd");
		
		dd.add("abc");
		dd.add("2");
		dd.add("3");
		dd.pop();
		System.out.println(dd.toString());
		dd.add("ddd");
		dd.add("ddcz");
		System.out.println(dd.toString());
		
		
	}
}
