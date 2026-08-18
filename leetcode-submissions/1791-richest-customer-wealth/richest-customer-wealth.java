class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxWealth = 0;
        int currentWealth = 0;
        int n = accounts.length;
        int m = accounts[0].length;
        for(int i =0;i<n;i++){
            currentWealth = 0;
            for(int j =0;j<m;j++){
                currentWealth += accounts[i][j];
            }
            if(maxWealth<currentWealth){
                maxWealth = currentWealth;
            }
        }
        return maxWealth;
        
    }
}