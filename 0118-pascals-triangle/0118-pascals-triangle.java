class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.get(0).add(1);
        if(numRows==1) return list;
        list.add(new ArrayList<>());
        list.get(1).add(1);
        list.get(1).add(1);
        if(numRows==2) return list;
        int size=3;
        for(int i=2;i<numRows;i++){
            List<Integer> newList = new ArrayList<>();
            for(int j=0;j<size;j++){
                if(j==0 || j==size-1){
                    newList.add(1);
                }
                else{
                    newList.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                }
            }
            list.add(newList);
            size++;
            
        }
        return list;
    }
}