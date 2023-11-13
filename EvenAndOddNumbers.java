
public class EvenAndOddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {4,8,2,5,7,10,58,69,90};
		System.out.println("print even numbers: ");
		for(int i=0;i<a.length;i++)
		if(a[i]%2==0) {
			System.out.println(a[i]);
			
		}
		System.out.println("print odd numbers: ");
		for(int i=0;i<a.length;i++)
		if(a[i]%2!=0) {
			System.out.println(a[i]);
			
		}
		

	}

}
