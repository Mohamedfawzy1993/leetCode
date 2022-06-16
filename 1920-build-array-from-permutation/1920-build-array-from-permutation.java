class Solution {
    public int[] buildArray(int[] nums) {
        int []arr = new int[nums.length];
        for(int index = 0 ;index <nums.length;index++){
            arr[index] = nums[nums[index]];
        }
        return arr;
    }
}