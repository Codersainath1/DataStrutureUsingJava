
public class MinCostItrative {

	public static void main(String...args)
	{
		int[][] cost= {{10,4,6},{6,8,12},{19,2,9}};
		System.out.println(minCost(cost));
	}

	public static int minCost(int[][] cost) {
		// TODO Auto-generated method stub
		int m=cost.length;
		int n=cost[0].length;
		int dp[][]=new int[m+1][n+1];
		for(int i=0;i<=m;i++)
		{
		   for(int j=0;j<=n;j++)
		   {
			   dp[i][j]=Integer.MAX_VALUE;
		   }
		}
	    for(int i=m-1;i>=0;i--)
	    {
	    	for(int j=n-1;j>=0;j--)
	    	{
	    		if(i==m-1&&j==n-1)
	    		{
	    			dp[i][j]=cost[i][j];
	    		}
	    		else {
					dp[i][j]=cost[i][j]+Math.min(dp[i+1][j], Math.min(dp[i+1][j+1], dp[i][j+1]));
				}
	    	}
	    }
		return dp[0][0];
	}
}
