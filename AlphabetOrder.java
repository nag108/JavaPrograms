
public class AlphabetOrder {
	public static void alphabetOrder(String str) {
		
		char[] ch=str.toCharArray();
		char temp;
		for(int i=0;i<ch.length;i++) {
			for(int j=i+1; j<ch.length;j++) {
				
				if(ch[i]>ch[j]) {
					temp=ch[i];
					ch[i]=ch[j];
					ch[j]=temp;
				}
			}
		}
		System.out.println(ch);
	}	
	public static void main(String[] args) {
		alphabetOrder("corejava");	
	}

}
