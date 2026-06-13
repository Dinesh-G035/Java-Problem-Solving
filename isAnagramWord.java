package com.hands_on1;

import java.util.*;
public class isAnagramWord {
	static boolean isAnagram(String str1,String str2) {
		str1=str1.toLowerCase();
		str2=str2.toLowerCase();
		char[] a=str1.toCharArray();
		char[] b=str2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		for(int i=0;i<str1.length();i++) {
			if(a[i]!=b[i]) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the First Word:");
		String str1=sc.nextLine();
		System.out.print("Enter the Second Word:");
		String str2=sc.nextLine();
		boolean a=isAnagram(str1,str2);
		System.out.println(a);
		sc.close();

	}

}
