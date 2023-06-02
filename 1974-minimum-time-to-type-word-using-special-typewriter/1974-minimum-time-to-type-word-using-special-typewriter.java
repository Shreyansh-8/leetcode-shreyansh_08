class Solution {
    public int minTimeToType(String word) {
        int ptr='a';
        int count=0;
        for(int i=0;i<word.length();i++){
            int a =word.charAt(i);
            if(a==ptr){
                count++;
            }
            else if(a>ptr){
                count=count+1+Math.min(a-ptr,122-a+ptr-96);
            }
            else{
                count=count+1+Math.min(ptr-a,122-ptr+a-96);
            }
            ptr=a;

        }
        return count;
    }
}