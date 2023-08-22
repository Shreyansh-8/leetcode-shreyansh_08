class Solution {
    public static void helper(Queue<Character> q, char val,Set<Character> arr){
        while(q.peek()!=val){
            char ch=q.poll();
            arr.remove(ch);
        }
        q.poll();
    }
    public int lengthOfLongestSubstring(String s) {
        Set<Character> arr = new HashSet<>();
        int max=0;
        Queue<Character> q=new LinkedList<>();
        if(s.length()==0) return max;
        for(int i=0;i<s.length();i++){
            if(!arr.contains(s.charAt(i))){
                q.offer(s.charAt(i));
                arr.add(s.charAt(i));
                max=Math.max(max,q.size());
            }
            else{
                max=Math.max(max,q.size());
                helper(q,s.charAt(i),arr);
                q.offer(s.charAt(i));
            }
        }
        return max;
        
    }
}