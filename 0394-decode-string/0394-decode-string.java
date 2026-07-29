class Solution {
    public String decodeString(String s) {
        Stack<Integer> s1=new Stack<>();
        Stack<StringBuilder> s2=new Stack<>();
        StringBuilder curr=new StringBuilder();
        int num=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(Character.isDigit(ch)){
                num=num*10+(ch -'0');
            }
            else if(ch=='['){
                s1.push(num);
                s2.push(curr);
                curr=new StringBuilder();
                num=0;
                
            }
            else if(ch==']'){
                int repeat=s1.pop();
                StringBuilder prev=s2.pop();
                for(int j=0;j<repeat;j++){
                    prev.append(curr);
                }
                curr=prev;
            }
            else
                curr.append(ch);
        }
        return curr.toString();
        
    }
}