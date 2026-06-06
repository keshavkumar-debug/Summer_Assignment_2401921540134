public class MaximumAverageSubarray {
    public static double findMaxAverage(int[] nums, int k) {
        double sum=0;
        int i=0;
        double maxsum=Integer.MIN_VALUE;
        for(int ele:nums){
            i++;
            if(i>k) break;
            else sum+=(double) ele;
        }
        if(nums.length<=k) return sum/nums.length;
        i=0;
        maxsum=sum;
        for(int j=k;j<nums.length;j++){
            sum+=(double)(nums[j]) - (double)(nums[i++]);
            maxsum=Math.max(sum,maxsum);
        }
        return maxsum/k;
    }
    public static void main(String[] args) {
        int nums[]={1,12,-5,-6,50,3};
        int k=4;
        double ans=findMaxAverage(nums, k);
        System.out.println("Maximum average subarray value is : "+ ans);
    }
}
