package ru.dataart.academy.java;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tasks for lecture 2");
        TwoSums twoSums = new TwoSums();
        System.out.println("Two sums result: " + Arrays.toString(twoSums.getTwoSum(new int[]{1, 2, 3, 4, 6}, 8)));
        LongestSubstring longestSubstring = new LongestSubstring();
        System.out.println("Longest substring length: " + longestSubstring.getLengthOfLongestSubstring("aasdfgt"));
        ReverseInteger reverseInteger = new ReverseInteger();
        try {
            System.out.println("Reverse integer works: " + reverseInteger.reverse(-456));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}