import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DuplicateCharacter("nagabhushan");

	}
	public static void DuplicateCharacter(String str) {
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		char[] ch=str.toCharArray();
		for(Character c:ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c,1);
			}
		}
		Set<Map.Entry<Character, Integer>> entrySet=map.entrySet();
		for(Map.Entry<Character, Integer> entry:entrySet) {
			if(entry.getValue()>1) {
				System.out.println(entry.getKey()+":"+entry.getValue());  
				
			}
			
			
		}
		
	}
}

