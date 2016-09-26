package com.day0926.practice2;

public class Test21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// long dp[33][3][3];
		long[][][] dp = new long[33][3][3];

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				dp[2][i][j] = 1;
			}
		}
		
		for (int len = 2; len < 30; len ++) {
	        for (int i = 0; i < 3; i ++) {
	            for (int j = 0; j < 3; j ++) {
	                for (int k = 0; k < 3; k ++) {
	                    int s = (1 << i) | (1 << j) | (1 << k);
	                    if (s == 7) {
	                        continue;
	                    }
	                    dp[len + 1][j][k] += dp[len][i][j];
	                }
	            }
	        }
	    }
		int n=4;
		long ans =0;
		
	        if (n == 0) {
	             ans=0;
	        } else if (n == 1) {
	            ans=3;
	        } else {
	            ans = 0;
	            for (int i = 0; i < 3; i ++) {
	                for (int j = 0; j < 3; j ++) {
	                    ans += dp[n][i][j];
	                }
	            }
	       
	        }
	    
		System.out.println(ans);


	}

}
