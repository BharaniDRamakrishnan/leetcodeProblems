class Solution {
    public int numWaterBottles(int n, int m) {
        int drink=n;
        int full=0;
        int empty=n;
        while(empty>=m){
        full=empty/m;
        empty=empty%m;
        drink+=full;
        empty+=full;
        full=0;
        }
        return drink;

        
    }
}