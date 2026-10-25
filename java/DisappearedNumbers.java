import java.util.*;

public class DisappearedNumbers {

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : nums) {
            set.add(i);
        }
        for (int i = 1; i <= nums.length; i++) {
            if (!set.contains(i)) {
                list.add(i);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        // Test inputs
        int[] nums = { 4, 3, 2, 7, 8, 2, 3, 1 };

        // Execute and print results
        List<Integer> result = findDisappearedNumbers(nums);
        System.out.println("Disappeared Numbers: " + result); // Expected: [5, 6]
    }
}