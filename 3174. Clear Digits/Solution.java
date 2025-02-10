public class Solution {
    public String clearDigits(String s) {
        Stack<Character> st = new Stack<>();
        for(char c: s.toCharArray()){
            if(Character.isDigit(c) && !st.isEmpty()){
                st.pop();
            }
            else{
                st.push(c);
            }
        }
        StringBuilder r = new StringBuilder();
        while(!st.isEmpty()){
            r.append(st.pop());
        }
        return r.reverse().toString();
    }
}