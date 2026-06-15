package com.hands_on1;

import java.util.Scanner;
public class PrimeChecker {
	public static void main(String[] str) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int num=sc.nextInt();
		int count=0;
		if(num<=1) {
			System.out.println("No");
		}
		else {
			for(int i=2;i<Math.sqrt(num);i++) {
				if(num%i==0) {
					count++;
					break;
				}
			}
		}
		if(count==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		sc.close();
	}
}
