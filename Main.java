package scd;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int num1,num2;
		Scanner s= new Scanner(System.in);
		System.out.println("Enter Number 1: ");
		num1=s.nextInt();
		System.out.println("Enter Number 2: ");
		num2=s.nextInt();
		System.out.println("Sum : " + add(num1, num2));
		System.out.println("Substraction : "+sub(num1,num2));
		
		
		
	}

}
