import java.util.*;

public class LongestConsecutiveSequence {
    
    public static int longestConsecutive(int[] nums) {
      HashSet<Integer>set=new HashSet<>();
       for(int i:nums){
        set.add(i);
       }
       int length=0;
       int maxLength=0;
       for(int i:set){
        if(set.contains(i) && !set.contains(i-1)){
          length=1;
           while(set.contains(i+1)){
            length++;
            i++;
           }
           maxLength=Math.max(maxLength,length);
        }
       }
       return maxLength;
       }

    public static void main(String[] args) {
        // Test inputs
        int[] nums = {100, 4, 200, 1, 3, 2};
        
        // Execute and print results
        int result = longestConsecutive(nums);
        System.out.println("Longest Consecutive Sequence Length: " + result); // Expected: 4
    }
}
