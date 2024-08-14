public class Solution {  // Rename the class to Solution
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;  // Normalize k
        reverse(nums, 0, n - 1);       // Step 1: Reverse the entire array
        reverse(nums, 0, k - 1);       // Step 2: Reverse the first k elements
        reverse(nums, k, n - 1);       // Step 3: Reverse the remaining n-k elements
    }

    // Helper method to reverse elements in the array
    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    // Example usage:
    public static void main(String[] args) {
        Solution solution = new Solution();  // Instantiate the class with the new name

        int[] nums1 = {1, 2, 3, 4, 5, 6, 7};
        solution.rotate(nums1, 3);
        System.out.println(java.util.Arrays.toString(nums1));  // Output: [5, 6, 7, 1, 2, 3, 4]

        int[] nums2 = {-1, -100, 3, 99};
        solution.rotate(nums2, 2);
        System.out.println(java.util.Arrays.toString(nums2));  // Output: [3, 99, -1, -100]
    }
}
