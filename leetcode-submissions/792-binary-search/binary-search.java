class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        
        // FIX 1: Changed to <= to check single-element remaining windows
        while (left <= right) {
            
            // FIX 2: Prevents integer overflow on massive arrays
            mid = left + (right - left) / 2;
            
            if (target == nums[mid]) {
                return mid;
            } 
            // FIX 3: Chained if/else-if ensures we only do necessary checks
            else if (target < nums[mid]) {
                right = mid - 1;
            } 
            else {
                left = mid + 1;
            }
        }
        
        return -1;
    }
}