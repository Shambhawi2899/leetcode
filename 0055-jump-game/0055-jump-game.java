public class Solution {
    public boolean canJump(int[] nums) {
        int n = nums.length;
        int lastReachable = n - 1; // The last index we need to reach
        
        // Traverse the array from the second last element to the start
        for (int i = n - 2; i >= 0; i--) {
            // If we can jump from the current index to a further or the same index as the last reachable one,
            // then this index can also be the last reachable one.
            if (i + nums[i] >= lastReachable) {
                lastReachable = i;
            }
        }
        
        // If we managed to set lastReachable to 0, it means we can reach the end from the start.
        return lastReachable == 0;
    }
}
