class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> numSet = new HashMap<>();
        for(int i =0;i<numbers.length;i++){
            numSet.put(numbers[i],i);
        }
        for(int i =0;i<numbers.length;i++){
            int complement = target - numbers[i];
            if(numSet.containsKey(complement)){
                return new int[] {i+1,numSet.get(complement)+1};
            }
        }
        return new int[] {};
        
    }
}