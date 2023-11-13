
public class ReverseOfAString {
	public static void main(String[] args) {
		String s="This is an interview";
		String rev="";
		for(int i=s.length()-1;i>=0;i--) {
			//for(int i=0;i<s.length();i++) {
			rev=rev+s.charAt(i);
		}
		System.out.print(rev);
	}	
}
