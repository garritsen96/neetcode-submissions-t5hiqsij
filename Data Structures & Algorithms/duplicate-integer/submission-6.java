class Solution {
    public boolean hasDuplicate(int[] nums) {
         for (int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]==nums[j]){
                    return true;
                } 
            }
    }return false ;
        
    }
}

class SolutionHashSet{
    public boolean hasDuplicate(int[]nums){
        Set <Integer> seen= new HashSet<>();
        for (int i=0;i <nums.length;i++){
            int num=nums[i];
            if (seen.contains(num)) {
                return true;
            }
            seen.add(num);
        }return false;

    }
}