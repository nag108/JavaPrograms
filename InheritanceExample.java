
public class InheritanceExample {
	public void methodOne() {
		
	}

}
class child extends InheritanceExample{
	public void methodTwo() {
		
	}
	public static void main(String[] args) {
		child c=new child();
		c.methodTwo();
		c.methodOne();
		InheritanceExample ex=new InheritanceExample();
		ex.methodOne();
		InheritanceExample ex1=new InheritanceExample();
		ex1.methodOne();
		child c1=new InheritanceExample();
		c1.methodOne();
		c1.methodTwo();
		
		
	}
}
