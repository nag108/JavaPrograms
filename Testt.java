public class Testt {
	
	private static Testt t=null;
	private Testt() {
	}
	public static Testt getTest()
	{
		if(t==null)
		{
			t=new Testt();
		}
		return t;
	}
}
 class TestTwo
{
	public static void main(String[] args) {
		System.out.println(Testt.getTest().hashCode());
		System.out.println(Testt.getTest().hashCode());
		System.out.println(Testt.getTest().hashCode());
	}
}
