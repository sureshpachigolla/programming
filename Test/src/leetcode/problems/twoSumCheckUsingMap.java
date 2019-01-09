package leetcode.problems;

import java.util.HashMap;


public class twoSumCheckUsingMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		twoSumCheckUsingMap twosumarray = new twoSumCheckUsingMap();
		int[] nums = new int[] {2, 7, 11, 15};
		int target = 9;
		int[] index1 = twosumarray.twoSum(nums, target);
		System.out.println(index1[0]);
		System.out.println(index1[1]);

	}
    public int[] twoSum(int[] nums, int target) {
    	
    	HashMap<Integer, Integer> h1 = new HashMap<>();
    	Integer complement;
    	int j=0;
    	int i;
    	for(i=0; i < nums.length; i++){
    		h1.put(nums[i],i);
    		complement = target - nums[i];
    		if (h1.containsKey(complement)){
    			j = h1.get(complement);
    			break;
    		}
    	}
    	return new int[] {i ,j};
    	    	
    }

}

