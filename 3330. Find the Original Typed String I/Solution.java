class Solution {
    public int possibleStringCount(String word) {
        int result = 0;
        int count = 1;

        for (int i = 1; i < word.length(); i++) {
            if (word.charAt(i) == word.charAt(i - 1)) {
                count++;
            } else {
                result += (count - 1);
                count = 1;
            }
        }

        // Add remaining group
        result += (count - 1);

        return result + 1;  
    }
}