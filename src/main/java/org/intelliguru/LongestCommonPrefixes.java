package org.intelliguru;

import java.util.Arrays;

public class LongestCommonPrefixes {
    /**
     * Write a function to find the longest common prefix string amongst an array of strings.
     * <p>
     * If there is no common prefix, return an empty string "".
     * <p>
     * Example 1:
     * <p>
     * Input: strs = ["flower","flow","flight"]
     * Output: "fl"
     * Example 2:
     * <p>
     * Input: strs = ["dog","racecar","car"]
     * Output: ""
     * Explanation: There is no common prefix among the input strings.
     * <p>
     * SOLUTION:
     * 1. Sort the string array. (it will sort in ascending order)
     * 2. Get the first and last word
     * 3. Iterate till the length of the first char
     * 4. Compare each char of first string with each char of last string
     * 5. If no match return empty string
     * 6. Else append the particular char to string.
     */
    public String longestCommonPrefix(String[] words) {
        StringBuilder sb = new StringBuilder();
        Arrays.sort(words);
        String start = words[0];
        String last = words[words.length - 1];

        for (int i = 0; i < start.length(); i++) {
            if (start.charAt(i) != last.charAt(i)) {
                return sb.toString();
            }
            sb.append(start.charAt(i));
        }
        return sb.toString();
    }

    public String longestCommonPrefixV2(String[] words) {
        if (words == null || words.length == 0) {
            return "";
        }

        Arrays.sort(words);
        String start = words[0];
        String end = words[words.length - 1];
        int minLength = Math.min(start.length(), end.length());

        int i = 0;
        while (i < minLength && start.charAt(i) == end.charAt(i)) {
            i++;
        }

        return start.substring(0, i);
    }
}
