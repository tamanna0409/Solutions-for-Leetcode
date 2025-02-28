class Solution {
    public String addBinary(String a, String b) {
        StringBuilder r = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int c =0;
       // int s = c;


        while(i>=0||j>=0||c>0){
            int s = c;
            if(i>=0){
                s += a.charAt(i) - '0';
                i--;
            }
            if(j>=0){
                s += b.charAt(j) - '0';
                j--;
            }
            r.append(s%2);
            c = s/2;
        }
        return new String(r.reverse());
    }
}