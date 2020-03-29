
public class Naturals3 {

	public static void main(String[] args) {
		naturals(1,25); //method call
		naturals(1,10);
	}
	
	/* method definition*/
	static void naturals(int fno, int lno) {
		System.out.println("First "+lno+" Natural Numbers are: ");
		while(fno<=lno)
		{
			if(fno==lno)
				System.out.println(lno);
			else
				System.out.print(fno+", ");
			
			fno++;
		}
	}

}
