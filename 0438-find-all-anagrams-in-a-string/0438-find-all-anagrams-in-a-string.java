class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ll=new ArrayList<>();
        int n1=s.length();
        int n2=p.length();
        int f1[]=new int[26];
        int f2[]=new int[26];
        if(n1<n2) return ll;
        for(int i=0;i<n2;i++){
            f1[s.charAt(i)-'a']++;
            f2[p.charAt(i)-'a']++;

        }
        if(Arrays.equals(f1,f2)){
            ll.add(0);
        }
        for(int i=n2;i<n1;i++){
            f1[s.charAt(i)-'a']++;
            f1[s.charAt(i-n2)-'a']--;
            if(Arrays.equals(f1,f2)){
                ll.add(i-n2+1);
            }
        }
        return ll;

    }
}