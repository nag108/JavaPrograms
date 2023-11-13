
public class CountOccurancesOfCharacter {

	public static void getCharCount(String str,char ch) {
		int count=0;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==ch) {
				count++;
			}
		}
		System.out.println(count);
	}
	public static void main(String[] args) {
		getCharCount("Altimetrik",'t');
	}
   
}