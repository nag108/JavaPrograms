
public class RemoveNumbersFromString {
  public static String RemoveNumber(String str)
  {
	  String name=" ";
	  for(int i=0;i<str.length();i++)
	  {
		 if(!Character.isDigit(str.charAt(i)))
		 {
			 name=name+str.charAt(i);
		 }
	  }
	  return name;
  }
	
	public static void main(String[] args) {
		String str="7485na748gab14785hus258han7852";
		System.out.println(RemoveNumber(str));

	}
	
	

}



