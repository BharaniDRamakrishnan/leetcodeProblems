class Solution {
    public double findMaxAverage(int[] arr, int k) {
        int n=arr.length;
        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
            
        }
        int max=sum;
        for(int i=k;i<n;i++){
            sum+=arr[i];
            sum-=arr[i-k];
            max=Math.max(max,sum);
        }
        return (double) max/k;
        
    }
}