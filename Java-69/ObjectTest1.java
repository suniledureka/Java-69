class Employee 
{
	/* instance variables / member datas*/
	int empno;
	String name;
	float sal;

	void setDetails(){
		empno = 102;
		name = "Pankaj";
		sal = 5000.5f;
	}

	void displayDetails(){
		System.out.println(empno+" | "+name+" | "+sal);
	}
}//class

class ObjectTest1
{
	public static void main(String[] args) 
	{
		/*create an object of Employee */
		Employee emp = new Employee();

		/* access the properties of employee*/
		System.out.println(emp.empno+" | "+emp.name+" | "+emp.sal);

		/* to assign values to member datas using reference*/
		emp.empno = 101;
		emp.name = "Sunil";
		emp.sal = 2500.5f;
		
		emp.displayDetails();

		/* to assign values to member datas using method*/
		emp.setDetails();

		emp.displayDetails();
	}
}
