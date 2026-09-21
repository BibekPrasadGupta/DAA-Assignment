class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=n-1;
        int j=m-1;
        int k=n+m-1;
        while(i>=0 && j>=0){
            if(nums2[i]>nums1[j]){
                nums1[k]=nums2[i];
                i--;
            }
            else{
                nums1[k]=nums1[j];
                j--;
            }
            k--;
        }
        while(i>=0){
            nums1[k]=nums2[i];
            i--;
            k--;
        }
    }
}
