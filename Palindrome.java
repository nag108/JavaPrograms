package com.pack;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// reverse of a number it returns same number
		   Scanner scanner=new Scanner(System.in);
		   System.out.println("Enter a number:" );
			int num=scanner.nextInt();
			int org_num=num;
			int rev=0;
			while(num!=0){
			rev=rev*10+num%10;
			num=num/10;
			}
			if(org_num==rev) 
			{
				System.out.println(org_num+ "palindrome number");
				
			}
			else {
				System.out.println("Not a palindrome number");
			}
	}
}


	