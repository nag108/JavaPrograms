
public class ReverseAWord {
//Interview an is This
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="namburi nagabhushanam naidu";
		String[] arr=str.split(" ");
		String reverseString="";
		for(String w:arr) {
		String reverseAword="";
		for(int i=w.length()-1;i>=0;i--) {
		reverseAword=reverseAword+w.charAt(i);	
			}
			System.out.println(reverseAword);
			reverseString=reverseAword+reverseString+"";
		}
		
	}
	

}
