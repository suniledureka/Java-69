
public class ArrayInitialization 
{
	public static void main(String[] args) 
	{
		int[] marks = {98,85,76,93,87,62};
		System.out.println("No of Subjects = "+ marks.length);
		
		for(int i=0;i<marks.length;i++)
		{
			System.out.println("Subject-"+(i+1)+" = "+ marks[i]);
		}
		
		System.out.println("Marks Obtained:");
		/*array iteration using enhanced for loop*/
		for(int mark : marks)
		{
		  System.out.print(mark+" | ");	
		}
		System.out.println();
		System.out.println(marks[6]); //java.lang.ArrayIndexOutOfBoundsException
	}
}
