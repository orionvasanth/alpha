package geeksforgeeks.set36;

import java.util.Arrays;

public class MaximumProductCutting {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MaximumProductCutting cutting = new MaximumProductCutting();
		System.out.println(cutting.findMaxProduct(10));
	}
	
	private int[] dp;
	
	public int findMaxProduct(int length){
		dp = new int[length + 1];
		Arrays.fill(dp, 1);
		dp[2] = 1;
		
		return findMax(10);
	}
	
	private int findMax(int length){
		for(int i = 1; i < length; i++){
			dp[length] = Math.max(i * (length - i), findMax(length-i) * i);
		}
		return dp[length];
	}

}
