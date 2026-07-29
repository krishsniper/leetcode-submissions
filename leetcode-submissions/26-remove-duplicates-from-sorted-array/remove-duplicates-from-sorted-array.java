class Solution {
    public int removeDuplicates(int[] nums) {
        int i;
        int newIndex = 1;
        if(nums == null||nums.length == 0){
            return 0;
        }
        for(i = 1;i<nums.length;i++){
            if(nums[i]!= nums[i-1]){
                nums[newIndex] = nums[i];
                newIndex++;

            }
            else{
                
                continue;
            }
        }
        return newIndex;

    }
}