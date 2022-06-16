import java.util.*;

class Solution {
    // public boolean containsNearbyDuplicate(int[] nums, int k) {
    //     for(int i = 0;i<nums.length;i++){
    //         for(int j = 0;j<nums.length;j++){
    //             if(i == j)
    //                 continue;
    //             if(nums[i] == nums[j] && Math.abs(i-j) <= k){
    //                 return true;
    //             } 
    //         }
    //     }
    //     return false;
    // }
    
    
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, ArrayList> indexMap = new HashMap();
        for(int i = 0;i<nums.length;i++){
            ArrayList<Integer> indeces = indexMap.get(nums[i]);
            if(indeces != null && indeces.size() > 0){
                for(Integer index : indeces){
                    if(index == i)
                        continue;
                    if(nums[i] == nums[index] && Math.abs(i-index) <=k){
                        return true;
                    } 
                }
            } else {
                indeces = new ArrayList();         
                indexMap.put(nums[i], indeces);
            }
            indeces.add(i);
        }
        return false;
    }
}