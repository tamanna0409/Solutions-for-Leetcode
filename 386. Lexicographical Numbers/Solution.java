class Solution {
    public List<Integer> lexicalOrder(int n) {
       List<Integer> al = new ArrayList<>();
	     for(int i=1;i<=9;i++){
	     lxn(n,i,al);}
	     /*for(int v: al){
	         System.out.println(v);
	     } */
         return al;
    }
    public static void lxn(int n,int cur,List<Integer> al){
        if(cur>n){
            return;
        }
        al.add(cur);
        for(int i=0;i<=9;i++){
            lxn(n,cur*10+i,al);
        }
    }
}