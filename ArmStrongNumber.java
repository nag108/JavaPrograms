package com.pack;

public class ArmStrongNumber {
	// TODO Auto-generated method stub
	//123 1*1*1 2*2*2* 3*3*3 
	public static void isArmStrongNumber(int num) {
		int cube=0;
		int r;
		int t;
		t=num;
		while(num>0) {
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
			
		}
		if(t==cube) {
			System.out.println("this is ArmStrongNumber");
		}else {
			System.out.println("this is not ArmStrongNumber");
		}
		
	}

	public static void main(String[] args) {
		
		isArmStrongNumber(153);
		

	}

}
