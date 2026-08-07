class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int sum = 0;
        for(int i=0;i<people.length;i++){
            sum+=people[i];
        }
        if(sum%3==0){
            return sum/limit;
        }
        else{
            return (sum/limit)+1;
        }
        
    }
}