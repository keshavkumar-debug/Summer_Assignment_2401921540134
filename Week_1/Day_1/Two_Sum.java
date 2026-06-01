import java.util.*;
class Two_Sum{
     public static int[] twoSum(int[] nums, int target) {
        int n=nums.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i!=j){
                if(target==nums[i]+nums[j]) return new int[]{i,j}; 
                }
            }
        }
        return new int[]{-1,-1};
    }
    public static void main(String[] args) {
        int nums[]={3,8,2,4};
        int target=6;
        int[] result=twoSum(nums,6);
        System.out.println(Arrays.toString(result));
    }
}
