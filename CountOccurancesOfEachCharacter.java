import java.util.HashMap;
import java.util.Map;

public class CountOccurancesOfEachCharacter {
	public static void getEachCharacterOccurance(String name) {
	Map<Character, Integer> charMap=new HashMap<Character, Integer>();
	char[] ch=name.toCharArray();
	for(char c:ch) {
	if(charMap.containsKey(c)) {
		charMap.put(c, charMap.get(c)+1);
	}
	else {
		charMap.put(c,1);
	}	
   }
	System.out.println(charMap);
}
public static void main(String[] args) {
		getEachCharacterOccurance("nagabhushan");
		
	}

}
