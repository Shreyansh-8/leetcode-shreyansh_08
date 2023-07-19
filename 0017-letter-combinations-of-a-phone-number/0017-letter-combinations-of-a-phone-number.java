class Solution {
    private static String[] arr = {"*","*","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
    public static void helper(String digits,String ans,List<String> combine){
       if(digits.length()==0){
           combine.add(ans);
           return ;
       }
        String k=arr[(digits.charAt(0)-48)];
        for(int i=0;i<k.length();i++){
            helper(digits.substring(1),ans+k.charAt(i),combine);
        }
        
    }
    public List<String> letterCombinations(String digits) {
        List<String> combine = new ArrayList<>();
        if(digits.length()==0){
            return combine;
        }
        String ans="";
        helper(digits,ans,combine);
        return combine;
        
    }
}