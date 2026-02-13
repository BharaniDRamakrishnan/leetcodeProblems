class Solution {
    public int[] shuffle(int[] nums, int n) {
        int i=0;
        int j=n;
        int k=0;
        int ans[]=new int[2*n];
        while(i<n && j<2*n){
            ans[k++]=nums[i++];
            ans[k++]=nums[j++];
        }
        return ans;
        
    }
}