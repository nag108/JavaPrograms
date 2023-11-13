public class ReverseStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="welcome to java";
		String rev=" ";
		
		/*for(int i=s.length()-1;i>0;i--) {
			rev=rev+s.charAt(i)+"";
		}
         System.out.println(rev);
	}*/
       String s1[]=s.split( "");
        for(int i=s1.length-1;i>=0;i--) {
        	System.out.print(s1[i]+"");
        }
}
}
