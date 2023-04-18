class Solution {
   public int maximumUnits(int[][] boxTypes, int truckSize) {
    Arrays.sort(boxTypes,(a,b)->b[1]-a[1]); 
    int max  = 0 ;
    
    for(int []e : boxTypes){
        if(truckSize>=e[0]){
            max+=e[0]*e[1];
            truckSize-=e[0];
        }else if (truckSize >0 && truckSize < e[0]){
            max+=truckSize*e[1];
            truckSize= 0;
        }
        if(truckSize == 0){
            break;
        }
    }
    return max;
}

}