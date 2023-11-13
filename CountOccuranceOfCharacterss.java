import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountOccuranceOfCharacterss {
  public static void countOccuranceOfCharacterss(String name) {
	  
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
	  
	  
	  //System.out.println(charMap);
	  //print the map
	  Set<Map.Entry<Character, Integer>> entrySet =charMap.entrySet();
	  for(Map.Entry<Character, Integer> entry:entrySet) {
		  if(entry.getValue()>2) {
			  
			  System.out.println(entry.getKey()+":"+entry.getValue());
		  }
		  
	  }
	  
  }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		countOccuranceOfCharacterss("nagabhusahn naidu namburi"); 

	}

}
