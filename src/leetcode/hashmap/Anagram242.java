package leetcode.hashmap;

import java.util.Arrays;
import java.util.HashMap;

public class Anagram242 {
    public static void main(String[] args) {
        System.out.println(isAnagramOptimizedWithArray("aaca", "caaa"));
    }

    public static boolean isAnagram(String s, String t) {

        char[] c1 = s.toCharArray();

        char[] c2 = t.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);

        if (Arrays.toString(c1).equals(Arrays.toString(c2))) {
            return true;
        }
        return false;
    }

    public static boolean isAnagramOptimized(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            int count = map.getOrDefault(c, 0);
            map.put(c, count + 1);
        }

        for (char c : t.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            } else {
                int count = map.get(c) - 1;
                map.put(c, count);
                if (count < 0) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isAnagramOptimizedWithArray(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        int[] arr = new int[150];

        for (char c : s.toCharArray()) {
            arr[c] = arr[c] + 1;
        }

        for (char c : t.toCharArray()) {
            arr[c] = arr[c] - 1;
        }

        for (int count : arr) {
            if (count != 0) {
                return false;
            }
        }

        return true;
    }
}
