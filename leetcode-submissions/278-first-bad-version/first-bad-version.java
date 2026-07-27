/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int left = 0;
        int right = n;
        int mid = 0;
        while(left<right){
            mid = left + (right -left)/2;
            boolean res = isBadVersion(mid);
            if(res){
                right = mid;
            }
            else{
                left = mid + 1;
            }
            if(left == right){
                return right;
            }
            
        }
        return 0;
    }
}