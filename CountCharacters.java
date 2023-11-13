import java.util.HashMap;
import java.util.Map;

public class CountCharacters {
	public static void countCharacter(String name) {
		Map<Character,Integer> map=new HashMap<Character,Integer>();
		char[] ch=name.toCharArray();
		for(char c:ch) {
			if(map.containsKey(c)) {
				map.put(c, map.get(c)+1);
			}
			else {
				map.put(c, 1);
			}
		}
		System.out.println(name+ " : "+ map);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		countCharacter("naga bhushan naidu");
	}

}
