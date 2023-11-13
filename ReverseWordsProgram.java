
public class ReverseWordsProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="namburi nagabhushanam naidu";
		String result=" ";
		String[] arr=str.split(" ");
		for(int i=arr.length-1;i>=0;i--) 
		{
			result=result+arr[i]+" ";
		}
           System.out.println(result);
	}

}
