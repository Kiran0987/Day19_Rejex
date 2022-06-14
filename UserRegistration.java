package com.bl.rejistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {

	public static void main(String[] args) {
		String name = "[A-Z]+[a-z]{3,}";
		Pattern pattern = Pattern.compile(name); 
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your First Name : ");
		String input = sc.nextLine();

		if (pattern.matcher(input).matches()) {
			System.out.println("Valid");
		} else {
			System.out.println("Invalid");
		}
	}
}