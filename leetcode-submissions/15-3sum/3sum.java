import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        // 1. Sort the array to handle duplicates and enable two-pointers
        Arrays.sort(nums);
        
        for (int i = 0; i < nums.length - 2; i++) {
            // Optimization: If the smallest number is > 0, they can never sum to 0
            if (nums[i] > 0) break;
            
            // Skip duplicate values for our fixed first number
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            
            // 2. Set up two pointers
            int left = i + 1;
            int right = nums.length - 1;
            
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                
                if (sum == 0) {
                    // Found a triplet!
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    
                    // Skip duplicates for the left and right pointers
                    while (left < right && nums[left] == nums[left + 1]) left++;
                    while (left < right && nums[right] == nums[right - 1]) right--;
                    
                    // Move both pointers inward to look for other combinations
                    left++;
                    right--;
                } else if (sum < 0) {
                    // We need a larger sum, move the left pointer to the right
                    left++;
                } else {
                    // We need a smaller sum, move the right pointer to the left
                    right--;
                }
            }
        }
        
        return result;
    }
}