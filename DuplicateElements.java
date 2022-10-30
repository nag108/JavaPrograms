package com.pack;

public class DuplicateElements {
	public static void main(String[] args) 
	{
		String s= "nagabhushan";
		char[] ch=s.toCharArray();
		for(int i=0;i<s.length();i++)
		{
			for(int j = i+1;j<s.length();j++)
			{
				if(ch[i]==ch[j])
				{
					System.out.println("reverse string is:"+ch[j]);
				}
			}
		}
}
}