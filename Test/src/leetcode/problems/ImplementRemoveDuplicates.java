package leetcode.problems;

public class ImplementRemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[] {0,0,1,1,1,2,2,3,3,4};
		ImplementRemoveDuplicates removeDups = new ImplementRemoveDuplicates();
		int b = removeDups.removeDuplicates(nums);
		System.out.println(b);

	}
	public int removeDuplicates(int[] nums){
		int indexWithoutDups = 0;
		for(int i=0; i < nums.length; i++ ){
			if(i == 0){
				indexWithoutDups++;
			}
			else{
				if (nums[i-1] != nums[i]){
				nums[indexWithoutDups] = nums[i];
				indexWithoutDups++;
				}
			}
		}
		return indexWithoutDups;
	}
}
