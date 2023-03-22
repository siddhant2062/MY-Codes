package _4_stack_level_1;
import java.util.*;
public class knapsack01 {
	public static void main(String arsg[]) {
//		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
//		int values[]=new int[n];
//		int weight[]=new int[n];
//		for(int i=0;i<n;i++) {
//			values[i]=sc.nextInt();
//		}
//		for(int i=0;i<n;i++) {
//			weight[i]=sc.nextInt();
//		}
//		int cap=sc.nextInt();
//		int dp[][]=new int[n+1][cap+1];
//		for(int i=1;i<dp.length;i++) {
//			for(int j=1;j<dp[0].length;j++) {
//
//				if(j>=weight[i-1]) {
//					int rcap=j-weight[i-1];
//					if(dp[i-1][rcap]+values[i-1]>dp[i-1][j]) {
//						dp[i][j]=dp[i-1][rcap]+values[i-1];
//					}else {
//						dp[i][j]=dp[i-1][j];
//					}
//				}else {
//					dp[i][j]=dp[i-1][j];
//				}
//				
//			}
//		}
//		System.out.println(dp[n][cap]);
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int values[]=new int[n];
		int weight[]=new int[n];
		for(int i=0;i<n;i++) {
			values[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			weight[i]=sc.nextInt();
		}
		int cap=sc.nextInt();
		int dp[][]=new int[n+1][cap+1];
		for(int i=1;i<dp.length;i++) {
			for(int j=1;j<dp[0].length;j++) {
				if(j>=weight[i-1]) {
					int rcap=j-weight[i-1];
					if(dp[i-1][rcap]+values[i-1]>dp[i-1][j]) {
						dp[i][j]=dp[i-1][rcap]+values[i-1];
					}else{
						dp[i][j]=dp[i-1][j];
					}
				}else {
					dp[i][j]=dp[i-1][j];
				}
			}
		}
		System.out.println(dp[n][cap]);
	}
}
