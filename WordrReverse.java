
public class WordrReverse {
	public static void wordReverses(String name) {
		String[] s1=name.split(" ");
        for(int i=s1.length-1;i>=0;i--) {
        	System.out.print(s1[i]+" ");	
	}
	}

	public static void main(String[] args) {
		//wordReverses("core java");
		// TODO Auto-generated method stub
		String s="naga bhushan naidu";
		char[] ch=s.toCharArray();
		
		for(int i=s.length()-1;i>=0;i--) {
			
			System.out.print(ch[i]);
		}
        
        }
	}


