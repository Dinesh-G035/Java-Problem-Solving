package com.basicproblem;

import java.util.Scanner;

@SuppressWarnings("serial")
class InvalidEmailException extends Exception{ 
	public InvalidEmailException(String message) {
		super(message);
	}
}

public class EmailChecker {
	public static void EmailValidation(String email) throws InvalidEmailException {
		if (!(email.contains("@") && email.contains("."))){
			throw new InvalidEmailException("Email must contain @ and .");
		}
		System.out.println("Email accepted:" + email);
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter email: ");
		String email = scan.nextLine();
		try {
			EmailValidation(email);
		}
		catch(InvalidEmailException e) {
			System.out.println(e.getMessage());
		}
		
		scan.close();
	}
}
