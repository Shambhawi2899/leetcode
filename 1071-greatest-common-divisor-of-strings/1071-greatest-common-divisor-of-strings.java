   public class Solution {
    public static void main(String[] args) {
        String str1 = "ABCABCABC";
        String str2 = "ABCABC";
        System.out.println(gcdOfStrings(str1, str2));  // Output: "ABC"
    }

    public static String gcdOfStrings(String str1, String str2) {
        // Calculate the gcd of the lengths of the two strings
        int gcdLength = gcd(str1.length(), str2.length());
        
        // Candidate for the gcd string
        String candidate = str1.substring(0, gcdLength);
        
        // Check if the candidate can construct both strings by repeating itself
        if (canConstruct(str1, candidate) && canConstruct(str2, candidate)) {
            return candidate;
        } else {
            return "";
        }
    }
    
    // Helper method to compute the gcd of two numbers
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    // Helper method to check if the string can be constructed by repeating the candidate string
    public static boolean canConstruct(String str, String candidate) {
        int n = str.length();
        int m = candidate.length();
        if (n % m != 0) return false;
        
        StringBuilder repeated = new StringBuilder();
        for (int i = 0; i < n / m; i++) {
            repeated.append(candidate);
        }
        
        return str.equals(repeated.toString());
    }
}
     
        
        
    