
public class InheritanceDemo {
	public void methodOne() {
		
	}
public class Child extends InheritanceDemo{
	public void methodTwo() {
		
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InheritanceDemo demo=new InheritanceDemo();
		demo.methodOne();
		//demo.methodTwo();
		Child c=new Child();
		c.methodOne();
		c.methodTwo();
	 InheritanceDemo demo1=new Child();
	 demo.methodOne();
	 //demo.methodTwo();
	
		

	}

}
