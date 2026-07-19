class Solution {
    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int maxArea = 0;
        while(left<right){
            int width = right - left;
            int currentHeight = Math.min(height[left],height[right]);
            int currentArea = width*currentHeight;
            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
            maxArea = Math.max(currentArea,maxArea);
            
            
        }
        return maxArea;
    }
}