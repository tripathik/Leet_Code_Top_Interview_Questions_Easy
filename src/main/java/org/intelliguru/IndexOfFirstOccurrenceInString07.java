package org.intelliguru;

public class IndexOfFirstOccurrenceInString07 {
    public int haystackNeedle(String haystack, String needle) {
        if(needle.isEmpty())return  0;

        for(int i =0; i < haystack.length() - needle.length(); i++){
            if(haystack.startsWith(needle, i)){
                return i;
            }
        }
        return -1;
    }
    public int haystackNeedleV2(String haystack, String needle) {
        if(needle.isEmpty())return  0;

        for(int i =0; i < haystack.length() - needle.length(); i++){
            if(haystack.substring(i, i+needle.length()).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}
