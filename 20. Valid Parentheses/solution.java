class solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<Character> ();
        for(char c: s.toCharArray()){
            if(c=='(' || c == '{' || c== '['){
                st.push(c);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                else if(c==')'&& st.pop()!='('){
                    //System.out.println(false);
                    return false;
                }
                else if(c=='}'&& st.pop()!='{'){
                    //System.out.println(false);
                    return false;
                }
                else if(c==']'&& st.pop()!='['){
                    //System.out.println(false);
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}