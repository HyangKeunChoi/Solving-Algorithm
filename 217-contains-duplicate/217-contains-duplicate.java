class Solution {
    public boolean containsDuplicate(int[] nums) {
       int[] after = IntStream.of(nums).distinct().toArray();
		
		if(nums.length == after.length) {
			return false;
		}
		
		return true;
    }
}