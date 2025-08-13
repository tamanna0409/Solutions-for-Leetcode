class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits.length() == 0) return ans;

        String[] arr = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

        helper(0, digits, new StringBuilder(), ans, arr);
        return ans;
    }

    public void helper(int index, String digits, StringBuilder sb, List<String> ans, String[] arr) {
        if (index == digits.length()) {
            ans.add(sb.toString());
            return;
        }

        int num = Character.getNumericValue(digits.charAt(index));
        String str = arr[num];

        for (int i = 0; i < str.length(); i++) {
            sb.append(str.charAt(i));
            helper(index + 1, digits, sb, ans, arr);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}