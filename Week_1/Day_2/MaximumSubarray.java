class MaximumSubarray{
      public static int maxSubArray(int[] nums) {
        int sum=0,left=0;
        int maxsum=Integer.MIN_VALUE;
        for(int ele:nums){
            if(sum<0) sum=0;
            sum+=ele;
            maxsum=Math.max(sum,maxsum);
        }
        return maxsum;
    }
    public static void main(String[] args) {
        int nums[]={-2,1,-3,4,-1,2,1,-5,4};
        int maxsum=maxSubArray(nums);
        System.out.println("Maximum sum for subarray is : " + maxsum);
    }
}