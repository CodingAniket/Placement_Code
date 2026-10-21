import java.util.*;

public class MajorityElement {

    public static int majorityElement(int[] nums) {
        int max = Integer.MIN_VALUE;
        int mejority = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }
        for (int item : set) {
            if (map.get(item) > 0 && map.get(item) > max) {
                max = map.get(item);
                mejority = item;
            }
        }

        return mejority;
    }

    public static void main(String[] args) {
        // Test inputs
        int[] nums = { 2, 2, 1, 1, 1, 2, 2 };

        // Execute and print results
        int result = majorityElement(nums);
        System.out.println("Majority Element: " + result); // Expected: 2
    }
}