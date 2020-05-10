package co.edureka;

public class Student {
	private String name;

	public Student() {
		System.out.println("No argument constructor");
	}

	public Student(String name) {
		this.name = name;
		System.out.println("One Argument constructor");
	}

	public String getName() {
		System.out.println("Inside getName method");
		return this.name;
	}

	public void setName(String name) {
		System.out.println("Inside setName method");
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [" + name + "]";
	}
	
	public void myInit1() {
		System.out.println("User-defined init method-1");
	}
	public void myInit2() {
		System.out.println("User-defined init method-2");
	}
	
	public void myDestroy() {
		System.out.println("User-defined destructor..");
	}
}
