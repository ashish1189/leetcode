package strings;

import java.util.LinkedHashMap;

public class LongestSubstring {

	public int lengthOfLongestSubstring(String s) {
        char[] charArray = s.toCharArray();
         
        int longestSubstringLength = 0;
         
        LinkedHashMap<Character, Integer> charPosMap = new LinkedHashMap<Character, Integer>();
         
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];             
            if(!charPosMap.containsKey(ch)) {
                charPosMap.put(ch, i);
            } else {   
                i = charPosMap.get(ch);
                charPosMap.clear();
            }
             
            if(charPosMap.size() > longestSubstringLength) {
                longestSubstringLength = charPosMap.size();
            }
        }
         
        return longestSubstringLength;
    }
}
