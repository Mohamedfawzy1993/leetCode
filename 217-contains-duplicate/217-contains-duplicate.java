import java.util.*;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Boolean> duplicateMap = new HashMap();
        for(int num : nums){
            if(duplicateMap.get(num) != null){
                return true;
            } else {
                duplicateMap.put(num, true);
            }
        }
        return false;
    }
}