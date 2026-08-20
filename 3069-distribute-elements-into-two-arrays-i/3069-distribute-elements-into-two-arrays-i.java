class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();
        l1.add(nums[0]);
        l2.add(nums[1]);
        for(int i=2;i<nums.length;i++){
            int v1=l1.get(l1.size()-1);
            int v2=l2.get(l2.size()-1);
            if(v1>v2){
                l1.add(nums[i]);
            }
            else 
               l2.add(nums[i]);
        }
        int size=l1.size()+l2.size();
        int arr[]=new int[size];
        int ind=0;
        for(int i=0;i<l1.size();i++){
            arr[ind++]=l1.get(i);
        }
        for(int i=0;i<l2.size();i++){
            arr[ind++]=l2.get(i);
        }
        return arr;

        
    }
}