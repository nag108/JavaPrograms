
public class CountOcuuranceOfACharacter {
	
	public static void CountOcuuranceOfACharacterInAString(String str,Character val) {
		int count=0;
		for(char c:str.toCharArray()) {
			if(c==val) {
				count++;
			}
		}
		System.out.println(val+ ":"+count);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountOcuuranceOfACharacterInAString("naga",'a');
	}

}
