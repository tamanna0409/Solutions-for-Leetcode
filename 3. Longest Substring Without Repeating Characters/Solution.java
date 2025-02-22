class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap();
		int max = 0;
		int start = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (map.containsKey(ch)) {
				start = Math.max(start,map.get(ch) + 1);
			}
			map.put(ch, i);
			max = Math.max(max, i - start+1);
		}
		return max;
    }
}