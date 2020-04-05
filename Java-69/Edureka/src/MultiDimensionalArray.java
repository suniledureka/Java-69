
public class MultiDimensionalArray {

	public static void main(String[] args) {
		int[][] n = new int[5][4];
		System.out.println("Size of Array = "+ n.length);
		
		/* get size of each inner array */
		for(int i=0;i<n.length;i++) {
			System.out.println("Size of n["+i+"] = "+ n[i].length);
		}
		
		/*display array contents in a matrix form */
		for(int i=0;i<n.length;i++)
		{
			for(int j=0;j<n[i].length;j++)
			{
			 System.out.print(n[i][j]+"\t");	
			}
			System.out.println();
		}
	}
}
