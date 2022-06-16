class Solution {
    public int search(int[] nums, int target) {
         int startIndex = 0;
        int endIndex = nums.length - 1;
        int searchIndex;
        do {
            searchIndex = startIndex + ((endIndex - startIndex) / 2);
            if (nums[searchIndex] == target) {
                return searchIndex;
            } else if (nums[searchIndex] > target) {
                endIndex = searchIndex - 1;
            } else {
                startIndex = searchIndex + 1;
            }
        } while (endIndex >= startIndex) ;
        return -1;
    }
}