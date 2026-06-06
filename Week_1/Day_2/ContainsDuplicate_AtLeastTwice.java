import java.util.HashSet;

public class ContainsDuplicate_AtLeastTwice {
    public static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set=new HashSet<>();
        for(int ele:nums){
            if(set.contains(ele)) return true;
            set.add(ele);
        }
        return false;
    }
    public static void main(String[] args) {
        int nums[]={1,2,3,4,6,7,9,3,4};
        if(containsDuplicate(nums)){
            System.out.println("Duplicate element is present in the given array");
        }
        else
            System.out.println("Duplicate element is not present in the given array");
    }
}
