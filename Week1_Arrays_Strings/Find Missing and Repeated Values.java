class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
    int [] sol= new int [2];
    HashSet<Integer>hs=new HashSet<>();
    for(int i=0;i<grid.length;i++)
    {
        for(int j=0;j<grid.length;j++)
        {
            if(!hs.contains(grid[i][j]))
            {
                hs.add(grid[i][j]);
            }
            else
            {
                sol[0]=grid[i][j];
            }
        }
    }
    for( int i=1;i<=grid.length*grid.length;i++)
    {
        if(!hs.contains(i))
        {
            sol[1]=i;
        }
    }
        return sol;
    }   
}
