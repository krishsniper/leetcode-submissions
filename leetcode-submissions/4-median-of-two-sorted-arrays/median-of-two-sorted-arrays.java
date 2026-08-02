class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length, n2 = nums2.length;
        int[] arr = new int[n1 + n2];
        int p1 = 0, p2 = 0, p3 = 0;

        while (p1 < n1 && p2 < n2) {
            if (nums1[p1] <= nums2[p2]) {
                arr[p3++] = nums1[p1++];
            } else {
                arr[p3++] = nums2[p2++];
            }
        }
        while (p1 < n1) arr[p3++] = nums1[p1++];  // drain leftovers
        while (p2 < n2) arr[p3++] = nums2[p2++];

        int n = arr.length;
        if (n % 2 == 0) {
            return (arr[n/2 - 1] + arr[n/2]) / 2.0;
        } else {
            return arr[n/2];
        }
    }
}