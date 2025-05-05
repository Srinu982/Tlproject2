package com.gitdemo;

import java.util.Scanner;

public class DivisionDemo {

	public static void main(String[] args) {
	
			int a,b,c;
			System.out.println("please enter any two numbers");
			Scanner sc =new Scanner(System.in);
			a = sc.nextInt();
			b = sc.nextInt();
			try {
				 c = (a / b);
				System.out.println("Quotient of given numbers is : " + c);
			} catch (Exception e) {

				System.out.println(e);
			}
}
}
