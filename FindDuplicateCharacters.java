import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharacters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="nagabhushan naidu namburi";
		char[] ch=str.toCharArray();
		Map<Character, Integer> map=new HashMap<Character, Integer>();
		int count=1;
		for(int i=0;i<ch.length;i++) {
			if(!map.containsKey(ch[i])) {
				map.put(ch[i],count);
			}
			else {
				map.put(ch[i], map.get(ch[i])+1);
			}
		}
		//printing duplicates
		for(Character key:map.keySet()) {
			if(map.get(key)>1) {
				System.out.println(key+":"+map.get(key));
			}
		}

	}

}
