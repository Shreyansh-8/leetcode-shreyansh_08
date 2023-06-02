class Solution {
    public boolean isAnagram(String s, String t) {
      int[] arr1 = new int[256];
        int[] arr2 = new int[256];
        Arrays.fill(arr1,-1);
        Arrays.fill(arr2,-1);
        if(s.length()!=t.length()){
            return false;
        }
        for(int i=0;i<s.length();i++){
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            if(arr1[ch1]==-1 && arr2[ch2]==-1){
                arr1[ch1]=1;
                arr2[ch2]=1;
            }
            
             else if(arr1[ch1]!=-1 && arr2[ch2]==-1){
                arr1[ch1]=arr1[ch1]+1;
                arr2[ch2]=1;
            }
            else if(arr2[ch2]!=-1 && arr1[ch1]==-1){
                arr2[ch2]=arr2[ch2]+1;
                arr1[ch1]=1;
            }
            else if(arr1[ch1]!=-1 && arr2[ch2]!=-1){
                arr1[ch1]=arr1[ch1]+1;
                arr2[ch2]=arr2[ch2]+1;
            }
             
        }
        for(int j=0;j<s.length();j++){
            char ch=s.charAt(j);
        
            if(arr1[ch]!=arr2[ch]){
                return false;
                
            }
        }
        return true;
    }
}