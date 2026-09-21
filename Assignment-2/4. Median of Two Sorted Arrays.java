class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] merge = new int[nums1.length + nums2.length];

        int idx = 0;
        for(int i = 0; i < nums1.length; i++){
            merge[idx++] = nums1[i];
        }
        for(int i = 0; i < nums2.length; i++){
            merge[idx++] = nums2[i];
        }

        Arrays.sort(merge);

        int n = merge.length;
        double median = 0;
        if(n % 2 == 0){
            int i = n/2;
            int j = n/2 - 1;
            median = (merge[i] + merge[j])/2.0;
        } else {
            median = merge[n/2];
        }
        return median;
    }
}
