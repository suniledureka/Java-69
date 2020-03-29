import java.util.Scanner;

class ReportCard 
{
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) 
	{
		System.out.print("enter student name: ");
		String name = sc.nextLine();

		System.out.print("enter the no of subjects: ");
		int no = sc.nextInt();

		/* create an int array to store marks */
		int[] marks = new int[no];
		
		marksEntry(marks);
		
		printRC(name, marks);
	}

	static void marksEntry(int[] marks){
		for(int i=0;i<marks.length;i++){
			System.out.print("Mark for Subject-"+(i+1)+": ");
			marks[i] = sc.nextInt();
		}
	}

	static void printRC(String name, int[] marks){
		System.out.println("---------------------------------");
		System.out.println("\tREPORT CARD");
		System.out.println("NAME: "+name);
		System.out.println("---------------------------------");
		System.out.println("  SUBJECT\t MARKS");
		System.out.println("---------------------------------");
		int total = 0;
		for(int i=0;i<marks.length;i++){
			System.out.println("Subject-"+(i+1)+"\t   "+marks[i]);
			total = total+marks[i];
		}
		System.out.println("---------------------------------");
		float avg = ((float)total)/marks.length;
		//System.out.println("TOTAL: "+total+"\tAVERAGE: "+avg);
		System.out.printf("TOTAL: %d \tAVERAGE: %.2f \n",total,avg); //formatted output
		System.out.println("---------------------------------");
	}
}
