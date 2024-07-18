import java.util.HashSet;
import java.util.Set;

public class Solution {
    public String reverseVowels(String s) {
        Set<Character> vowels = new HashSet<>();
        for (char c : "aeiouAEIOU".toCharArray()) vowels.add(c);

        char[] sArray = s.toCharArray();
        int left = 0, right = sArray.length - 1;

        while (left < right) {
            if (!vowels.contains(sArray[left])) left++;
            else if (!vowels.contains(sArray[right])) right--;
            else {
                char temp = sArray[left];
                sArray[left] = sArray[right];
                sArray[right] = temp;
                left++;
                right--;
            }
        }

        return new String(sArray);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.reverseVowels("hello"));    // Output: "holle"
        System.out.println(solution.reverseVowels("leetcode")); // Output: "leotcede"
        System.out.println(solution.reverseVowels("aA"));       // Output: "Aa"
    }
}
