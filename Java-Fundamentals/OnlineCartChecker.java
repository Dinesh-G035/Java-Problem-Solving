package com.basicproblem;

import java.util.Scanner;

@SuppressWarnings("serial")
class NegativeQuantityException extends Exception{
	public NegativeQuantityException(String message) {
		super(message);
	}
}

public class OnlineCartChecker {
	public static void QuantityChecker(int count) throws NegativeQuantityException {
		if (count < 0) {
			throw new NegativeQuantityException("Quantity cannot be negative."); 
		}
		System.out.println("Added " + count + " items to the cart.");
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number of items ot be added to cart:");
		int count = scan.nextInt();
		
		try {
			QuantityChecker(count);
		}
		catch(NegativeQuantityException e) {
			System.out.println(e.getMessage());
		}
		
		scan.close();
	}
}
