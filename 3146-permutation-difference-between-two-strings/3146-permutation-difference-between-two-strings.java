class Solution {
    public int findPermutationDifference(String s, String t) {
       Map<Character,Integer> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),i);
            }
               continue;
        }
        for(int j=0;j<t.length();j++){
            if(map.containsKey(t.charAt(j))){
                map.put(t.charAt(j),Math.abs(map.get(t.charAt(j)).intValue()-j));
            }
            continue;
        }
               
        int sum=0;
               for(Integer val:map.values()){
                   sum=sum+val;
               }
               
               return sum;
        
    }
}