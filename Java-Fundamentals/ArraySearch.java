package com.hands_on1;

import java.util.*;
public class ArraySearch {
	public static void main(String[] str) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 25 Numbers:");
		int[] arr=new int[25];
		for(int i=0;i<25;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the nummber to search:");
		int n=sc.nextInt();
		int count=0;
		for(int i=0;i<25;i++) {
			if(arr[i]==n) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
		
	}
}
