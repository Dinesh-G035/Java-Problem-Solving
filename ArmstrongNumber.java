package com.dinesh_javaassessment;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter passcode:");
		int n=sc.nextInt();
		int original=0;
		int len=String.valueOf(n).length();
		if(n<0) {
			System.out.println("Armstrong Number should be Positive.");
			return;
		}
		else {
			original=n;
		}
		int sum=0;
		while(n>0) {
			int digit=n%10;
			sum+=Math.pow(digit, len);
			n/=10;
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
