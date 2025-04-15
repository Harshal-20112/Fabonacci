package pac1;

public class FabSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=0;
		int b=1;
		int fab=0;
		while(a<=10)
		{
			fab=a+b;
			a=b;
			b=fab;
			
			System.out.println(b);
		}
	

	}

}
