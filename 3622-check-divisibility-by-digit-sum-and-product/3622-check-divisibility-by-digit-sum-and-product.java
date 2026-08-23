class Solution {
    public boolean checkDivisibility(int n) {
        int num=n;
        int sum=0;
        int prod=1;
        while(n>0){
            int dig=n%10;
            sum+=dig;
            prod*=dig;
            n/=10;
        }
        int add=sum+prod;
        if(num%add==0){
            return true;
        }
        return false;

        
    }
}