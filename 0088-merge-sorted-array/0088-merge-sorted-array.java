public class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] temp = new int[m + n]; // Temporary array to hold the merged result
        
        int p1 = 0; // Pointer for nums1
        int p2 = 0; // Pointer for nums2
        int p = 0;  // Pointer for the temporary array
        
        // Merge elements into the temporary array
        while (p1 < m && p2 < n) {
            if (nums1[p1] <= nums2[p2]) {
                temp[p++] = nums1[p1++];
            } else {
                temp[p++] = nums2[p2++];
            }
        }
        
        // Copy remaining elements from nums1, if any
        while (p1 < m) {
            temp[p++] = nums1[p1++];
        }
        
        // Copy remaining elements from nums2, if any
        while (p2 < n) {
            temp[p++] = nums2[p2++];
        }
        
        // Copy the merged result back to nums1
        for (int i = 0; i < m + n; i++) {
            nums1[i] = temp[i];
        }
    }
}
