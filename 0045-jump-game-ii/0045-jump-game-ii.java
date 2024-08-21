public class Solution {
    public int jump(int[] nums) {
        int n = nums.length;
        if (n == 1) return 0; // If there's only one element, no jumps are needed
        
        int jumps = 0;        // Number of jumps needed
        int currentEnd = 0;   // The farthest point we can reach with the current number of jumps
        int farthest = 0;     // The farthest point we can reach from the current position
        
        for (int i = 0; i < n - 1; i++) {
            // Update the farthest point we can reach
            farthest = Math.max(farthest, i + nums[i]);
            
            // If we've reached the end of the current jump range
            if (i == currentEnd) {
                jumps++;        // Increment the jump count
                currentEnd = farthest; // Move the jump range to the farthest point
                
                // If the farthest point is at or beyond the last index, we can stop
                if (currentEnd >= n - 1) break;
            }
        }
        
        return jumps;
    }
}
