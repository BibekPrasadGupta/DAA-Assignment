class Solution {
    public int prefixSubArray(int [] nums){
        int n=nums.length;
        int [] prefix = new int[n];
        prefix[0]=nums[0];
        for(int i=1; i<n; i++){
            prefix[i]=prefix[i-1]+nums[i];
        }
        int currSum=0;
        int maxSum=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            int start = i;
            for(int j=i; j<n; j++){
                int end=j;
                currSum= start == 0 ? prefix[end] : prefix[end]-prefix[start-1]; 
                if(maxSum<currSum){
                    maxSum = currSum;
                }
                // maxSum = Math.max(maxSum,currSum);
            }
        }
        return maxSum;
    }
    public int maxSubArray(int[] nums) {
        // kadane's algorithms
        int n=nums.length;
        int cs = 0;
        int ms=Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            cs = cs + nums[i];
            ms = Math.max(ms,cs);
            if(cs < 0){
                cs=0;
            }
        }
        return ms;
    }
}
