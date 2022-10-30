package com.pack;

public class ReverseOfAString {
	public static void main(String[] args) {
	String str="naga";
    String rev="";
	

	for(int i=str.length()-1; i>=0; i--)
	{

	rev=rev+str.charAt(i);
	}

	System.out.println("reversed string is:"+ rev);

	 
}
}



