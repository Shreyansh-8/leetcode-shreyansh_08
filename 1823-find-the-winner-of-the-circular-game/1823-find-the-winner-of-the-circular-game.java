class Solution {
    public int findTheWinner(int n, int k) {
       Queue<Integer> l = new LinkedList<>();
        for(int i=1;i<=n;i++){
            l.offer(i);
        }
        
        int temp=1;
        while(l.size()!=1){
            if(temp==k){
               l.poll();
                temp=1;
            }
            else{
            temp++;
            l.offer(l.poll());
        }
    }
        
        return l.poll();
    }
}