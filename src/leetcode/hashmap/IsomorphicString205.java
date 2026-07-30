package leetcode.hashmap;

import java.util.HashMap;

public class IsomorphicString205 {
	public static void main(String[] args) {
		System.out.println(isIsomorphic("egg", "ear"));
	}
	
	public static boolean isIsomorphic(String s, String t) {
		
		if (s.length() != t.length()) {
			return false;
		}
		
		HashMap<Character, Character> mapST = new HashMap<>();
		HashMap<Character, Character> mapTS = new HashMap<>();
		
		for (int i = 0; i < s.length(); i++) {
			char c1 = s.charAt(i);
			char c2 = t.charAt(i);
			
			if (mapST.containsKey(c1) && mapST.get(c1) != c2) {
				return false;
			}
			mapST.put(c1, c2);
			
			if (mapTS.containsKey(c2) && mapTS.get(c2) != c1) {
				return false;
			}
			mapTS.put(c2, c1);
		}
		
		return true;
		
	}
}
