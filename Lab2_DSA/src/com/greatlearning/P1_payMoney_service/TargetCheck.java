package com.greatlearning.P1_payMoney_service;

public class TargetCheck {
	
	private long sum=0;
	
	public int checkTarget(int arr[],long target) {
		
		for(int i=0;i<arr.length;i++){
			
			sum = sum+arr[i];
			
			if (sum>=target) {
				sum=0; //reset sum value
				return i;
			}
		}
		
		sum=0; //reset sum value
		return -1;
	}

}
