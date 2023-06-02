class Solution {
    public String removeOuterParentheses(String s) {
         Stack<Character> stack = new Stack<>();
         StringBuilder str1 = new StringBuilder();
         int z=0;
         for(int i=0;i<s.length();i++){
             if(stack.isEmpty()){
                 stack.push(s.charAt(i));
             stack.push(s.charAt(i+1));
             i++;
             }
             else{
                 stack.push(s.charAt(i));
             }
             char ch1=stack.pop();
             char ch2 = stack.pop();
             String str="";
             str=str+ch2+ch1; 
             if(str.equals("()")){
                 if(stack.isEmpty()){
                 str1.append(s.substring(z+1,i));
                 z=i+1;
             }
             }
             else{
                 stack.push(ch2);
                 stack.push(ch1);
             }
             
         }
         return str1.toString();
    }
}