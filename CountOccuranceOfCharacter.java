
public class CountOccuranceOfCharacter {
	public static void main(String[] args) {
		String s="java programming oops concepts";
		
		int count=0;
		char[] ch=s.toCharArray();
		for(char c:ch) {
			if(c=='o'){
				count++;
			}
					
		}
		System.out.println(count);
	}

}
