package com.greatlearning.main;

import java.util.Scanner;

import com.greatlearning.P1_payMoney_service.TargetCheck;


public class P1_PayMoneyMain {

	public static void main(String args[]) {
		
		int res;
		TargetCheck tc = new TargetCheck();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter size of transaction array");
		int size = sc.nextInt();
		
		System.out.println("Enter values of array");
		int[] arr = new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();  
		}
		
		System.out.println("Enter total number of target to be achieved");
		int targetNo = sc.nextInt();
		
		for(int i=1;i<=targetNo;i++) {
			
			
			System.out.println("Enter value of target");
			long target = sc.nextInt();
			
			res = tc.checkTarget(arr, target);
			
			
			if (res == -1) {
				System.out.println("Given target is not achieved");
			}
			else { 
				System.out.println("Target is achieved after " +(res+1)+ " transactions");
			}
		}
		
		
		
		
	}
}
