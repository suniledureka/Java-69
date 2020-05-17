package co.edureka;

public class Main {

	public static void main(String[] args) throws Exception{
		NumsServiceLocator locator = new NumsServiceLocator(); 
		Nums obj = locator.getNums();
		
		System.out.println("Sum = "+ obj.addNum(10, 24));
		System.out.println("Diff = "+ obj.addNum(10, 24));
	}
}
