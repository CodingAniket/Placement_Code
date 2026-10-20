import java.util.Arrays;

public class MaximumSubarray {
    
    public static int maxSubArray(int[] nums) {
       //Kaden's Algo
       int currentSum=0;
       int maxSum=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++){
        currentSum+=nums[i];
        if(currentSum>maxSum){
            maxSum=currentSum;
        }
        if(currentSum<0){
            currentSum=0;
        }
       }
        
        return maxSum;
    }

    public static void main(String[] args) {
        // Test inputs
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        // Execute and print results
        int result = maxSubArray(nums);
        System.out.println("Maximum Subarray Sum: " + result); // Expected: 6 ([4, -1, 2, 1])
    }
}