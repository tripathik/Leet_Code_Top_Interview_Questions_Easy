package org.intelliguru;

public class Main {
    public static void main(String[] args) {
        LongestCommonPrefixes lcp = new LongestCommonPrefixes();
        String[] words = {"flower","flow","flight"};
        String result = lcp.longestCommonPrefixV2(words);
    }
}