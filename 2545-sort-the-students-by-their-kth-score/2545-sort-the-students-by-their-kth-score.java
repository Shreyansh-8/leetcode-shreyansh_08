class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        for(int i=0;i<score.length-1;i++){
            int loc = i;
            for(int j=i+1;j<score.length;j++){
                if(score[j][k]>score[loc][k]){
                    loc=j;
                }
            }
            int[] temp = score[i];
            score[i]=score[loc];
            score[loc]=temp;
        }
        return score;
    }
}