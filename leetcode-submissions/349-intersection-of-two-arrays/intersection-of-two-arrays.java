import java.util.ArrayList;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>(); 
        for(int num:nums1){
            arr1.add(num);
        }
        for(int num:nums2){
            arr2.add(num);
        }
        for(int i =0;i<nums1.length;i++){
            if(arr2.contains(nums1[i]) && !result.contains(nums1[i])){
                result.add(nums1[i]);
            }
        }
        int[] res = new int[result.size()];
        int index = 0;
        for(int num: result){
            res[index++] = num;
        }
        return res;

        
    }
}