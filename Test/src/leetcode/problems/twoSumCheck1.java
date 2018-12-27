package leetcode.problems;

import java.util.HashMap;
import java.util.Hashtable;

public class twoSumCheck1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		twoSumCheck1 twosumarray = new twoSumCheck1();
		int[] nums = new int[] {2, 7, 11, 15};
		int target = 9;
		int[] index1 = twosumarray.twoSum(nums, target);
		System.out.println(index1);

	}
    public int[] twoSum(int[] nums, int target) {
    	Hashtable<Integer, Integer> h = new Hashtable<>();
    	HashMap<Integer, Integer> h1 = new HashMap<>();
    	Integer complement;
    	for(int i=0; i < nums.length; i++){
    		h1.put(i,nums[i]);
    	}
    	for (int i=0; i < nums.length; i++){
    		complement = target - h1.get(i);
    		h1.
    	}
    	
    }

}

