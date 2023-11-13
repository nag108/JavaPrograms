import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountDuplicteCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printDuplicateCharacter("nagabhushanam naidu namburi");
		}
	public static void printDuplicateCharacter(String str) {
		if(str==null) {
			System.out.println("null string");
		return;
		}
		if(str.isEmpty()) {
			System.out.println("empty string");
			return ;
			}
		if(str.length()==1) {
			System.out.println("single character string");
			return;
		}
		
		
		char[] words=str.toCharArray();
		Map<Character, Integer> charMap=new HashMap<Character,Integer>();
			for(Character ch:words) {
				if(charMap.containsKey(ch)) {
					charMap.put(ch, charMap.get(ch)+1);
				}
				else {
					charMap.put(ch, 1);
				}
			}
			
			//print the map
			Set<Map.Entry<Character, Integer>> entry=charMap.entrySet();
			for(Map.Entry<Character, Integer>e:entry) {
				if(e.getValue()>1) {
					System.out.println(e.getKey()+":"+e.getValue());   
				
				}
			}
	}
	
}
