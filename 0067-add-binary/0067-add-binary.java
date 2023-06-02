class Solution {
    public String addBinary(String a, String b) {
        int carry=0;
        
        String result = "";
        int i=a.length()-1;
        int j=b.length()-1;
        while(i>=0 || j>=0){
            int sum = 0;
            if(i>=0){
            sum=sum+Integer.parseInt(String.valueOf(a.charAt(i--)));
             }
            if(j>=0){
                sum=sum+Integer.parseInt(String.valueOf(b.charAt(j--)));
            }
            sum=sum+carry;
            if(sum>1){
                result=Integer.toString(sum%2)+result;
                carry=1;
            }
            else{
                result=Integer.toString(sum)+result;
                carry=0;
            }
        }
        if(carry==1){
            result='1'+result;
        }
        return result;
    }
}