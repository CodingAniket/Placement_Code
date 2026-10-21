import java.util.Arrays;

public class MaximumProductSubarray {

  public static int maxProduct(int[] nums) {
    int prefix = 1;
    int sufix = 1;
    int max = Integer.MIN_VALUE;
    for (int i = 0; i < nums.length; i++) {
      if (prefix == 0) {
        prefix = 1;
      }
      if (sufix == 0) {
        sufix = 1;
      }
      prefix = prefix * nums[i];
      sufix = sufix * nums[nums.length - 1 - i];
      max = Math.max(max, Math.max(prefix, sufix));
    }
    return max;
  }

  public static void main(String[] args) {
    // Test inputs
    int[] nums = { 2, 3, -2, 4 };

    // Execute and print results
    int result = maxProduct(nums);
    System.out.println("Maximum Product Subarray: " + result); // Expected: 6 ([2, 3])
  }
}