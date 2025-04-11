class Solution {
    public int maximumWealth(int[][] accounts) {
        int maxw=0,sum;
        for(int i=0;i<accounts.length;i++)
        {
            sum=0;
            for(int j=0;j<accounts[i].length;j++)
            {
                sum=sum+accounts[i][j];
            }
            maxw=Math.max(maxw,sum);
        }
        return maxw;
        
    }
}
