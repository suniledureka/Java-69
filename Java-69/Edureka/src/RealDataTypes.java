
public class RealDataTypes {

	public static void main(String[] args) {
		//float sal = 255.25; //Type mismatch: cannot convert from double to float
		//float sal = 255.25f;
		//float sal = 255.25F;
		float sal = (float)255.25;
		System.out.println("My Salary = "+ sal);
		
		double data = 255.25;
		System.out.println(data);
		
		System.out.println(Integer.toHexString(65));
	}
}
