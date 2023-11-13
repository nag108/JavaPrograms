
public class TestDemo {
	private static Test t=null;
	private TestDemo() {
		
	}
    public static Test getTest() {
    	if(t==null) {
    		t=new Test();
    	}
    	return t;
    }
}
 class Client{
	public static void main(String[] args) {
		System.out.println(TestDemo.getTest());
		System.out.println(TestDemo.getTest());
	}
}