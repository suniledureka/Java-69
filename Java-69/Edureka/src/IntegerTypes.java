
public class IntegerTypes {

	public static void main(String[] args) 
	{
	  byte b = 127;
	  //byte b = 128; //CE - Type mismatch: cannot convert from int to byte	
	  System.out.println(b);
	  
	  long pop = 9858478123L;
	  System.out.println("World Population = "+pop);
	  
	  int n = (int)25L;
	  System.out.println(n);	  
	  
	  byte bb=(byte)129;
	  System.out.println(bb); //-128
	}
}
