class Employee 
{
	/* instance variables / member datas*/
	int empno;
	String name;
	float sal;

	public static void main(String[] args) 
	{
		/*create an object of Employee */
		Employee emp = new Employee();

		/* access the properties of employee*/
		System.out.println(emp.empno+" | "+emp.name+" | "+emp.sal);
	}
}
