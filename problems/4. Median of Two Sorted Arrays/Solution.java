import java.util.Arrays;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int size = nums1.length + nums2.length;
        int[] fullArray = new int[size];
        System.arraycopy(nums1, 0, fullArray, 0, nums1.length);
        System.arraycopy(nums2, 0, fullArray, nums1.length, nums2.length);
        Arrays.sort(fullArray);
        int i = fullArray.length;
        if ((i % 2) != 0 ){
            return (fullArray[Math.round(i/2)]);
        }
        else {
             return (float) (fullArray[i/2]+fullArray[(i/2)-1])/2;
        }
    }
}
