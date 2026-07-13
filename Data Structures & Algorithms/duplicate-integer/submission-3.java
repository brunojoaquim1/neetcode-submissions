class Solution {
    
    public boolean hasDuplicate(int[] nums) {
        
        HashSet<Integer> result = new HashSet<>();

        for(int i = 0 ; i < nums.length; i ++){
            if (!result.add(nums[i])){
                return true ;
            }
        }

        return false ; 

        
    }
}