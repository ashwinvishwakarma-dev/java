package leetcode.slidingwindow;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SubstringWithConcatenation30 {
	public static void main(String[] args) {
		String s = "wordgoodgoodgoodbestword";
		String[] words = {"word", "good", "best", "good"};
		System.out.println(findSubstring(s, words));
	}
	
	public static List<Integer> findSubstring(String s, String[] words) {
		List<Integer> list = new ArrayList<>();
		
		if (s == null || words == null || words.length == 0) {
			return list;
		}
		
		int wordLength = words[0].length();
		int wordCount = words.length;
		int totalLength = wordLength * wordCount;
		
		if (s.length() < totalLength) {
			return list;
		}
		
		HashMap<String, Integer> required = new HashMap<>();
		for (String word : words) {
			required.put(word, required.getOrDefault(word, 0) + 1);
		}
		
		for (int i = 0; i < wordLength; i++) {
			int left = i;
			int right = i;
			int count = 0;
			HashMap<String, Integer> current = new HashMap<>();
			
			while (right + wordLength <= s.length()) {
				String word = s.substring(right, right + wordLength);
				right = right + wordLength;
				
				if (!required.containsKey(word)) {
					current.clear();
					count = 0;
					left = right;
					continue;
				}
				current.put(word, current.getOrDefault(word, 0) + 1);
				count++;
				
				while (current.get(word) > required.get(word)) {
					String leftWord = s.substring(left, left + wordLength);
					current.put(leftWord, current.get(leftWord) - 1);
					left = left + wordLength;
					count--;
				}
				
				if (count == wordCount) {
					list.add(left);
					String leftWord = s.substring(left, left + wordLength);
					current.put(leftWord, current.get(leftWord) - 1);
					left = left + wordLength;
					count--;
				}
			}
		}
		return list;
	}
}
