class Solution {
    public int lengthOfLastWord(String s) {
        // Trim any trailing spaces
        s = s.trim();
        
        // Find the last space in the trimmed string
        int lastSpaceIndex = s.lastIndexOf(' ');
        
        // Length of the last word is the difference between the length of the string
        // and the index of the last space
        return s.length() - lastSpaceIndex - 1;
    }
}

