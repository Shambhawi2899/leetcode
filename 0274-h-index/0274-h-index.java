import java.util.Arrays;

public class Solution {
    public int hIndex(int[] citations) {
        // Sort the citations array in non-decreasing order
        Arrays.sort(citations);
        
        int n = citations.length;
        
        // Iterate over the sorted array to find the h-index
        for (int i = 0; i < n; i++) {
            // The number of papers with at least citations[i] citations
            int h = n - i;
            
            // Check if the current citations count is enough for h-index
            if (citations[i] >= h) {
                return h;
            }
        }
        
        // If no valid h-index is found, return 0
        return 0;
    }
}
