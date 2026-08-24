class Solution {
    public int trap(int[] height) {
        int start=0;
        int end=height.length-1;
        int rm=0;
        int lm=0;
        int res=0;
        while(start<end){
            rm=Math.max(rm,height[end]);
            lm=Math.max(lm,height[start]);
            if(rm<lm){
                res+=rm-height[end];
                end--;
            }
            else{
                res+=lm-height[start];
                start++;
            }
        }
        return res;
    }
}