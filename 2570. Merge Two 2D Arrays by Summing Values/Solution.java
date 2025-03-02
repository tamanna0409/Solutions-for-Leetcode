class Solution {
    public int[][] mergeArrays(int[][] nums1, int[][] nums2) {
        int i=0,j=0;
        List<int[]> r = new ArrayList<>();

        while(i<nums1.length && j<nums2.length){
            int id1 = nums1[i][0], val1 = nums1[i][1];
            int id2 = nums2[j][0], val2 = nums2[j][1];

            if(id1 < id2){
                r.add(new int[]{id1,val1});
                i++;
            }
            else if(id2 < id1){
                r.add(new int[]{id2,val2});
                j++;
            }
            else{
                r.add(new int[]{id1,val1+val2});
                i++;
                j++;
            }
        }
        while(i<nums1.length){
           r.add(nums1[i]);
           i++; 
        }

        while(j<nums2.length){
           r.add(nums2[j]);
           j++; 
        }

        int[][] res = new int[r.size()][2];
        for(int k=0; k<r.size();k++){
            res[k] = r.get(k);
        }

        return res;
    }
}