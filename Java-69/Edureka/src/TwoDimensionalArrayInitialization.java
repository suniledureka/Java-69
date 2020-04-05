
public class TwoDimensionalArrayInitialization {

	public static void main(String[] args) {
		int[][] n = {{1,2,3},{4,5},{6,7,8,9}};
		System.out.println("Size of Array = "+ n.length);
		
		/* get size of each inner array */
		for(int i=0;i<n.length;i++) {
			System.out.println("Size of n["+i+"] = "+ n[i].length);
		}		
		
		/*display array contents in a matrix form*/
		for(int[] x : n)
		{
			for(int y : x)
			{
				System.out.print(y+"\t");
			}
			System.out.println();
		}
		System.out.println("--------------------");
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
