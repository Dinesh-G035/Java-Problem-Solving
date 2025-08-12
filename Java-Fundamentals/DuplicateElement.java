package com.hands_on1;

import java.util.*;
public class DuplicateElement {
	public static void main(String[] str) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:");
		int size=sc.nextInt();
		System.out.print("Enter the Array Elements:");
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		int[] array=new int[5];
		int k=0;
		for(int i=0;i<array.length;i++) {
			boolean isduplicate=false;
			for(int j=0;j<k;j++) {
				if(arr[i]==arr[j]) {
					isduplicate=true;
					break;
				}
			}
			if(!isduplicate) {
				array[k++]=arr[i];
			}
		}
		for(int i=0;i<k;i++) {
			System.out.print(array[i]+" ");
		}
		sc.close();
	}
}
