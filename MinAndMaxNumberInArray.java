
public class MinAndMaxNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {70,50,90,10};
		int max=a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
		
		}

	}


