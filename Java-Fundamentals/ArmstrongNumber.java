package com.javaassessment;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter passcode:");
		int n=sc.nextInt();
		int original=0;
		if(n<0) {
			System.out.println("Passcode is not a valid Armstrong number.");
			System.out.println("Access Denied.");
			return;
		}
		else {
			original=n;
		}
			
		int sum=0,k=0;
		int[] arr=new int[10];
		while(n>0) {
			int digit=n%10;
			arr[k]=digit;
			k++;
			n/=10;
		}
		for(int i=0;i<k;i++) {
			sum=(int) (sum+(Math.pow(arr[i], k)));
		}
		if(original==sum) {
			System.out.println("Passcode is a valid Armstrong number.");
			System.out.println("Access Granted.");
		}
		else {
			System.out.println("Passcode is not a valid Armstrong number.");
			System.out.println("Access Denied.");
		}
		sc.close();
	}
}
