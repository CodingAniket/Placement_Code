import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class TopKFrequentElements {
    
    public static int[] topKFrequent(int[] nums, int k) {
        int[] result = new int[k];
        HashMap<Integer, Integer> map = new HashMap<>();
        
        // Step 1: Build the frequency map
        for (int i : nums) {
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        
        // Step 2: Extract unique keys into a list (replaces the redundant HashSet)
        List<Integer> list = new ArrayList<>(map.keySet());
        
        // Step 3: Sort the list based on frequencies in descending order (highest frequency first)
        list.sort((a, b) -> map.get(b) - map.get(a));
        
        // Step 4: Take the first k elements
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i);
        }
        
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2, 2, 3};
        int k = 2;

        int[] result = topKFrequent(nums, k);
        System.out.println("Top K Frequent Elements: " + Arrays.toString(result));
    }
}