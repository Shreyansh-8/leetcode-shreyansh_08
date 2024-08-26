class Solution {
    public int scoreOfString(String s) {
        int pre = s.charAt(0);
        int abs=0;
        for(int i=1;i<s.length();i++){
            int cur = s.charAt(i);
            abs=abs+Math.abs(pre-cur);
            pre = cur;
        }
        return abs;
    }
}