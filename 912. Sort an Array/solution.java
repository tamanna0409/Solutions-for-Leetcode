class Solution {
    public int[] sortArray(int[] nums) {
        mergesort(nums,0,nums.length-1);
        return nums;
    }
    public static void mergesort(int [] nums,int l,int h){
        if(l>=h){
            return;
        }
        int mid= (l+h) / 2;
        mergesort(nums,l,mid);
        mergesort(nums,mid+1,h);

        merge(nums,l,mid,h);
    }
    public static void merge(int[] nums,int l,int mid, int h){
        int[] arr= new int[h-l+1];
        int i=l; int k=0;
        int j=mid+1;
        while(i<=mid && j<=h){
            if(nums[i]>nums[j]){
                arr[k]=nums[j];
                j++;
            }
            else{
                arr[k]=nums[i];
                i++;
            }
            k++;
        }
        while(i<=mid){
            arr[k]=nums[i];
            k++;
            i++;
        }
        while(j<=h){
            arr[k]=nums[j];
            j++;
            k++;
        }
        for(int a=0;a<arr.length;a++){
            nums[a+l] =arr[a];
        }
    }
}