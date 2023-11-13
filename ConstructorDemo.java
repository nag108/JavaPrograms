
public class ConstructorDemo {
	String name;
	int rollno;
	ConstructorDemo(String name,int rollno){
		this.name=name;
		this.rollno=rollno;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo demo=new ConstructorDemo("naga", 101);
		System.out.println(demo.name);
		System.out.println(demo.rollno);
	}
	

}
