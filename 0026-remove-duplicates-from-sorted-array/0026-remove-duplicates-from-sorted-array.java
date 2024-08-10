public class Solution {
    public int removeDuplicates(int[] nums) {
        // Check if the array is empty
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Pointer to track the position for the next unique element
        int writeIndex = 0;

        // Iterate through the array starting from the second element
        for (int readIndex = 1; readIndex < nums.length; readIndex++) {
            // Check if the current element is different from the last unique element
            if (nums[readIndex] != nums[writeIndex]) {
                // Move the writeIndex to the next position for a unique element
                writeIndex++;
                // Update the array at the writeIndex position with the new unique element
                nums[writeIndex] = nums[readIndex];
            }
        }

        // The number of unique elements is writeIndex + 1
        return writeIndex + 1;
    }
}
