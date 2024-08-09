class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // count of elements not equal to val

        // Traverse through the array
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // move non-val element to the front
                k++; // increment count
            }
        }

        return k;
    }
}