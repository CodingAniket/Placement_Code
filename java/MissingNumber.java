import java.util.*;

public class MissingNumber {
    
    public static int missingNumber(int[] nums) {
        int n=nums.length;
        int expectedSum=n*(n+1)/2;
        int actualSum=0;
        for(int i=0;i<nums.length;i++){
          actualSum+=nums[i];
        }
        return expectedSum-actualSum;
    }

    public static void main(String[] args) {
        // Test inputs
        int[] nums = {3, 0, 1};
        
        // Execute and print results
        int result = missingNumber(nums);
        System.out.println("Missing Number: " + result); // Expected: 2
    }
}
