class Solution {
    public int trap(int[] h) {
         // Left max level - array
        int left[] = new int[h.length];
        left[0]=h[0];
        for(int i=1;i<h.length;i++){
            left[i] = Math.max(left[i-1],h[i]);
        }

        //right max level  - array 
        int right[] = new int[h.length];
        right[h.length-1]= h[h.length-1];

        for(int i=h.length-2;i>=0;i--){
            right[i] = Math.max(right[i+1],h[i]);
        }
        int water;
        int trap =0;
        //loop
        // water level = min(left max,right max) 
        for(int i=0;i<h.length;i++){
            water = Math.min(left[i],right[i]);
            trap += water - h[i];
             //trpped water = water level - h[i]
        }
        return trap;
    }
}