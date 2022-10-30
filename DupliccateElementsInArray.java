package com.pack;

public class DupliccateElementsInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s[]= {"java","selenium","selenium","maven"};
		for(int i=0;i<s.length;i++)
		{
			for(int j=i+1;j<s.length;j++)	
			{
				if(s[i]==s[j])
				{
					 System.out.println("DupliccateElementsInArray:"+ s[j]);
				}
			}
		}
	}	
}
