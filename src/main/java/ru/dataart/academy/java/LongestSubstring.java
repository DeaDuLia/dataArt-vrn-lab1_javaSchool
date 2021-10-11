package ru.dataart.academy.java;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstring {
    /**
     * @param checkString - input string to check
     * @return - length of max substring without repeatable characters
     * Example: dnmdncbb  -> 3 (dnm)
     * amam -> 2 (am)
     */

    public int getLengthOfLongestSubstring(String checkString) {
        Map<Character, Integer> usedCharMap = new HashMap<>(); // индексы символов, которые встречаются в подстроке, логичное и читаемое название не смог придумать
        int maxLength = 0;
        int currentLength = 0;
        char[] stringAsCharArr = checkString.toCharArray();
        for (int i = 0; i < stringAsCharArr.length; i++) {
            if (usedCharMap.containsKey(stringAsCharArr[i])) {
                i = usedCharMap.get(stringAsCharArr[i])+1;
                currentLength = 0;
                usedCharMap.clear();
            }
            usedCharMap.put(stringAsCharArr[i], i);
            currentLength++;
            if (currentLength > maxLength) maxLength = currentLength;
        }
        return maxLength;
    }
}
