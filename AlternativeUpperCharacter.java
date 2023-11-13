import java.util.Scanner;

public class AlternativeUpperCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.nextLine();
		str=str.toLowerCase();
		char ch[]=str.toCharArray();
		for(int i=0;i<ch.length;i=i+2) {
			ch[i]=Character.toUpperCase(ch[i]);
		}
		System.out.println(new String(ch));
	}

}
