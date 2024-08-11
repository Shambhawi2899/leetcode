public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        int writeIndex = 1;  // Start from the second element
        int count = 1;  // Track occurrences of the current element

        for (int readIndex = 1; readIndex < nums.length; readIndex++) {
            if (nums[readIndex] == nums[readIndex - 1]) {
                count++;
            } else {
                count = 1;
            }

            if (count <= 2) {
                nums[writeIndex] = nums[readIndex];
                writeIndex++;
            }
        }

        return writeIndex;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 1, 1, 2, 2, 3};
        int newLength = solution.removeDuplicates(nums);

        // Print the modified array and the new length
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println("\nNew length: " + newLength);
    }
}
