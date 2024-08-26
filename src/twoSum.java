import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class twoSum {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> d = new HashMap<>();
        
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            
            if (d.containsKey(complement)) {
                return new int[] { d.get(complement), i };
            }
            
            d.put(nums[i], i);
        }
        
        throw new IllegalArgumentException("No two sum solution");
    }
    
    public static void main(String[] args) {
    	twoSum ts = new twoSum();
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        
        ArrayList<Integer> list = new ArrayList<>();
        
        list.add(2);
        list.add(7);
        list.add(11);
        list.add(5);
        
        int a= Collections.max(list);
        
        
        
        
        int[] result = ts.twoSum(nums, target);
        System.out.println("Indices: " + result[0] + ", " + result[1]);
    }
}
