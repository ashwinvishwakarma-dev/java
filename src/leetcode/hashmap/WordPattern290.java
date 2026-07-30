package leetcode.hashmap;

import java.util.HashMap;
import java.util.HashSet;

public class WordPattern290 {
    public static void main(String[] args) {

        String pattern = "abba";
        String s = "dog dog dog dog";

        System.out.println(wordPattern2HashMap(pattern, s));

    }

    // 1 HashMap, 2 HashSet
    public static boolean wordPattern(String pattern, String s) {

        HashMap<Character, String> map = new HashMap<>();
        String[] str = s.split("\\s");

        HashSet<Character> characterSet = new HashSet<>();
        HashSet<String> stringSet = new HashSet<>();

        if (pattern.length() != str.length) {
            return false;
        }
        for (char c : pattern.toCharArray()) {
            characterSet.add(c);
        }
        for (String string : str) {
            stringSet.add(string);
        }
        if (characterSet.size() != stringSet.size()) {
            return false;
        }

        for (int i = 0; i < str.length; i++) {

            if (map.containsKey(pattern.charAt(i))) {
                if (!str[i].equals(map.get(pattern.charAt(i)))) {
                    return false;
                }
            } else {
                map.put(pattern.charAt(i), str[i]);
            }

        }

        return true;
    }

    // 2 HashMap
    public static boolean wordPattern2HashMap(String pattern, String s) {

        String[] str = s.split("\\s");

        if (pattern.length() != str.length) {
            return false;
        }

        HashMap<Character, String> charToWord = new HashMap<>();
        HashMap<String, Character> wordToChar = new HashMap<>();

        for (int i = 0; i < pattern.length(); i++) {

            char character = pattern.charAt(i);
            String word = str[i];

            if (charToWord.containsKey(character)) {
                if (!charToWord.get(character).equals(word)) {
                    return false;
                }
            }
            charToWord.put(character, word);

            if (wordToChar.containsKey(str[i])) {
                if (!wordToChar.get(word).equals(character)) {
                    return false;
                }
            }

            wordToChar.put(word, character);
        }
        return true;
    }
}

