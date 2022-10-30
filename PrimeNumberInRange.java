package com.pack;

public class PrimeNumberInRange {
	public static boolean isPrimeNumber(int num) {
		if(num<=1)
		{
			return false;
			
		}
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}return true;
	}
	public static void getPrimeNumbers(int num)
	{
		for(int i=2;i<50;i++) {
			if(isPrimeNumber(i))
				System.out.println(i+ " ");
		}
		
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//2 is the lowest prime number
		//20
		//System.out.println("2 is a prime number:"+isPrimeNumber(2));
		//System.out.println("10 is a prime number:"+isPrimeNumber(10));	
		getPrimeNumbers(100);
		}

	}
