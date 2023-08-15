import java.util.Scanner;

public class LCSItreativApproch {

	public static void main(String...args)
	{
		Scanner sc=new Scanner(System.in);
		String t=sc.nextLine();
		String s=sc.nextLine();
		
		int[][] dp=new int[t.length()+1][s.length()+1];
		for(int i=t.length();i>=0;i--)
		{
			for(int j=s.length();j>=0;j--)
			{
				if(i==t.length()||j==s.length())
				{
					dp[i][j]=0;
					continue;
				}
				if(t.charAt(i)==s.charAt(j))
				{
					dp[i][j]=1+dp[i+1][j+1];
				}else {
					  dp[i][j]=Math.max(dp[i+1][j], dp[i][j+1]);
				}
			}
		}
		
	   System.out.println(dp[0][0]);
	}
}
