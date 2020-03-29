
public class ArrayCreation {

	public static void main(String[] args) {
		int[] marks = new int[7];
		marks[0] = 78;
		marks[1] = 89;
		System.out.println("Size of Array = "+ marks.length);
		
		for(int x : marks) {
			System.out.print(x+"   ");
		}
		System.out.println();
		
		boolean []status = new boolean[8];
		for(boolean stat : status) {
			System.out.print(stat+"   ");
		}
		System.out.println();
		
		String names[] =new String[10];
		for(String name : names) {
			System.out.print(name+"   ");
		}
	}

}
