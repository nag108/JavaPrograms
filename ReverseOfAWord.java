package com.pack;

public class ReverseOfAWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="naga bhushan naidu";
		String[]  words=s.split(" ");
		String reverseString=" ";
		for(String w:words)  //java
		{
			String reverseWord="";
			for(int i=w.length()-1;i>=0;i--)
			{
				reverseWord=reverseWord+w.charAt(i);
			}
			reverseString=reverseString+reverseWord+" ";
		}
		
		System.out.println("reverseString:"+reverseString);

	}

}
