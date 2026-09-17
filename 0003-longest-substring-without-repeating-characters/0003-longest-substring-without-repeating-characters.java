class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> h = new HashSet<>();
        int max = 0;
        int left = 0;
        for(int right=0;right<s.length();right++){
            while(h.contains(s.charAt(right))){
                h.remove(s.charAt(left++));
            }
            h.add(s.charAt(right));
            max = Math.max(max,right-left+1);
        }
        return max;
    }
}