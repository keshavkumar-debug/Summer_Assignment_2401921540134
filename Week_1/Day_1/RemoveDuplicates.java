class RemoveDuplicates {
     public static int removeDuplicates(int[] nums) {
        int left = 0, right = 1;
        while (right < nums.length) {
            if (nums[left] == nums[right])  right++;
            else {
                nums[++left] = nums[right];
                right++;
            }
        }
        return left + 1;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 2, 2, 3, 4, 4};
        int k = removeDuplicates(nums);
        System.out.println("Number of unique elements: " + k);
    }
    }
