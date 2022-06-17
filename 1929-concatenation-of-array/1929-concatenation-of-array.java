class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] newNums = new int[nums.length*2];
        for(int i = 0 ; i< nums.length; i++){
            newNums[i]  = nums[i];
        }
        for(int i = nums.length-1 ; i< nums.length*2; i++){
            newNums[i] = nums[i%nums.length];
        }
        return newNums;
    }
}