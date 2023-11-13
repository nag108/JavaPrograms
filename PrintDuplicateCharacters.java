import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class PrintDuplicateCharacters {
	public static void duplicateCharacters(String str) {
		char words[]=str.toCharArray();
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		for(char ch:words) {
			if(map.containsKey(ch)){
				map.put(ch, map.get(ch)+1);
		       }
			else
			{
				map.put(ch,1);
			}
		}
		System.out.println(map);
	}


//print the map
			//Set<Map.Entry<Character, Integer>> entryMap= map.entrySet();
			//for(Map.Entry<Character, Integer> entry:entryMap)
//{
	//if(entry.getValue()>1) {
		//System.out.println(entry.getKey()+":"+entry.getValue());
	//}
	//}
	public static void main (String[] args) {
			duplicateCharacters("nagabhushan");
		}
	
	
}