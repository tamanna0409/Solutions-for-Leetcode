class Solution {
    public List<String> generateParenthesis(int n) {
       List<String> al = new ArrayList<>();
	     gp(n,0,0,"",al);
	    /* for(String s: al){
           // return al;
	         System.out.println(s);
	     } */
         return al;
        
    }
     public static void gp(int n,int ob,int cb, String ans,List<String> al){
        if(ob==n && cb==n){
            al.add(ans);
            return ;
        }
       /* if(ob>n || cb>n || cb>ob){
            return ;
        }*/
        if(ob<n){
        gp(n,ob+1,cb,ans+'(',al);}
        if(cb<n && cb<ob){
        gp(n,ob,cb+1,ans+')',al);}
    }
}