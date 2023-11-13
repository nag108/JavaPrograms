import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string: ");
		String name=sc.next();
		String rev="";
		String org_name=name;
		int len=name.length();
		for(int i=len-1;i>=0;i--) {
			rev=rev+name.charAt(i);
			}
		System.out.println(rev);

	}

}
