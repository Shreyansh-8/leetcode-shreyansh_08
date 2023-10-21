class Solution {
    public String removeDuplicateLetters(String s) {
        Map<Character,Integer> map = new HashMap<>();
        Set<Character> set = new HashSet<>();
        Stack<Character> s1 = new Stack<>();
        
        
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
            }    
            else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        
        
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.get(s.charAt(i))-1);
            if(set.contains(s.charAt(i))){
                continue;
            }
            while(!s1.isEmpty() && map.get(s1.peek())>0 && (s1.peek()-'a')>(s.charAt(i)-'a')  ){
                set.remove(s1.peek());
                s1.pop();
            }
            if(!set.contains(s.charAt(i))){
                s1.push(s.charAt(i));
                set.add(s.charAt(i));
            }
            
        }
        String str="";
            while(!s1.isEmpty()){
                str=s1.pop()+str;
            }
        
        return str;
    }
}